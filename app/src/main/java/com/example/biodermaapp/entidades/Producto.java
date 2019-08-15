package com.example.biodermaapp.entidades;

public class Producto {

    private String nombreProducto;
    private String urlImagen;
    private int imagen;
    private String indicaciones;
    private String beneficios;
    private String informacion;
    private String formato;
    private GamaProducto gama;
    private double costoProducto;


    public Producto(String nombreProducto, String urlImagen, int imagen, String indicaciones,
                    String beneficios, String informacion, String formato, GamaProducto gama, double costoProducto) {
        this.nombreProducto = nombreProducto;
        this.urlImagen = urlImagen;
        this.imagen = imagen;
        this.indicaciones = indicaciones;
        this.beneficios = beneficios;
        this.informacion = informacion;
        this.formato = formato;
        this.gama = gama;
        this.costoProducto = costoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public GamaProducto getGama() {
        return gama;
    }

    public void setGama(GamaProducto gama) {
        this.gama = gama;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }
}
