package com.example.biodermaapp.entidades;

public class ClientePrueba {
    private String nomUsuario;
    private String password;
    private String correoElectronico;
    private String telefonoCelular;
    private Genero generoCliente;// para poder identificar que productos son para cada genero
    private String fechaNac;
    private String lugarResidencia;
    private int BioCoins;


    //Este es el constructor principal
    public ClientePrueba(String nomUsuario, String password, String correoElectronico,
                         String telefonoCelular, Genero generoCliente, String fechaNac, String lugarResidencia, int BioCoins) {
        this.nomUsuario = nomUsuario;
        this.password = password;
        this.correoElectronico = correoElectronico;
        this.telefonoCelular = telefonoCelular;
        this.generoCliente = generoCliente;
        this.fechaNac = fechaNac;
        this.lugarResidencia = lugarResidencia;
        this.BioCoins = BioCoins;
    }
    //este es el constructor simplificado
    public ClientePrueba(String nomUsuario, String password, String correoElectronico) {
        this.nomUsuario = nomUsuario;
        this.password = password;
        this.correoElectronico = correoElectronico;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Genero getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(Genero generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public int getBioCoins() {
        return BioCoins;
    }

    public void setBioCoins(int bioCoins) {
        BioCoins = bioCoins;
    }
}
