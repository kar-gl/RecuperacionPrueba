/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recuperacion.controlador;

import com.mycompany.recuperacion.modelo.GestorProductos;
import com.mycompany.recuperacion.modelo.Producto;
import com.mycompany.recuperacion.vista.Vista;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class Controlador {
  private GestorProductos modelo;  
  private Vista vista;

    public Controlador(GestorProductos modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    private void agregarProducto(){
        String nombre = vista.getTxtfNombreProducto().getText().trim();
        String IdTexto = vista.getTxtfID().getText().trim();
        String precioTexto =vista.getTxtfPrecioProducto().getText().trim();
         
        if (IdTexto.isEmpty()) {
            JOptionPane.showMessageDialog(vista,"El ID es obligatorio.");
            return;
        }
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(vista,"El nombre es obligatorio.");
            return; 
        }
        if (precioTexto.isEmpty()) {
            JOptionPane.showMessageDialog(vista,"El precio es obligatorio.");
            return;  
        }


        
        try {
            int id = Integer.parseInt(IdTexto); //entero
            double precio = 0.0; 
             
            try{
                precio = Double.parseDouble(precioTexto);
            }catch(NumberFormatException e) {
                System.out.println("El precio debe ser un número válido.");
                return; 
            }
          
            Producto producto = new Producto( nombre, id,  precio, true); 
            modelo.agregarProducto(producto);

         
         } catch (NumberFormatException e) {
           
            System.out.println("El ID y el precio deben ser números válidos.");
        }
    }


   public void limpiarCampos() {
        vista.getTxtfNombreProducto().setText("");
        vista.getTxtfPrecioProducto().setText("");
        vista.getTxtfID().setText("");
        vista.getButtonGroup1().clearSelection();
        vista.getTxtfID().setText("");
        
      
    }

    private void mostrarDisponibles() {
        String productosDisponibles = modelo.obtenerProductosDisponibles();
        vista.getTxtaDisponibles().setText(productosDisponibles.isEmpty() ? "No hay productos disponibles." : productosDisponibles);
    }

    private void mostrarNoDisponibles() {
        String productosNoDisponibles = modelo.obtenerProductosNoDisponibles();
        vista.getTxtaNoDisponibles().setText(productosNoDisponibles.isEmpty() ? "No hay productos no disponibles." : productosNoDisponibles);
    }

    private void salir() {
        
      System.exit(0);
        }
    }

