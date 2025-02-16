/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacion.modelo;



public class GestorProductos {

 private Producto[] productos;
    private int contador;

    public GestorProductos(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    }

    // agregar
    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        } else {
            System.out.println("No se puede agregar más productos,capacidad máxima alcanzada.");
        }
    }

    //  disponibles
    public String obtenerProductosDisponibles() {
        String disponibles = "";
        for (int i = 0; i < contador; i++) {
            if (productos[i].isDisponible()) {
                disponibles += productos[i].toString() + "\n";
            }
        }
        return disponibles;
    }

    //   no disponibles
    public String obtenerProductosNoDisponibles() {
        String noDisponibles = "";
        for (int i = 0; i < contador; i++) {
            if (!productos[i].isDisponible()) {
                noDisponibles += productos[i].toString() + "\n";
            }
        }
        return noDisponibles;
    }
}
