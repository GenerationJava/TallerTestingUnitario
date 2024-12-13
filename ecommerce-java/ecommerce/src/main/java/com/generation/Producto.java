package com.generation;

public class Producto {
    //Atributos
    private String nombre;
    private double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter
    public double getPrecio() {
        return precio;
    }
    
}
