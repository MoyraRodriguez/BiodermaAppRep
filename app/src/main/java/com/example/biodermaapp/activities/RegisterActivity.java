package com.example.biodermaapp.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.biodermaapp.R;
import com.example.biodermaapp.entidades.ClientePrueba;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    private EditText userET, passwordET,confirmpswET,emailET,txtFecha,txtTelefono;
    private Button ingresar, cancelar;
    private String pswError = "Debe de ingresar la misma contraseña y llenar ambas casillas.La contraseña debe tener entre 8 y 12 caracteres";
    private String userError = "El nombre de usuario debe tener entre 8 y 16 caracteres";
    private boolean pswrdOk = false;
    private boolean userOk = false;
    private boolean emailOk = false;
    private FirebaseAuth mAuth;
    private ProgressDialog  loadingBar;
    private CallbackManager mCallbackManager;
    private static final String TAG = "FACELOG";
    //escribimos el nombre de la nueva rama que vamos a crear
    private static final String USUARIO = "users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        InitializateFields();
        mAuth =  FirebaseAuth.getInstance();
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //llamamos al constructor cliente prueba y le pasamos los parametros creados
                ClientePrueba clientePrueba = new ClientePrueba(userET.getText().toString().trim(),
                        passwordET.getText().toString().trim(),emailET.getText().toString().trim(),txtFecha.getText().toString().trim(),txtTelefono.getText().toString().trim());

                //esto lo usamos para siempre para que la database funcione
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference reference = database.getReference(USUARIO);

                reference.push().setValue(clientePrueba);




                AceptUser();
                AceptEmail();
                AceptPassword();

                if(userOk && pswrdOk && emailOk){
                    CreateNewAcount();

                } else {
                    AceptUser();
                    AceptEmail();
                    AceptPassword();
                }
            }
        });

       FBLogin();

    }



    private void FBLogin() {
        // Initialize Facebook Login button
        mCallbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = findViewById(R.id.buttonFacebookLogin);
        loginButton.setReadPermissions("email", "public_profile");
        loginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d(TAG, "facebook:onSuccess:" + loginResult);
                handleFacebookAccessToken(loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {
                Log.d(TAG, "facebook:onCancel");
                // ...
            }

            @Override
            public void onError(FacebookException error) {
                Log.d(TAG, "facebook:onError", error);
                // ...
            }
        });
    }

    public void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();

      // if(currentUser != null) updateUI();
    }

    private void updateUI() {

        Toast.makeText(this, "Ya has iniciado sesion en Facebook", Toast.LENGTH_SHORT).show();
        Intent  change = new Intent(RegisterActivity.this, HomeActivity.class);
        startActivity(change);
        finish();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Pass the activity result back to the Facebook SDK
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }
    private void handleFacebookAccessToken(AccessToken token) {
        Log.d(TAG, "handleFacebookAccessToken:" + token);

        AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithCredential:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithCredential:failure", task.getException());
                            Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI();
                        }

                        // ...
                    }
                });
    }

    private void InitializateFields(){
        userET =  findViewById(R.id.textUsuario2);
        passwordET = findViewById(R.id.editTextContraseña);
        confirmpswET = findViewById(R.id.editTextContraseña2);
        emailET = findViewById(R.id.editTextCorreo);
        ingresar = findViewById(R.id.buttonIngresar);
        cancelar = findViewById(R.id.buttonCancelar);
        txtFecha = findViewById(R.id.txtFecha);
        txtTelefono = findViewById(R.id.txtCelular);
        loadingBar = new ProgressDialog(this);
    }
    private void AceptUser(){
        InitializateFields();
        if(userET.getText().toString().isEmpty()){
            userOk = false;
            Toast.makeText(this, "Rellene la casilla", Toast.LENGTH_SHORT).show();
        }
        else if (userET.getText().length()<=8&&userET.getText().length()>16) {
            userET.setError(userError);
            userOk = false;
        }

        else userOk = true;

    }
    private void AceptPassword(){
        InitializateFields();
        if(passwordET.getText().toString().isEmpty()||confirmpswET.getText().toString().isEmpty()){
            Toast.makeText(this, "Debe Llenar ambas Casillas", Toast.LENGTH_SHORT).show();
            pswrdOk = false;
        }
        else if(!passwordET.getText().toString().equals(confirmpswET.getText().toString())){
            confirmpswET.setError(pswError);
            pswrdOk = false;
        }
        else if(passwordET.getText().toString().length()<=8&& passwordET.getText().toString().length()>12 ) {
            passwordET.setError(pswError);
            pswrdOk = false;
        }
        else pswrdOk = true;
    }
    private void AceptEmail(){
        InitializateFields();
        if(emailET.getText().toString().isEmpty()) {
            Toast.makeText(this, "Inserte un correo", Toast.LENGTH_SHORT).show();
            emailOk = false;
        }
        else emailOk = true;
    }
    private void CreateNewAcount(){
        InitializateFields();
        String email = emailET.getEditableText().toString();
        String password = passwordET.getEditableText().toString();
        loadingBar.setTitle("Creando Cuenta...");
        loadingBar.setMessage("Espere por favor...");
        loadingBar.setCanceledOnTouchOutside(true);
        loadingBar.show();
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, "Cuenta creada satisfactoriamente", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();



                    startActivity(new Intent(RegisterActivity.this, HomeActivity.class));




                }else {
                    String mess = task.getException().toString();
                    Toast.makeText(RegisterActivity.this, "Error: " + mess, Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }
            }
        });
    }
}
