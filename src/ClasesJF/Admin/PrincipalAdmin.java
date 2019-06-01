/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesJF.Admin;

import ClasesJF.Login;
import ClasesJF.MenuEntrada;
import ClasesJF.MenuSalida;
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
public class PrincipalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalAdmin() {
        initComponents();
        mostraTabla("");
        llenarBox();
        centrarJFrame();
        deshabilitarTodo();
        bt_nuevoProducto.setEnabled(true);
        bt_eliminar_RC.setEnabled(true);
        bt_modificar_RC.setEnabled(true);
        bt_actualizar_RC.setEnabled(false);
        label_user.setText("Usuario ingresado: " +Login.id);
    }

        //objetos
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    private String atributo = "id";
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Panel_registro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombre_RC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_descripcion_RC = new javax.swing.JTextArea();
        tf_costo_RC = new javax.swing.JTextField();
        tf_cantidad_RC = new javax.swing.JTextField();
        tf_categoria_RC = new javax.swing.JTextField();
        panel_bt_modifcar = new javax.swing.JPanel();
        bt_modificar_RC = new javax.swing.JButton();
        bt_actualizar_RC = new javax.swing.JButton();
        panel_bt_buscar = new javax.swing.JPanel();
        box_filtro_RC = new javax.swing.JComboBox<>();
        bt_buscar_RC = new javax.swing.JButton();
        tf_buscar_RC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_idproducto_RC = new javax.swing.JTextField();
        panel_bt_nuevo = new javax.swing.JPanel();
        bt_eliminar_RC = new javax.swing.JButton();
        bt_mostraTabla_RC = new javax.swing.JButton();
        bt_limpiar_RC = new javax.swing.JButton();
        bt_enviar_RC = new javax.swing.JButton();
        bt_nuevoProducto = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_RC = new javax.swing.JTable();
        bt_salidas_RC = new javax.swing.JButton();
        bt_usuarios_RC = new javax.swing.JButton();
        bt_entradas_RC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        bt_reporteSalida = new javax.swing.JButton();
        bt_reporteEntrada = new javax.swing.JButton();
        bt_reporteProducto = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        label_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal (Administrador)");
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 187, 147));

        jTabbedPane2.setBackground(new java.awt.Color(199, 91, 57));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 138, 101));

        Panel_registro.setBackground(new java.awt.Color(255, 138, 101));
        Panel_registro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro y consulta de producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Costo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("categoria");

        tf_nombre_RC.setBackground(new java.awt.Color(255, 187, 147));
        tf_nombre_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_descripcion_RC.setBackground(new java.awt.Color(255, 187, 147));
        tf_descripcion_RC.setColumns(20);
        tf_descripcion_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf_descripcion_RC.setLineWrap(true);
        tf_descripcion_RC.setRows(5);
        jScrollPane1.setViewportView(tf_descripcion_RC);

        tf_costo_RC.setBackground(new java.awt.Color(255, 187, 147));
        tf_costo_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_cantidad_RC.setBackground(new java.awt.Color(255, 187, 147));
        tf_cantidad_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tf_categoria_RC.setBackground(new java.awt.Color(255, 187, 147));
        tf_categoria_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        panel_bt_modifcar.setBackground(new java.awt.Color(255, 138, 101));
        panel_bt_modifcar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar/Actualizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        bt_modificar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_modificar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_modificar_RC.setText("Modificar datos");
        bt_modificar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificar_RCActionPerformed(evt);
            }
        });

        bt_actualizar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_actualizar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_actualizar_RC.setText("Actualizar datos");
        bt_actualizar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actualizar_RCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_bt_modifcarLayout = new javax.swing.GroupLayout(panel_bt_modifcar);
        panel_bt_modifcar.setLayout(panel_bt_modifcarLayout);
        panel_bt_modifcarLayout.setHorizontalGroup(
            panel_bt_modifcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bt_modifcarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_modificar_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_actualizar_RC, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_bt_modifcarLayout.setVerticalGroup(
            panel_bt_modifcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bt_modifcarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_bt_modifcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_modificar_RC)
                    .addComponent(bt_actualizar_RC))
                .addContainerGap())
        );

        panel_bt_buscar.setBackground(new java.awt.Color(255, 138, 101));
        panel_bt_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        bt_buscar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_buscar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_buscar_RC.setText("Buscar");
        bt_buscar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscar_RCActionPerformed(evt);
            }
        });

        tf_buscar_RC.setBackground(new java.awt.Color(255, 187, 147));
        tf_buscar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout panel_bt_buscarLayout = new javax.swing.GroupLayout(panel_bt_buscar);
        panel_bt_buscar.setLayout(panel_bt_buscarLayout);
        panel_bt_buscarLayout.setHorizontalGroup(
            panel_bt_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bt_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box_filtro_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_buscar_RC, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bt_buscar_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_bt_buscarLayout.setVerticalGroup(
            panel_bt_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bt_buscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_bt_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_filtro_RC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar_RC)
                    .addComponent(tf_buscar_RC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID");

        tf_idproducto_RC.setBackground(new java.awt.Color(255, 187, 147));
        tf_idproducto_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        panel_bt_nuevo.setBackground(new java.awt.Color(255, 138, 101));

        bt_eliminar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_eliminar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_eliminar_RC.setText("Eliminar datos");
        bt_eliminar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminar_RCActionPerformed(evt);
            }
        });

        bt_mostraTabla_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_mostraTabla_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_mostraTabla_RC.setText("Actualizar tabla");
        bt_mostraTabla_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mostraTabla_RCActionPerformed(evt);
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

        bt_enviar_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_enviar_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_enviar_RC.setText("Enviar datos");
        bt_enviar_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviar_RCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_bt_nuevoLayout = new javax.swing.GroupLayout(panel_bt_nuevo);
        panel_bt_nuevo.setLayout(panel_bt_nuevoLayout);
        panel_bt_nuevoLayout.setHorizontalGroup(
            panel_bt_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bt_nuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_bt_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_enviar_RC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_limpiar_RC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_mostraTabla_RC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_eliminar_RC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_bt_nuevoLayout.setVerticalGroup(
            panel_bt_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bt_nuevoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_mostraTabla_RC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_enviar_RC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_limpiar_RC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_eliminar_RC))
        );

        bt_nuevoProducto.setBackground(new java.awt.Color(102, 255, 102));
        bt_nuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_nuevoProducto.setText("Nuevo producto");
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

        javax.swing.GroupLayout Panel_registroLayout = new javax.swing.GroupLayout(Panel_registro);
        Panel_registro.setLayout(Panel_registroLayout);
        Panel_registroLayout.setHorizontalGroup(
            Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_registroLayout.createSequentialGroup()
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_categoria_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(tf_costo_RC)
                                .addComponent(tf_cantidad_RC)
                                .addComponent(tf_nombre_RC, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_idproducto_RC, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_registroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_bt_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_nuevoProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_bt_modifcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_bt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Panel_registroLayout.setVerticalGroup(
            Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_registroLayout.createSequentialGroup()
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_registroLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_nombre_RC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(tf_idproducto_RC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_nuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_registroLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_bt_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_bt_modifcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_bt_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_registroLayout.createSequentialGroup()
                        .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_registroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_cantidad_RC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(Panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_categoria_RC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(tf_costo_RC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );

        tabla_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabla_RC.setForeground(new java.awt.Color(199, 91, 57));
        tabla_RC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_RC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tabla_RC);

        bt_salidas_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_salidas_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_salidas_RC.setText("Menu Salidas");
        bt_salidas_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salidas_RCActionPerformed(evt);
            }
        });

        bt_usuarios_RC.setBackground(new java.awt.Color(153, 255, 153));
        bt_usuarios_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_usuarios_RC.setText("Menu usuarios");
        bt_usuarios_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_usuarios_RCActionPerformed(evt);
            }
        });

        bt_entradas_RC.setBackground(new java.awt.Color(199, 91, 57));
        bt_entradas_RC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_entradas_RC.setText("Menu Entrada");
        bt_entradas_RC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entradas_RCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_salidas_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_entradas_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_usuarios_RC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_salidas_RC)
                        .addGap(18, 18, 18)
                        .addComponent(bt_entradas_RC)
                        .addGap(269, 269, 269)
                        .addComponent(bt_usuarios_RC))
                    .addComponent(Panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Registro/Consulta", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 138, 101));

        jPanel13.setBackground(new java.awt.Color(255, 138, 101));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generar reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 138, 101));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Reporte de los productos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Reporte de las entradas al inventario");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Reporte de las salidas dell inventario");

        jPanel11.setBackground(new java.awt.Color(255, 138, 101));

        bt_reporteSalida.setBackground(new java.awt.Color(255, 187, 147));
        bt_reporteSalida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_reporteSalida.setText("Reporte Salida");
        bt_reporteSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reporteSalidaActionPerformed(evt);
            }
        });

        bt_reporteEntrada.setBackground(new java.awt.Color(255, 187, 147));
        bt_reporteEntrada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_reporteEntrada.setText("Reporte Entrada");
        bt_reporteEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reporteEntradaActionPerformed(evt);
            }
        });

        bt_reporteProducto.setBackground(new java.awt.Color(255, 187, 147));
        bt_reporteProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_reporteProducto.setText("Reporte Productos");
        bt_reporteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reporteProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_reporteProducto)
                    .addComponent(bt_reporteSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_reporteEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(bt_reporteProducto)
                .addGap(62, 62, 62)
                .addComponent(bt_reporteEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(bt_reporteSalida)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addGap(60, 60, 60)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(570, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Reportes", jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seguridad para todos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("*Esta aplicacion contiene iformacion confidencial de la empresa por lo tanto esta prohibido la distribucion sin permiso de la empresa.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("*No compartir informacion sobre los datos de los usuarios, ni dar a conocer el ID de tu usuarios y mucho menos la password.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("*Utilizar la aplicacion con un proposito positivo para todos.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("*Es recomendable mantener dentro de la empresa los reportes de las consultas para mayor seguridad.");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("*No compartir informacion no publica.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(0, 109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addGap(33, 33, 33)
                .addComponent(jLabel15)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Seguridad", jPanel5);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ayuda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("*Quieres registrar un usuario?");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("<html><body> Primero debes de estar en la ventana \"Rgistro/Consulta\", luego dar click en el boton que dicen \n<br>\"Nuevo\", entonces procede a insertar la informacion del producto y al terminar\n<br> dar click en el boton enviar.</body></html>");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("*Quieres registrar una entrada?");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("<html><body> Primero debes dar click en el boton \"Menu entrada\", luego dar click en el boton que dicen  \n<br>\"Nueva entrada\", entonces procede a insertar la informacion del producto que se registrara \n<br>en el inventario y al terminar dar click en el boton enviar.</body></html>");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("<html><body> Primero debes dar click en el boton \"Menu salida\", luego dar click en el boton que dicen   \n<br>\"Nueva salida\", entonces procede a insertar la informacion del producto que se\n<br>retirara del inventario y al terminar dar click en el boton enviar.</body></html>");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("*Quieres registrar una salida?");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("<html><body>\n Primero debes dar click en el dato que quieres modificar (Dentro de la tabla), \n<br>luego das click en el boton \"Modificar\", procedes a escribir los campos\n<br>que deseas modificar de ese dato, al terminar das click en el boton\n<br>\"Actualizar\".\n</body></html>");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("*Quieres modificar algun dato? (Funciona en cualquier ventana o tabla) ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("<html><body>\nPrimero das click en la caja de texto, luego eliges que tipo de dato\n<br>\nestas buscando, despues escribes el dato a buscar en el campo\n<br>\nque esta a la derecha de la caja de texto y al terminar das click\n<br>\nen \"Buscar\".\n</body></html>");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("*Quieres buscar alguna informacion? (Funciona en todas las ventanas)");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26))))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ayuda", jPanel6);

        label_user.setText("User*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_user, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_user)
                .addGap(8, 8, 8))
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

    private void bt_mostraTabla_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mostraTabla_RCActionPerformed
        mostraTabla("");
    }//GEN-LAST:event_bt_mostraTabla_RCActionPerformed

    private void bt_usuarios_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_usuarios_RCActionPerformed
        // TODO add your handling code here:
        MenuUsuarios menuUsuarios = new MenuUsuarios();
        menuUsuarios.setVisible(true);
    }//GEN-LAST:event_bt_usuarios_RCActionPerformed

    private void bt_buscar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscar_RCActionPerformed
        buscarTFconBOX();
    }//GEN-LAST:event_bt_buscar_RCActionPerformed

    private void bt_eliminar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminar_RCActionPerformed
        eliminar();
    }//GEN-LAST:event_bt_eliminar_RCActionPerformed

    private void bt_actualizar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actualizar_RCActionPerformed
        actualizarDatos();
        limpiarCampos();
        bt_nuevoProducto.setEnabled(true);
        bt_eliminar_RC.setEnabled(true);
        bt_modificar_RC.setEnabled(true);
        bt_actualizar_RC.setEnabled(false);
        bt_cancelar.setEnabled(false);
        bt_buscar_RC.setEnabled(true); 
        tf_buscar_RC.setEnabled(true);
        mostraTabla("");
    }//GEN-LAST:event_bt_actualizar_RCActionPerformed

    private void bt_modificar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificar_RCActionPerformed
        modificarDatos();
        bt_actualizar_RC.setEnabled(true);
           bt_cancelar.setEnabled(true);
           bt_enviar_RC.setEnabled(false);
           bt_eliminar_RC.setEnabled(false);
           bt_nuevoProducto.setEnabled(false);
           bt_modificar_RC.setEnabled(false); 
           bt_buscar_RC.setEnabled(false); 
           tf_buscar_RC.setEnabled(false); 
           habilitarTF();
        
    }//GEN-LAST:event_bt_modificar_RCActionPerformed

    private void bt_limpiar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiar_RCActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bt_limpiar_RCActionPerformed

    private void bt_enviar_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviar_RCActionPerformed
        insertarDatos();
        mostraTabla("");
    }//GEN-LAST:event_bt_enviar_RCActionPerformed

    private void bt_entradas_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entradas_RCActionPerformed
        // TODO add your handling code here:
        MenuEntrada menuEntrada = new MenuEntrada();
        menuEntrada.setVisible(true);
                
    }//GEN-LAST:event_bt_entradas_RCActionPerformed

    private void bt_salidas_RCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salidas_RCActionPerformed
        // TODO add your handling code here:
        MenuSalida menuSalida = new MenuSalida();
        menuSalida.setVisible(true);
        
    }//GEN-LAST:event_bt_salidas_RCActionPerformed

    private void bt_reporteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reporteProductoActionPerformed
        // TODO add your handling code here:
        makeReportProductos();
    }//GEN-LAST:event_bt_reporteProductoActionPerformed

    private void bt_reporteEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reporteEntradaActionPerformed
        // TODO add your handling code here:
        makeReportEntrada();
        
    }//GEN-LAST:event_bt_reporteEntradaActionPerformed

    private void bt_reporteSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reporteSalidaActionPerformed
        // TODO add your handling code here:
        makeReportSalida();
    }//GEN-LAST:event_bt_reporteSalidaActionPerformed

    private void bt_nuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoProductoActionPerformed
        // TODO add your handling code here:
           habilitarTF();
           bt_cancelar.setEnabled(true);
           bt_enviar_RC.setEnabled(true);
           bt_eliminar_RC.setEnabled(false);
           bt_nuevoProducto.setEnabled(false);
           bt_modificar_RC.setEnabled(false);
           bt_actualizar_RC.setEnabled(false);
    }//GEN-LAST:event_bt_nuevoProductoActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        // TODO add your handling code here:
        deshabilitarTF();
           bt_cancelar.setEnabled(false);
           bt_enviar_RC.setEnabled(false);
           bt_eliminar_RC.setEnabled(true);
           bt_nuevoProducto.setEnabled(true);
           bt_modificar_RC.setEnabled(true);
           bt_actualizar_RC.setEnabled(false);
           bt_buscar_RC.setEnabled(true);
           tf_buscar_RC.setEnabled(true);
           limpiarCampos();
        
    }//GEN-LAST:event_bt_cancelarActionPerformed

    
    //deshabilitar tf
    private void deshabilitarTF(){
        tf_idproducto_RC.setEnabled(false);
        tf_nombre_RC.setEnabled(false);
        tf_descripcion_RC.setEnabled(false);
        tf_costo_RC.setEnabled(false);
        tf_cantidad_RC.setEnabled(false);
        tf_categoria_RC.setEnabled(false);
    }
    
    //habilitar tf
        private void habilitarTF(){
        tf_idproducto_RC.setEnabled(true);
        tf_nombre_RC.setEnabled(true);
        tf_descripcion_RC.setEnabled(true);
        tf_costo_RC.setEnabled(true);
        tf_cantidad_RC.setEnabled(true);
        tf_categoria_RC.setEnabled(true);
    }
        
            //deshabilitar botones inicio
    private void deshabilitarTodo(){
        bt_modificar_RC.setEnabled(false);
        bt_actualizar_RC.setEnabled(false);
        bt_eliminar_RC.setEnabled(false);
        bt_cancelar.setEnabled(false);
        bt_enviar_RC.setEnabled(false);
        bt_actualizar_RC.setEnabled(false);
        bt_buscar_RC.setEnabled(true);
        
        //tf
        tf_idproducto_RC.setEnabled(false);
        tf_nombre_RC.setEnabled(false);
        tf_descripcion_RC.setEnabled(false);
        tf_costo_RC.setEnabled(false);
        tf_cantidad_RC.setEnabled(false);
        tf_categoria_RC.setEnabled(false);

        bt_modificar_RC.setEnabled(false);
        bt_actualizar_RC.setEnabled(false);
        bt_eliminar_RC.setEnabled(false);
    //    bt_nuevoProducto.setEnabled(false);
        bt_cancelar.setEnabled(false);
    }
        
    
        //enviar los datos a la base de datos
    private void insertarDatos() {
       // if (probarCamposVacios() == true) {
            pasarTFaVariables();
            try {
                PreparedStatement ppt = cn.prepareStatement("INSERT INTO productos(id_producto,nombre,descripcion,costo,cantidad,categoria) VALUES (?,?,?,?,?,?)");
                ppt.setString(1, tf_idproducto_RC.getText());
                ppt.setString(2, tf_nombre_RC.getText());
                ppt.setString(3, tf_descripcion_RC.getText());
                ppt.setFloat(4, costo_RC);
                ppt.setInt(5, cantidad_RC);
                ppt.setString(6, tf_categoria_RC.getText());
                
     
                ppt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos guardados");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos", "Problema con los datos", JOptionPane.QUESTION_MESSAGE);
                Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
      //  }
    }
    
    //mostra la tabla
        private void mostraTabla(String valor){
         DefaultTableModel modelo = new DefaultTableModel();
            //agregar columnas
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Costo");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Categoria");
            tabla_RC.setModel(modelo);
            //Fin
            
            //variables
            String sql = "";
            //fin
            
            //verificar que es SQL
            if(valor.equalsIgnoreCase("")){
                sql = "SELECT id_producto,nombre,descripcion,costo,cantidad,categoria  FROM productos";
            }else{
                sql = "SELECT id_producto,nombre,descripcion,costo,cantidad,categoria FROM productos WHERE " +atributo +"=" +"'" +valor +"'";
            }
            //fin


            String datos[] = new String[6];
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
                modelo.addRow(datos);
            }
            
            tabla_RC.setModel(modelo);
            //Fin

           
            
            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void pasarTFaVariables() {

        costo_RC = Float.parseFloat(tf_costo_RC.getText());
        cantidad_RC = Integer.parseInt(tf_cantidad_RC.getText());


    }
    
    //limpiar los campos
    private void limpiarCampos(){
        tf_idproducto_RC.setText("");
        tf_cantidad_RC.setText("");
        tf_categoria_RC.setText("");
        tf_costo_RC.setText("");
        tf_descripcion_RC.setText("");
        tf_nombre_RC.setText("");
        tf_buscar_RC.setText("");
        
    }
    
    //modificar datos
    private void modificarDatos() {
        int fila = tabla_RC.getSelectedRow();
        if (fila >= 0) {
            tf_idproducto_RC.setText(tabla_RC.getValueAt(fila, 0).toString());
            tf_nombre_RC.setText(tabla_RC.getValueAt(fila, 1).toString());
            tf_descripcion_RC.setText(tabla_RC.getValueAt(fila, 2).toString());
            tf_costo_RC.setText(tabla_RC.getValueAt(fila, 3).toString());
            tf_cantidad_RC.setText(tabla_RC.getValueAt(fila, 4).toString());
            tf_categoria_RC.setText(tabla_RC.getValueAt(fila, 5).toString());
            
                        //para que se pueda modificar el id del usuario
            tf_buscar_RC.setText(tabla_RC.getValueAt(fila, 0).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada", "Desconocido", 3);
        }
    }
    
    //actualizar datos
    private void actualizarDatos() {
        
        try {
           
            pasarTFaVariables();
            PreparedStatement pps = cn.prepareStatement("UPDATE productos SET nombre = '" + tf_nombre_RC.getText()
                    + "',descripcion = '"
                            + tf_descripcion_RC.getText()
                    +"', costo = '"
                            +costo_RC
                    + "',cantidad = '"
                            + cantidad_RC
                    + "',categoria = '"
                            +tf_categoria_RC.getText()
                    + "',id_producto = '"
                            +tf_idproducto_RC.getText()
                    
                    + "' WHERE id_producto = '"
                            + tf_buscar_RC.getText() +"'");
            pps.executeUpdate();
 
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha cometido algun error");
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
            //eliminar datos
    private void eliminar() {
        int fila = tabla_RC.getSelectedRow();
        String valor = tabla_RC.getValueAt(fila, 0).toString();

        if (fila >= 0) {
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM productos WHERE  id_producto = '" + valor + "'");
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
    
        //llenar el combo box del buscar
    private void llenarBox(){
        box_filtro_RC.addItem("nombre");
        box_filtro_RC.addItem("categoria");
        box_filtro_RC.addItem("id_producto");
        box_filtro_RC.addItem("cantidad");
   
    }
    
        //buscar con el box
    private void buscarTFconBOX(){
        atributo = box_filtro_RC.getSelectedItem().toString();
        mostraTabla(tf_buscar_RC.getText());
    }
    
    //centra ventana
      private void centrarJFrame(){
 
      //Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
      //int height = pantalla.height;
     // int width = pantalla.width;
      setSize(1100 , 801 );		
 
      setLocationRelativeTo(null);		
      setVisible(true);
  }
      
      //metodos para crear los reportes
      private void makeReportProductos(){
        try {
            //crear reporte
            JasperReport reporte = JasperCompileManager.compileReport("ReportesProductos.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, this.cn);
            
            //esto hace que cierre solo la ventana del reporte
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
            
            
        } catch (JRException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
    
        private void makeReportEntrada() {
        try {
            //crear reporte
            JasperReport reporte = JasperCompileManager.compileReport("ReporteEntrada.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, this.cn);

            //esto hace que cierre solo la ventana del reporte
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
        private void makeReportSalida() {
        try {
            //crear reporte
            JasperReport reporte = JasperCompileManager.compileReport("ReporteSalida.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, this.cn);

            //esto hace que cierre solo la ventana del reporte
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
        

    //variables convertidas de tf a numeros
    private float costo_RC;
    private int cantidad_RC;
    //fin de la variables convertidas

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_registro;
    private javax.swing.JComboBox<String> box_filtro_RC;
    private javax.swing.JButton bt_actualizar_RC;
    private javax.swing.JButton bt_buscar_RC;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_eliminar_RC;
    private javax.swing.JButton bt_entradas_RC;
    private javax.swing.JButton bt_enviar_RC;
    private javax.swing.JButton bt_limpiar_RC;
    private javax.swing.JButton bt_modificar_RC;
    private javax.swing.JButton bt_mostraTabla_RC;
    private javax.swing.JButton bt_nuevoProducto;
    private javax.swing.JButton bt_reporteEntrada;
    private javax.swing.JButton bt_reporteProducto;
    private javax.swing.JButton bt_reporteSalida;
    private javax.swing.JButton bt_salidas_RC;
    private javax.swing.JButton bt_usuarios_RC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label_user;
    private javax.swing.JPanel panel_bt_buscar;
    private javax.swing.JPanel panel_bt_modifcar;
    private javax.swing.JPanel panel_bt_nuevo;
    private javax.swing.JTable tabla_RC;
    private javax.swing.JTextField tf_buscar_RC;
    private javax.swing.JTextField tf_cantidad_RC;
    private javax.swing.JTextField tf_categoria_RC;
    private javax.swing.JTextField tf_costo_RC;
    private javax.swing.JTextArea tf_descripcion_RC;
    private javax.swing.JTextField tf_idproducto_RC;
    private javax.swing.JTextField tf_nombre_RC;
    // End of variables declaration//GEN-END:variables
}
