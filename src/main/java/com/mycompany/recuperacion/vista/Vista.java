/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.recuperacion.vista;




import com.mycompany.recuperacion.controlador.Controlador;



public class Vista extends javax.swing.JFrame {
 private Controlador controlador;
 private ListarIU listaIU;
      
public Vista() {
        initComponents();
   
}
    // Código de inicialización Swing para crear la interfaz gráfica
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgEstado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfNombreProducto = new javax.swing.JTextField();
        txtfPrecioProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdbDisponible = new javax.swing.JRadioButton();
        rdbNoDisponible = new javax.swing.JRadioButton();
        bttAgregarProducto = new javax.swing.JButton();
        bttLimpiar = new javax.swing.JButton();
        bttSalir1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mntListaPro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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

        btgEstado.add(rdbDisponible);
        rdbDisponible.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        rdbDisponible.setText("DISPONIBLE");
        rdbDisponible.setBorderPainted(true);

        btgEstado.add(rdbNoDisponible);
        rdbNoDisponible.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        rdbNoDisponible.setText("NO DISPONIBLE");
        rdbNoDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNoDisponibleActionPerformed(evt);
            }
        });

        bttAgregarProducto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        bttAgregarProducto.setText("AGREGAR");
        bttAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarProductoActionPerformed(evt);
            }
        });

        bttLimpiar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        bttLimpiar.setText("LIMPIAR");
        bttLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimpiarActionPerformed(evt);
            }
        });

        bttSalir1.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        bttSalir1.setText("SALIR");
        bttSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalir1ActionPerformed(evt);
            }
        });

        jLabel8.setText("$");

        lblError.setText("------------------");

        jMenu1.setText("Menu");

        mntListaPro.setText("Lista de Productos");
        mntListaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntListaProActionPerformed(evt);
            }
        });
        jMenu1.add(mntListaPro);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(rdbDisponible))
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtfPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bttLimpiar)
                                            .addComponent(rdbNoDisponible)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(bttAgregarProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblError)
                            .addComponent(bttSalir1))))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbDisponible)
                    .addComponent(rdbNoDisponible))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAgregarProducto)
                    .addComponent(bttLimpiar))
                .addGap(53, 53, 53)
                .addComponent(lblError)
                .addGap(51, 51, 51)
                .addComponent(bttSalir1)
                .addGap(145, 145, 145))
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
  this.controlador.agregarProducto();
    }//GEN-LAST:event_bttAgregarProductoActionPerformed

    private void bttSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalir1ActionPerformed
         System.exit(0);

    
    }//GEN-LAST:event_bttSalir1ActionPerformed

    private void txtfNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreProductoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtfNombreProductoActionPerformed

    private void bttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimpiarActionPerformed

    limpiar();
                                             
      
    }//GEN-LAST:event_bttLimpiarActionPerformed
 public String getNombre() {
        // Obtener nombre desde el campo de texto
        return "";
    }

    public double getPrecio() {
        // Obtener precio desde el campo de texto
        return 0;
    }

    public boolean isDisponible() {
        // Obtener disponibilidad desde un checkbox u otro componente
        return false;
    }

    public void mostrarMensaje(String mensaje) {
        // Mostrar mensaje en la interfaz
    }   
    public void limpiar(){
    
     txtfNombreProducto.setText("");
     txtfPrecioProducto.setText("");
    } 
    
    private void mntListaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntListaProActionPerformed
    listaIU.setVisible(true);
    controlador.listarProductos();
    }//GEN-LAST:event_mntListaProActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgEstado;
    private javax.swing.JButton bttAgregarProducto;
    private javax.swing.JButton bttLimpiar;
    private javax.swing.JButton bttSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblError;
    private javax.swing.JMenuItem mntListaPro;
    private javax.swing.JRadioButton rdbDisponible;
    private javax.swing.JRadioButton rdbNoDisponible;
    private javax.swing.JTextField txtfNombreProducto;
    private javax.swing.JTextField txtfPrecioProducto;
    // End of variables declaration//GEN-END:variables

   
}