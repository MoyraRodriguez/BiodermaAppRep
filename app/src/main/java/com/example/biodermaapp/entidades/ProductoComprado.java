package com.example.biodermaapp.entidades;

public class ProductoComprado extends ProductoComprable {
    private float precio;
    private int cantVecesComprado;

    public ProductoComprado(String nombreProducto, int imagen, String indicaciones, String beneficios, String informacion, String formato, GamaProducto gama, double descuentoProducto, double fechaLimiteDescuento, float precio, int cantVecesComprado) {
        super(nombreProducto, imagen, indicaciones, beneficios, informacion, formato, gama, descuentoProducto, fechaLimiteDescuento);
        this.precio = precio;
        this.cantVecesComprado = cantVecesComprado;
    }

    public ProductoComprado(String nombreProducto, int imagen, String informacion, float precio, int cantVecesComprado) {
        super(nombreProducto, imagen, informacion);
        this.precio = precio;
        this.cantVecesComprado = cantVecesComprado;
    }

    public ProductoComprado(String nombreProducto, int imagen, String informacion, GamaProducto gama, float precio, int cantVecesComprado) {
        super(nombreProducto, imagen, informacion, gama);
        this.precio = precio;
        this.cantVecesComprado = cantVecesComprado;
    }

    public ProductoComprado(String nombreProducto, int imagen, double descuentoProducto, double fechaLimiteDescuento, String informacion, float precio, int cantVecesComprado) {
        super(nombreProducto, imagen, descuentoProducto, fechaLimiteDescuento, informacion);
        this.precio = precio;
        this.cantVecesComprado = cantVecesComprado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantVecesComprado() {
        return cantVecesComprado;
    }

    public void setCantVecesComprado(int cantVecesComprado) {
        this.cantVecesComprado = cantVecesComprado;
    }
}
