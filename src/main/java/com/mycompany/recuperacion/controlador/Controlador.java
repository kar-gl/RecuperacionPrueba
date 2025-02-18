/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacion.controlador;

import com.mycompany.recuperacion.modelo.GestorProducto;
import com.mycompany.recuperacion.modelo.Producto;

import com.mycompany.recuperacion.vista.ListarIU;

import com.mycompany.recuperacion.vista.Vista;



public class Controlador {

    private Vista principal;
    private ListarIU listaIU;
    private GestorProducto gestorProducto;

    public Controlador(Vista principal, ListarIU listar) {
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
     try {
            String msm = "";
            Producto[] productos = new Producto[5];
            productos = gestorProducto.listarProducto();
      if (productos != null) {
                String lista = "";
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i] != null) {
                        lista = lista + "id:" + productos[i].getId() + "\n"
                                + "Titulo:" + productos[i].getNombre()+ "\n"
                        
                                + "Estado:" + productos[i].isDisponible()+ "\n";
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listaIU.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
}

    

