/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacion.modelo;



public class GestorProducto {

 
    
    int tamanoVector = 5;
    Producto[] producto = new Producto[tamanoVector];
    int cont = 0;

    public String agregarProducto(Producto productos) {
        String msg = "Ingreso exitoso";
        if (producto.length  != cont) {
            for (int i = 0; i < producto.length; i++) {
                if (producto[i] == null) {
                    producto[i] = new Producto();
                    producto[i].setId(i);
                    producto[i].setNombre(productos.getNombre());
                    producto[i].setDisponible(productos.isDisponible());
                    cont++;
                     
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Producto[] listarProducto() {

        Producto[] auxProductos = new Producto[tamanoVector];
        for (int i = 0; i < cont; i++) {
            auxProductos[i] = new Producto();
            auxProductos[i].setId(producto[i].getId());
            auxProductos[i].setNombre(producto[i].getNombre());
            auxProductos[i].setDisponible(producto[i].isDisponible());
            System.out.println("Modelo-listarTarea" + auxProductos[i].isDisponible());
        }
        return auxProductos;
    }
    
}