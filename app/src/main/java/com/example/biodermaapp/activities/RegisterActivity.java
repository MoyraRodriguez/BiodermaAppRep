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
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText userET, passwordET,confirmpswET,emailET;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        InitializateFields();
        mAuth =  FirebaseAuth.getInstance();
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                //  handleFacebookAccessToken(loginResult.getAccessToken());
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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Pass the activity result back to the Facebook SDK
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }
    private void InitializateFields(){
        userET = findViewById(R.id.textUsuario2);
        passwordET = findViewById(R.id.editTextContraseña);
        confirmpswET = findViewById(R.id.editTextContraseña2);
        emailET = findViewById(R.id.editTextCorreo);
        ingresar = findViewById(R.id.buttonIngresar);
        cancelar = findViewById(R.id.buttonCancelar);
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
        String email = emailET.getText().toString();
        String password = passwordET.getText().toString();
        loadingBar.setTitle("Creando Cuenta...");
        loadingBar.setMessage("Espere por favor...");
        loadingBar.setCanceledOnTouchOutside(true);
        loadingBar.show();
        mAuth.createUserWithEmailAndPassword(password,email).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
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
