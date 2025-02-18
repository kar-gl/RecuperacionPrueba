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
    private ListarIU listar;
    private GestorProducto gestorProducto;

    public Controlador(Vista principal, ListarIU listar) {
        this.principal = principal;
        this.listar = listar;
        this.gestorProducto = new GestorProducto();
    }

    public void agregarProducto() {
        try {
            if (this.principal != null) {

                Producto producto = new Producto();
                producto.setNombre(principal.getNombre());
                producto.setPrecio(principal.getPrecio());
                producto.setDisponible(principal.isDisponible());
                String msm = gestorProducto.agregarProducto(producto);
                principal.error(msm);

            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Error controlado: " + e.getMessage());
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
                                + "Titulo:" + productos[i].getNombre() + "\n"
                                + "Estado:" + productos[i].isDisponible() + "\n";
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listar.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
}
