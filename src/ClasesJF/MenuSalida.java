/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesJF;

import ClasesJF.Admin.PrincipalAdmin;
import inventario.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class MenuSalida extends javax.swing.JFrame {

        //variables globales
    boolean valor = true;
    
    public MenuSalida() {
        initComponents();
        llenarBox();
        centrarJFrame();
        pasarfecha();
        mostraTabla("");
        deshabilitarTodo();
        bt_nuevoProducto.setEnabled(true);
        bt_eliminar.setEnabled(true);
        bt_modificar.setEnabled(true);
        bt_actualizar.setEnabled(false);        
    }

    //objetos
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    private String atributo = "id";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        box_filtro = new javax.swing.JComboBox<>();
        bt_buscar = new javax.swing.JButton();
        tf_buscar = new javax.swing.JTextField();
        tf_fechaSalida = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_costo = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_categoria = new javax.swing.JTextField();
        tf_descripcion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_destino = new javax.swing.JTextField();
        tf_nombreProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_idproducto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        dateCaledar = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        bt_actualiar_RC = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        bt_actualizar = new javax.swing.JButton();
        bt_limpiar_RC = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_nuevoProducto = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu de salidas");
        setPreferredSize(new java.awt.Dimension(1154, 673));

        jPanel2.setBackground(new java.awt.Color(255, 138, 101));

        jPanel8.setBackground(new java.awt.Color(255, 138, 101));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        bt_buscar.setBackground(new java.awt.Color(199, 91, 57));
        bt_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        tf_buscar.setBackground(new java.awt.Color(255, 187, 147));
        tf_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar)
                    .addComponent(tf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tf_fechaSalida.setBackground(new java.awt.Color(255, 187, 147));
        tf_fechaSalida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Costo");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Cantidad");

        tf_costo.setBackground(new java.awt.Color(255, 187, 147));
        tf_costo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_cantidad.setBackground(new java.awt.Color(255, 187, 147));
        tf_cantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Fecha salida");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Categoria");

        tf_categoria.setBackground(new java.awt.Color(255, 187, 147));
        tf_categoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_descripcion.setBackground(new java.awt.Color(255, 187, 147));
        tf_descripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Descripcion");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Destino");

        tf_destino.setBackground(new java.awt.Color(255, 187, 147));
        tf_destino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_nombreProducto.setBackground(new java.awt.Color(255, 187, 147));
        tf_nombreProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Nombre producto");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Id producto");

        tf_idproducto.setBackground(new java.awt.Color(255, 187, 147));
        tf_idproducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf_idproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idproductoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 138, 101));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de hoy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        dateCaledar.setBackground(new java.awt.Color(255, 187, 147));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(dateCaledar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dateCaledar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 138, 101));

        bt_actualiar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_actualiar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_actualiar_RC.setText("Actualizar tabla");
        bt_actualiar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualiar_RCActionPerformed(evt);
            }
        });

        bt_modificar.setBackground(new java.awt.Color(199, 91, 57));
        bt_modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_modificar.setText("Modificar");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });

        bt_actualizar.setBackground(new java.awt.Color(199, 91, 57));
        bt_actualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_actualizar.setText("Actualizar");
        bt_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualizarActionPerformed(evt);
            }
        });

        bt_limpiar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_limpiar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_limpiar_RC.setText("Limpiar campos");
        bt_limpiar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiar_RCActionPerformed(evt);
            }
        });

        bt_enviar.setBackground(new java.awt.Color(199, 91, 57));
        bt_enviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_enviar.setText("Enviar");
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });

        bt_eliminar.setBackground(new java.awt.Color(199, 91, 57));
        bt_eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_actualiar_RC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_limpiar_RC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(bt_actualiar_RC)
                .addGap(18, 18, 18)
                .addComponent(bt_enviar)
                .addGap(18, 18, 18)
                .addComponent(bt_modificar)
                .addGap(18, 18, 18)
                .addComponent(bt_actualizar)
                .addGap(18, 18, 18)
                .addComponent(bt_limpiar_RC)
                .addGap(18, 18, 18)
                .addComponent(bt_eliminar))
        );

        bt_nuevoProducto.setBackground(new java.awt.Color(102, 255, 102));
        bt_nuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_nuevoProducto.setText("Nueva salida");
        bt_nuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoProductoActionPerformed(evt);
            }
        });

        bt_cancelar.setBackground(new java.awt.Color(204, 0, 0));
        bt_cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_nuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(141, 141, 141)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(tf_idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bt_nuevoProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(24, 24, 24)
                                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabla.setForeground(new java.awt.Color(199, 91, 57));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        buscarTFconBOX();
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_actualiar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualiar_RCActionPerformed
        mostraTabla("");
    }//GEN-LAST:event_bt_actualiar_RCActionPerformed

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        // TODO add your handling code here:
        modificarDatos();
        bt_actualizar.setEnabled(true);
           bt_cancelar.setEnabled(true);
           bt_enviar.setEnabled(false);
           bt_eliminar.setEnabled(false);
           bt_nuevoProducto.setEnabled(false);
           bt_modificar.setEnabled(false); 
           bt_buscar.setEnabled(false); 
           tf_buscar.setEnabled(false); 
           habilitarTF();        
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        limpiarCampos();
        bt_nuevoProducto.setEnabled(true);
        bt_eliminar.setEnabled(true);
        bt_modificar.setEnabled(true);
        bt_actualizar.setEnabled(false);
        bt_cancelar.setEnabled(false);
        bt_buscar.setEnabled(true); 
        mostraTabla("");        
    }//GEN-LAST:event_bt_actualizarActionPerformed

    private void bt_limpiar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiar_RCActionPerformed
        limpiarCampos();

    }//GEN-LAST:event_bt_limpiar_RCActionPerformed

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        try {
            insertarDatos();
            actualizarNuevaCatindad();
            mostraTabla("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos", "Problema con los datos", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_bt_enviarActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void tf_idproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idproductoActionPerformed

    private void bt_nuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoProductoActionPerformed
        // TODO add your handling code here:
        habilitarTF();
        bt_cancelar.setEnabled(true);
        bt_enviar.setEnabled(true);
        bt_eliminar.setEnabled(false);
        bt_nuevoProducto.setEnabled(false);
        bt_modificar.setEnabled(false);
        bt_actualizar.setEnabled(false);
    }//GEN-LAST:event_bt_nuevoProductoActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        // TODO add your handling code here:
        deshabilitarTF();
        bt_cancelar.setEnabled(false);
        bt_enviar.setEnabled(false);
        bt_eliminar.setEnabled(true);
        bt_nuevoProducto.setEnabled(true);
        bt_modificar.setEnabled(true);
        bt_actualizar.setEnabled(false);
        bt_buscar.setEnabled(true);
        tf_buscar.setEnabled(true);
        limpiarCampos();

    }//GEN-LAST:event_bt_cancelarActionPerformed

        //deshabilitar tf
    private void deshabilitarTF(){
        tf_idproducto.setEnabled(false);
        tf_nombreProducto.setEnabled(false);
        tf_descripcion.setEnabled(false);
        tf_costo.setEnabled(false);
        tf_cantidad.setEnabled(false);
        tf_categoria.setEnabled(false);
        tf_destino.setEnabled(false);
        tf_fechaSalida.setEnabled(false);
        
    }
    
    //habilitar tf
        private void habilitarTF(){
            
        tf_fechaSalida.setEnabled(true);
        tf_destino.setEnabled(true);
        tf_idproducto.setEnabled(true);
        tf_nombreProducto.setEnabled(true);
        tf_descripcion.setEnabled(true);
        tf_costo.setEnabled(true);
        tf_cantidad.setEnabled(true);
        tf_categoria.setEnabled(true);
    }
        
            //deshabilitar botones inicio
    private void deshabilitarTodo(){
        bt_modificar.setEnabled(false);
        bt_actualizar.setEnabled(false);
        bt_eliminar.setEnabled(false);
        bt_cancelar.setEnabled(false);
        bt_enviar.setEnabled(false);
        bt_actualizar.setEnabled(false);
        bt_buscar.setEnabled(true);
        
        //tf
        tf_idproducto.setEnabled(false);
        tf_nombreProducto.setEnabled(false);
        tf_descripcion.setEnabled(false);
        tf_costo.setEnabled(false);
        tf_cantidad.setEnabled(false);
        tf_categoria.setEnabled(false);

        bt_modificar.setEnabled(false);
        bt_actualizar.setEnabled(false);
        bt_eliminar.setEnabled(false);
    //    bt_nuevoProducto.setEnabled(false);
        bt_cancelar.setEnabled(false);
    }
    
        //enviar la nueva cantidad a la tabla productos para sumar
    private void actualizarNuevaCatindad(){
                try {

            PreparedStatement pps = cn.prepareStatement("UPDATE productos SET cantidad = '" + sumarCantidades_S()
                    
                    + "' WHERE id_producto = '"
                            + obtenerIdProducto() +"'");
            pps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha cometido algun error");
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //sumar las cantidades
    private String sumarCantidades_S(){
            String total_S = "";
        try {
        obtenerIdProducto();
        
        String cantidadActual_S = obtenerCantidadActual(obtenerIdProducto());
        String cantidadNueva_S = obtenerCantidadNueva(obtenerIdProducto());
        
        
        int cantidadActual_I = Integer.parseInt(cantidadActual_S);
        int cantidadNueva_I = Integer.parseInt(cantidadNueva_S);
        int total_I = cantidadActual_I - cantidadNueva_I;

        total_S = String.valueOf(total_I);


        } catch (Exception ex) {
            valor = false;
            JOptionPane.showMessageDialog(null, "Asegurese que el producto este registrado en 'Registro/Consulta'");
            JOptionPane.showMessageDialog(null, "Es recomendable eliminar el ultimo registro para mejor fluidez");
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return total_S;
    }

    
    //obtener el id del ultimo producto registrado
    private String obtenerIdProducto(){
                //variables
        
        String id = "";
        String sql = "SELECT id_producto FROM salida";
        //fin
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                id = rs.getString(1);
                //cantidadInt = Integer.parseInt(id);
            }

            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }
    
    //obtener cantidad del ultimo dato registrado
    private String obtenerCantidadNueva(String id) {
        //variables
        int cantidadInt = 0;
        String cantidad = "";
        String sql = "SELECT cantidad FROM salida ";
        //fin
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cantidad = rs.getString(1);
               // cantidadInt = Integer.parseInt(cantidad);
            }

            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cantidad;
    }
    
    //obtener la cantida que tiene el producto ahora mismo
    private String obtenerCantidadActual(String id) {
        //variables
        String cantidad = "";
        String sql = "SELECT cantidad FROM productos where id_producto = '"+id +"'";
        //fin
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            
            while (rs.next()) {
                cantidad = rs.getString(1);
                //cantidadInt = Integer.parseInt(cantidad);
            }

            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cantidad;
    }
    
    
             //mostra la tabla
    private void mostraTabla(String valor){
         DefaultTableModel modelo = new DefaultTableModel();
            //agregar columnas
            modelo.addColumn("Id salida");
            modelo.addColumn("Id producto");
            modelo.addColumn("Nombre producto");
            modelo.addColumn("Destino");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Categoria");
            modelo.addColumn("Fecha salida");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Costo");
            tabla.setModel(modelo);
            //Fin
            
            //variables
            String sql = "";
            //fin
            
            //verificar que es SQL
            if(valor.equalsIgnoreCase("")){
                sql = "SELECT id_salida,id_producto,nom_producto,destino,descripcion,categoria,fecha_salida,cantidad, costo FROM salida";
            }else{
                sql = "SELECT id_salida,id_producto,nom_producto,destino,descripcion,categoria,fecha_salida,cantidad, costo FROM salida WHERE " +atributo +"=" +"'" +valor +"'";
            }
            //fin


            String datos[] = new String[10];
            Statement st;
            
             try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            

            
            //Agregar los reglones
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);             
                modelo.addRow(datos);
            }
            
            tabla.setModel(modelo);
            //Fin

           
            
            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
                            //eliminar datos
    private void eliminar() {
        int fila = tabla.getSelectedRow();
        String valor = tabla.getValueAt(fila, 0).toString();

        if (fila >= 0) {
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM salida WHERE  id_salida = '" + valor + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato eliminado");
                mostraTabla("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el dato");
                Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            
        }
    }
    
            //modificar datos
    private void modificarDatos() {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            tf_idproducto.setText(tabla.getValueAt(fila, 1).toString());
            tf_nombreProducto.setText(tabla.getValueAt(fila, 2).toString());
            tf_destino.setText(tabla.getValueAt(fila, 3).toString());
            tf_descripcion.setText(tabla.getValueAt(fila, 4).toString());
            tf_categoria.setText(tabla.getValueAt(fila, 5).toString());
            tf_fechaSalida.setText(tabla.getValueAt(fila, 6).toString());
            tf_cantidad.setText(tabla.getValueAt(fila, 7).toString());
            tf_costo.setText(tabla.getValueAt(fila, 8).toString());
            
            //para que se pueda modificar el id del usuario
            tf_buscar.setText(tabla.getValueAt(fila, 0).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada", "Desconocido", 3);
        }
    }
    
           //actualizar datos
    private void actualizarDatos() {
        
        try {
           
            //pasarTFaVariables();
            PreparedStatement pps = cn.prepareStatement("UPDATE salida SET id_producto = '" + tf_idproducto.getText()
                    + "',nom_producto = '"
                            + tf_nombreProducto.getText()
                    +"', destino = '"
                            +tf_destino.getText()
                    + "',descripcion = '"
                            + tf_descripcion.getText()
                    + "',categoria = '"
                            +tf_categoria.getText()
                    + "',fecha_salida = '"
                            +tf_fechaSalida.getText()
                    + "',cantidad = '"
                            +Integer.parseInt(tf_cantidad.getText())
                    + "',costo = '"
                            +Float.parseFloat(tf_costo.getText())                    
                    
                    + "' WHERE id_salida = '"
                            + tf_buscar.getText() +"'");
            pps.executeUpdate();
 
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha cometido algun error");
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
            
                //enviar los datos a la base de datos
    private void insertarDatos() {
            try {
                
                PreparedStatement ppt = cn.prepareStatement("INSERT INTO salida(id_producto,nom_producto,destino,descripcion,categoria,fecha_salida,cantidad,costo) VALUES (?,?,?,?,?,?,?,?)");
                ppt.setString(1, tf_idproducto.getText());
                ppt.setString(2, tf_nombreProducto.getText());
                ppt.setString(3, tf_destino.getText());
                ppt.setString(4, tf_descripcion.getText());
                ppt.setString(5, tf_categoria.getText());
                ppt.setString(6, tf_fechaSalida.getText());
                ppt.setInt(7, Integer.parseInt(tf_cantidad.getText()));
                ppt.setFloat(8, Float.parseFloat(tf_costo.getText()));
     
                ppt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos guardados");
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos", "Problema con los datos", JOptionPane.QUESTION_MESSAGE);
                Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
      //  }
    }
    
          //llenar el combo box del buscar
    private void llenarBox(){
        box_filtro.addItem("id_salida");
        box_filtro.addItem("id_producto");
        box_filtro.addItem("nom_producto");
        box_filtro.addItem("destino");
        box_filtro.addItem("descripcion");
        box_filtro.addItem("categoria");
        box_filtro.addItem("fecha_salida");
        box_filtro.addItem("cantidad");
        box_filtro.addItem("costo");
   
    }
    
        //buscar con el box
    private void buscarTFconBOX() {
        atributo = box_filtro.getSelectedItem().toString();
        mostraTabla(tf_buscar.getText());
    }
    
        //limpiar los campos
    private void limpiarCampos(){
        tf_costo.setText("");
        tf_buscar.setText("");
        tf_categoria.setText("");
        tf_fechaSalida.setText("");
        tf_descripcion.setText("");
        tf_cantidad.setText("");
        tf_idproducto.setText("");
        tf_nombreProducto.setText("");
        tf_destino.setText("");
        
    }
    
    //centra ventana
    private void centrarJFrame() {

        // Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //int height = pantalla.height;
        // int width = pantalla.width;
        setSize(1200, 701);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    //pasar la fecha al tf
    public void pasarfecha(){
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date fecha = new Date();
        dateCaledar.setDate(fecha);
        tf_fechaSalida.setText(dateFormat.format(fecha));
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_filtro;
    private javax.swing.JButton bt_actualiar_RC;
    private javax.swing.JButton bt_actualizar;
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_limpiar_RC;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_nuevoProducto;
    private com.toedter.calendar.JDateChooser dateCaledar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_buscar;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_categoria;
    private javax.swing.JTextField tf_costo;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_destino;
    private javax.swing.JTextField tf_fechaSalida;
    private javax.swing.JTextField tf_idproducto;
    private javax.swing.JTextField tf_nombreProducto;
    // End of variables declaration//GEN-END:variables
}
