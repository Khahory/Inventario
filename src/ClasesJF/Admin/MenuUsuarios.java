/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesJF.Admin;

import inventario.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Angel
 */
public class MenuUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuarios
     */
    public MenuUsuarios() {
        initComponents();
        mostraTabla("");
        llenarBox();
        centrarJFrame();
        deshabilitarTodo();
    }

            //objetos
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    private String atributo = "id";
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_idusuario = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        tf_cedula = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_tipo = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_sueldo = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        box_filtro = new javax.swing.JComboBox<>();
        bt_buscar = new javax.swing.JButton();
        tf_buscar = new javax.swing.JTextField();
        bt_reporteUsuario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        bt_nuevoProducto = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bt_limpiar_RC = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_actualizar = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();
        bt_actualiar_RC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu de usuarios");
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tabla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabla.setForeground(new java.awt.Color(199, 91, 57));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel2.setBackground(new java.awt.Color(255, 138, 101));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Id usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cedula");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipo (0,1)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Edad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Sueldo");

        tf_idusuario.setBackground(new java.awt.Color(255, 187, 147));
        tf_idusuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_password.setBackground(new java.awt.Color(255, 187, 147));
        tf_password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_cedula.setBackground(new java.awt.Color(255, 187, 147));
        tf_cedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_nombre.setBackground(new java.awt.Color(255, 187, 147));
        tf_nombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_apellido.setBackground(new java.awt.Color(255, 187, 147));
        tf_apellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_telefono.setBackground(new java.awt.Color(255, 187, 147));
        tf_telefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_tipo.setBackground(new java.awt.Color(255, 187, 147));
        tf_tipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_edad.setBackground(new java.awt.Color(255, 187, 147));
        tf_edad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_sueldo.setBackground(new java.awt.Color(255, 187, 147));
        tf_sueldo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar)
                    .addComponent(tf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bt_reporteUsuario.setBackground(new java.awt.Color(199, 91, 57));
        bt_reporteUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_reporteUsuario.setText("Reporte Usuarios");
        bt_reporteUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reporteUsuarioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Gererar reporte");

        bt_nuevoProducto.setBackground(new java.awt.Color(102, 255, 102));
        bt_nuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_nuevoProducto.setText("Nuevo usuario");
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

        jPanel3.setBackground(new java.awt.Color(255, 138, 101));

        bt_limpiar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_limpiar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_limpiar_RC.setText("Limpiar campos");
        bt_limpiar_RC.setPreferredSize(new java.awt.Dimension(79, 23));
        bt_limpiar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiar_RCActionPerformed(evt);
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

        bt_actualizar.setBackground(new java.awt.Color(199, 91, 57));
        bt_actualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_actualizar.setText("Actualizar");
        bt_actualizar.setPreferredSize(new java.awt.Dimension(79, 23));
        bt_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualizarActionPerformed(evt);
            }
        });

        bt_modificar.setBackground(new java.awt.Color(199, 91, 57));
        bt_modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_modificar.setText("Modificar");
        bt_modificar.setPreferredSize(new java.awt.Dimension(79, 23));
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });

        bt_enviar.setBackground(new java.awt.Color(199, 91, 57));
        bt_enviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_enviar.setText("Enviar");
        bt_enviar.setPreferredSize(new java.awt.Dimension(79, 23));
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });

        bt_actualiar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_actualiar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_actualiar_RC.setText("Actualizar tabla");
        bt_actualiar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualiar_RCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_enviar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(bt_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_actualiar_RC))
                    .addComponent(bt_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_limpiar_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_actualiar_RC))
                .addGap(18, 18, 18)
                .addComponent(bt_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_eliminar)
                .addGap(18, 18, 18)
                .addComponent(bt_limpiar_RC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bt_limpiar_RC.getAccessibleContext().setAccessibleDescription("");
        bt_eliminar.getAccessibleContext().setAccessibleDescription("");
        bt_actualizar.getAccessibleContext().setAccessibleDescription("");
        bt_modificar.getAccessibleContext().setAccessibleDescription("");
        bt_enviar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_idusuario)
                    .addComponent(tf_password)
                    .addComponent(tf_cedula)
                    .addComponent(tf_nombre)
                    .addComponent(tf_apellido)
                    .addComponent(tf_telefono)
                    .addComponent(tf_tipo)
                    .addComponent(tf_edad)
                    .addComponent(tf_sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bt_nuevoProducto)
                                .addGap(18, 18, 18)
                                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(32, 32, 32))
                            .addComponent(bt_reporteUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(bt_nuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_reporteUsuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        buscarTFconBOX();
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_limpiar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiar_RCActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bt_limpiar_RCActionPerformed

    private void bt_actualiar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualiar_RCActionPerformed
        mostraTabla("");
    }//GEN-LAST:event_bt_actualiar_RCActionPerformed

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        insertarDatos();
        mostraTabla("");
    }//GEN-LAST:event_bt_enviarActionPerformed

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
        mostraTabla("");          
        
    }//GEN-LAST:event_bt_actualizarActionPerformed

    private void bt_reporteUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reporteUsuarioActionPerformed
        // TODO add your handling code here:
        makeReportUsuarios();
    }//GEN-LAST:event_bt_reporteUsuarioActionPerformed

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
        tf_idusuario.setEnabled(false);
        tf_password.setEnabled(false);
        tf_cedula.setEnabled(false);
        tf_nombre.setEnabled(false);
        tf_apellido.setEnabled(false);
        tf_telefono.setEnabled(false);
        tf_tipo.setEnabled(false);
        tf_edad.setEnabled(false);
        tf_sueldo.setEnabled(false);
    }
    
    //habilitar tf
        private void habilitarTF(){
        tf_idusuario.setEnabled(true);
        tf_password.setEnabled(true);
        tf_cedula.setEnabled(true);
        tf_nombre.setEnabled(true);
        tf_apellido.setEnabled(true);
        tf_telefono.setEnabled(true);
        tf_tipo.setEnabled(true);
        tf_edad.setEnabled(true);
        tf_sueldo.setEnabled(true);
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
        tf_idusuario.setEnabled(false);
        tf_password.setEnabled(false);
        tf_cedula.setEnabled(false);
        tf_nombre.setEnabled(false);
        tf_apellido.setEnabled(false);
        tf_telefono.setEnabled(false);
        tf_tipo.setEnabled(false);
        tf_edad.setEnabled(false);
        tf_sueldo.setEnabled(false);

        bt_modificar.setEnabled(true);
        bt_actualizar.setEnabled(false);
        bt_eliminar.setEnabled(true);
    //    bt_nuevoProducto.setEnabled(false);
        bt_cancelar.setEnabled(false);
    }        
    
     //mostra la tabla
        private void mostraTabla(String valor){
         DefaultTableModel modelo = new DefaultTableModel();
            //agregar columnas
            modelo.addColumn("Id");
            modelo.addColumn("Password");
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            modelo.addColumn("Tipo");
            modelo.addColumn("Edad");
            modelo.addColumn("Sueldo");
            tabla.setModel(modelo);
            //Fin
            
            //variables
            String sql = "";
            //fin
            
            //verificar que es SQL
            if(valor.equalsIgnoreCase("")){
                sql = "SELECT id_user,password,cedula,nombre,apellido,telefono, tipo, edad, sueldo FROM usuarios";
            }else{
                sql = "SELECT id_user,password,cedula,nombre,apellido,telefono, tipo, edad, sueldo FROM usuarios WHERE " +atributo +"=" +"'" +valor +"'";
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
                PreparedStatement pps = cn.prepareStatement("DELETE FROM usuarios WHERE  id_user = '" + valor + "'");
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
            tf_idusuario.setText(tabla.getValueAt(fila, 0).toString());
            tf_password.setText(tabla.getValueAt(fila, 1).toString());
            tf_cedula.setText(tabla.getValueAt(fila, 2).toString());
            tf_nombre.setText(tabla.getValueAt(fila, 3).toString());
            tf_apellido.setText(tabla.getValueAt(fila, 4).toString());
            tf_telefono.setText(tabla.getValueAt(fila, 5).toString());
            tf_tipo.setText(tabla.getValueAt(fila, 6).toString());
            tf_edad.setText(tabla.getValueAt(fila, 7).toString());
            tf_sueldo.setText(tabla.getValueAt(fila, 8).toString());
            
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
            PreparedStatement pps = cn.prepareStatement("UPDATE usuarios SET id_user = '" + tf_idusuario.getText()
                    + "',password = '"
                            + tf_password.getText()
                    +"', cedula = '"
                            +tf_cedula.getText()
                    + "',nombre = '"
                            + tf_nombre.getText()
                    + "',apellido = '"
                            +tf_apellido.getText()
                    + "',telefono = '"
                            +Integer.parseInt(tf_telefono.getText())
                    + "',tipo = '"
                            +Integer.parseInt(tf_tipo.getText())
                    + "',edad = '"
                            +Integer.parseInt(tf_edad.getText())
                    + "',sueldo = '"
                            +Float.parseFloat(tf_edad.getText())                    
                    
                    + "' WHERE id_user = '"
                            + tf_buscar.getText() +"'");
            pps.executeUpdate();
 
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha cometido algun error");
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
          //llenar el combo box del buscar
    private void llenarBox(){
        box_filtro.addItem("id_user");
        box_filtro.addItem("cedula");
        box_filtro.addItem("nombre");
        box_filtro.addItem("apellido");
        box_filtro.addItem("telefono");
        box_filtro.addItem("tipo");
        box_filtro.addItem("edad");
        box_filtro.addItem("sueldo");
   
    }
    

        
                //enviar los datos a la base de datos
    private void insertarDatos() {
       // if (probarCamposVacios() == true) {
            //pasarTFaVariables();
            try {
                PreparedStatement ppt = cn.prepareStatement("INSERT INTO usuarios(id_user,password,cedula,nombre,apellido,telefono,tipo,edad,sueldo) VALUES (?,?,?,?,?,?,?,?,?)");
                ppt.setString(1, tf_idusuario.getText());
                ppt.setString(2, tf_password.getText());
                ppt.setString(3, tf_cedula.getText());
                ppt.setString(4, tf_nombre.getText());
                ppt.setString(5, tf_apellido.getText());
                ppt.setInt(6, Integer.parseInt(tf_telefono.getText()));
                ppt.setInt(7, Integer.parseInt(tf_tipo.getText()));
                ppt.setInt(8, Integer.parseInt(tf_edad.getText()));
                ppt.setFloat(9, Integer.parseInt(tf_sueldo.getText()));
     
                ppt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos guardados");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos", "Problema con los datos", JOptionPane.QUESTION_MESSAGE);
                Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
      //  }
    }
    
    //buscar con el box
    private void buscarTFconBOX() {
        atributo = box_filtro.getSelectedItem().toString();
        mostraTabla(tf_buscar.getText());
    }
    
        //limpiar los campos
    private void limpiarCampos(){
        tf_apellido.setText("");
        tf_buscar.setText("");
        tf_cedula.setText("");
        tf_edad.setText("");
        tf_idusuario.setText("");
        tf_nombre.setText("");
        tf_password.setText("");
        tf_tipo.setText("");
        tf_telefono.setText("");
        tf_sueldo.setText("");
        
    }
    
        //centra ventana
      private void centrarJFrame(){
 
     // Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
      //int height = pantalla.height;
     // int width = pantalla.width;
     //1172, 634
      setSize(1172 , 734 );		
 
      setLocationRelativeTo(null);		
      setVisible(true);
  }
      
      //reporte usuarios
          private void makeReportUsuarios() {
        try {
            //crear reporte
            JasperReport reporte = JasperCompileManager.compileReport("ReporteUsuario.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, this.cn);

            //esto hace que cierre solo la ventana del reporte
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton bt_reporteUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_buscar;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_idusuario;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_sueldo;
    private javax.swing.JTextField tf_telefono;
    private javax.swing.JTextField tf_tipo;
    // End of variables declaration//GEN-END:variables
}
