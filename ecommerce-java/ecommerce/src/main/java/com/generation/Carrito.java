package com.generation;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    //Atributo
    private List<Producto> productos = new ArrayList<>();

    //Declaramos los métodos
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularTotal() {
        return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public double aplicarDescuento(double porcentaje) {
        return this.calcularTotal() * (1 - porcentaje/100);
    }

    public boolean estaVacio() {
        return this.productos.isEmpty();
    }

    
    
}
