/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacion.modelo;



public class GestorProducto {

    private Producto[] productos = new Producto[5];
    private int cont = 0;

    public String agregarProducto(Producto producto) {
        if (cont < productos.length) {
            productos[cont] = producto;
            cont++;
            return "Producto agregado exitosamente!";
        } else {
            return "No se pueden agregar más productos, el almacenamiento está lleno.";
        }
    }

    public Producto[] listarProductos() {
        return productos;
    }
}
