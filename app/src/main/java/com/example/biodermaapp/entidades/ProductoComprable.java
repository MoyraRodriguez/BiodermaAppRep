package com.example.biodermaapp.entidades;

public class ProductoComprable {

    private String nombreProducto;
    private String urlImagen;
    private int imagen;
    private String indicaciones;
    private String beneficios;
    private String informacion;
    private String formato;
    private GamaProducto gama;
    private double costoProducto;
    private double descuentoProducto;
    private double fechaLimiteDescuento;
    private String consejos;


    public ProductoComprable(String nombreProducto, int imagen, String indicaciones, String beneficios, String informacion,
                             String formato, GamaProducto gama, double descuentoProducto, double fechaLimiteDescuento) {
        this.nombreProducto = nombreProducto;

        this.imagen = imagen;
        this.indicaciones = indicaciones;
        this.beneficios = beneficios;
        this.informacion = informacion;
        this.formato = formato;
        this.gama = gama;
        this.descuentoProducto = descuentoProducto;
        this.fechaLimiteDescuento = fechaLimiteDescuento;
    }

    public ProductoComprable(String nombreProducto, int imagen, String informacion) {
        this.nombreProducto = nombreProducto;
        this.imagen = imagen;
        this.informacion = informacion;
    }

    public ProductoComprable(String nombreProducto, int imagen, String informacion, GamaProducto gama) {
        this.nombreProducto = nombreProducto;
        this.imagen = imagen;
        this.informacion = informacion;
        this.gama = gama;
    }

    public ProductoComprable(String nombreProducto, int imagen,double descuentoProducto, double fechaLimiteDescuento, String informacion) {
        this.nombreProducto = nombreProducto;
        this.imagen = imagen;
        this.descuentoProducto = descuentoProducto;
        this.fechaLimiteDescuento = fechaLimiteDescuento;
        this.informacion = informacion;
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

    public double getDescuentoProducto() {
        return descuentoProducto;
    }

    public void setDescuentoProducto(double descuentoProducto) {
        this.descuentoProducto = descuentoProducto;
    }

    public double getFechaLimiteDescuento() {
        return fechaLimiteDescuento;
    }

    public void setFechaLimiteDescuento(double fechaLimiteDescuento) {
        this.fechaLimiteDescuento = fechaLimiteDescuento;
    }

    public String getConsejos() {
        return consejos;
    }

    public void setConsejos(String consejos) {
        this.consejos = consejos;
    }
}
