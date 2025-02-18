/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacion.controlador;

import com.mycompany.recuperacion.modelo.GestorProducto;
import com.mycompany.recuperacion.modelo.Producto;

import com.mycompany.recuperacion.vista.ListarIU;

import com.mycompany.recuperacion.vista.Vista;



/**
 *
 * @author Usuario
 */

public class Controlador {

    private Vista principal;
    private ListarIU listaIU;
    private GestorProducto gestorProducto;

    public Controlador() {
        this.principal = principal;
        this.listaIU = listaIU;
        this.gestorProducto = new GestorProducto();
    }

    public void agregarProducto() {
        try {
            Producto producto = new Producto();
            producto.setNombre(principal.getNombre());
            producto.setPrecio(principal.getPrecio());
            producto.setDisponible(principal.isDisponible());

            String mensaje = gestorProducto.agregarProducto(producto);
            principal.mostrarMensaje(mensaje);
        } catch (Exception e) {
            principal.mostrarMensaje("Error: " + e.getMessage());
        }
    }

    public void listarProductos() {
        Producto[] productos = gestorProducto.listarProductos();
        StringBuilder lista = new StringBuilder();

        for (Producto producto : productos) {
            if (producto != null) {
                lista.append("ID: ").append(producto.getId()).append("\n")
                     .append("Nombre: ").append(producto.getNombre()).append("\n")
                     .append("Precio: ").append(producto.getPrecio()).append("\n")
                     .append("Disponible: ").append(producto.isDisponible()).append("\n\n");
            }
        }

        listaIU.mostrarDatos(lista.toString());
    }
}
