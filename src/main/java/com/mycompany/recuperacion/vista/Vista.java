/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.recuperacion.vista;


import com.mycompany.recuperacion.controlador.Controlador;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Usuario
 */
public class Vista extends javax.swing.JFrame {
private Scanner scanner;
private Controlador controlador;

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    /**
     * Creates new form Vista
     */
    public Vista() {
        scanner= new Scanner(System.in);
        initComponents();
  

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfNombreProducto = new javax.swing.JTextField();
        txtfPrecioProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdbDisponible = new javax.swing.JRadioButton();
        rdbNoDisponible = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bttAgregarProducto = new javax.swing.JButton();
        bttCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaDisponibles = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaNoDisponibles = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtfID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel1.setText("GESTOR DE PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE DEL PRODUCTO:");

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel3.setText("PRECIO DEL PRODUCTO:");

        txtfNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreProductoActionPerformed(evt);
            }
        });

        txtfPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPrecioProductoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel4.setText("DISPONIBILIDAD:");

        buttonGroup1.add(rdbDisponible);
        rdbDisponible.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        rdbDisponible.setText("DISPONIBLE");
        rdbDisponible.setBorderPainted(true);

        buttonGroup1.add(rdbNoDisponible);
        rdbNoDisponible.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        rdbNoDisponible.setText("NO DISPONIBLE");
        rdbNoDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNoDisponibleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel5.setText("LISTA DE PRODUCTOS");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("DISPONIBLES");

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("NO DISPONIBLES");

        bttAgregarProducto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        bttAgregarProducto.setText("AGREGAR");
        bttAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarProductoActionPerformed(evt);
            }
        });

        bttCancelar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        bttCancelar.setText("CANCELAR");
        bttCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("$");

        txtaDisponibles.setColumns(20);
        txtaDisponibles.setRows(5);
        jScrollPane3.setViewportView(txtaDisponibles);

        txtaNoDisponibles.setColumns(20);
        txtaNoDisponibles.setRows(5);
        jScrollPane4.setViewportView(txtaNoDisponibles);

        jLabel9.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel9.setText("ID DEL PRODUCTO:");

        txtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel6)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(bttAgregarProducto)))
                                .addGap(90, 90, 90)
                                .addComponent(bttCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(rdbDisponible)
                                .addGap(51, 51, 51)
                                .addComponent(rdbNoDisponible))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdbDisponible)
                    .addComponent(rdbNoDisponible))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCancelar)
                    .addComponent(bttAgregarProducto))
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPrecioProductoActionPerformed

    private void rdbNoDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNoDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNoDisponibleActionPerformed

    private void bttAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarProductoActionPerformed
    String nombre = txtfNombreProducto.getText();
    String precio = txtfPrecioProducto.getText();
    String Id = txtfID.getText();
    boolean disponible = rdbDisponible.isSelected();
    
     if (disponible) {
        txtaDisponibles.append("Nombre:"+nombre +"," + " Su precio es: $ " + precio + ", " + "ID:"+ Id);
    } else {
        txtaNoDisponibles.append("Nombre:"+nombre +"," + " Su precio es: $ " + precio + "," +"ID:"+ Id);
    }
    txtfNombreProducto.setText("");
    txtfPrecioProducto.setText("");
    buttonGroup1.clearSelection();
    }//GEN-LAST:event_bttAgregarProductoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtfNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreProductoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtfNombreProductoActionPerformed

    private void bttCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarActionPerformed
 if (controlador != null) {
        controlador.limpiarCampos ();
 }
    }//GEN-LAST:event_bttCancelarActionPerformed

    private void txtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIDActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAgregarProducto;
    private javax.swing.JButton bttCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rdbDisponible;
    private javax.swing.JRadioButton rdbNoDisponible;
    private javax.swing.JTextArea txtaDisponibles;
    private javax.swing.JTextArea txtaNoDisponibles;
    private javax.swing.JTextField txtfID;
    private javax.swing.JTextField txtfNombreProducto;
    private javax.swing.JTextField txtfPrecioProducto;
    // End of variables declaration//GEN-END:variables

    public Scanner getScanner() {
        return scanner;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public JButton getBttAgregarProducto() {
        return bttAgregarProducto;
    }

    public JButton getBttCancelar() {
        return bttCancelar;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public JRadioButton getRdbDisponible() {
        return rdbDisponible;
    }

    public JRadioButton getRdbNoDisponible() {
        return rdbNoDisponible;
    }

    public JTextArea getTxtaDisponibles() {
        return txtaDisponibles;
    }

    public JTextArea getTxtaNoDisponibles() {
        return txtaNoDisponibles;
    }

    public JTextField getTxtfID() {
        return txtfID;
    }

    public JTextField getTxtfNombreProducto() {
        return txtfNombreProducto;
    }

    public JTextField getTxtfPrecioProducto() {
        return txtfPrecioProducto;
    }


}