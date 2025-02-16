/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recuperacion;

import com.mycompany.recuperacion.controlador.Controlador;
import com.mycompany.recuperacion.modelo.GestorProductos;
import com.mycompany.recuperacion.vista.Vista;

/**
 *
 * @author Usuario
 */
public class Recuperacion {

    public static void main(String[] args) {
        
        Vista vista = new Vista();
        GestorProductos modelo = new GestorProductos(10);


        Controlador controlador = new Controlador(modelo, vista);
         
        vista.setControlador(controlador);
        vista.setVisible(true);
    }
} 
    

