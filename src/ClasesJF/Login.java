/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesJF;

import ClasesJF.Admin.PrincipalAdmin;
import inventario.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        centrarJFrame();
        
        
    }
    
    //objetos
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    Clase clase = new Clase();
    private String atributo = "id";
    String variable = "null";
    
    
    
    //variables globales stacticos
   public static String id;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        tf_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelxd = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        bt_salir = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bt_dar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        panel_fondo.setBackground(new java.awt.Color(255, 138, 101));

        tf_usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf_usuario.setToolTipText("");
        tf_usuario.setDisabledTextColor(new java.awt.Color(255, 138, 101));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Password");

        labelxd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelxd.setText("Iniciar secion");

        tf_password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf_password.setDisabledTextColor(new java.awt.Color(255, 138, 101));

        bt_salir.setBackground(new java.awt.Color(199, 91, 57));
        bt_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_salir.setText("Salir");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        bt_enviar.setBackground(new java.awt.Color(199, 91, 57));
        bt_enviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_enviar.setText("Entrar");
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });

        jLabel4.setText("...");

        bt_dar.setText("Dar");
        bt_dar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_darActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_fondoLayout = new javax.swing.GroupLayout(panel_fondo);
        panel_fondo.setLayout(panel_fondoLayout);
        panel_fondoLayout.setHorizontalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_fondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_fondoLayout.createSequentialGroup()
                                .addComponent(bt_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_fondoLayout.createSequentialGroup()
                                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(tf_password, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(bt_dar))))
                    .addGroup(panel_fondoLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(labelxd)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(166, 166, 166))
        );
        panel_fondoLayout.setVerticalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelxd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(bt_dar))
                .addGap(18, 18, 18)
                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_enviar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(bt_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        // TODO add your handling code here:
        validarCredenciales();
    }//GEN-LAST:event_bt_enviarActionPerformed

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        // TODO add your handling code here:
       System.exit(0);
       
    }//GEN-LAST:event_bt_salirActionPerformed

    private void bt_darActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_darActionPerformed
        clase.setVar(tf_usuario.getText());
        labelxd.setText(clase.getVar());
    }//GEN-LAST:event_bt_darActionPerformed

    
        //validar las credenciales que los campos de textos
    public String validarCredenciales(){
                //variables
        int verificacion = 0;
        
        String pass = "";
        int tipo = 0;
        String sql = "SELECT id_user, password, tipo FROM usuarios";
        String user = tf_usuario.getText();
        String password = tf_password.getText();
        //fin
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                id = rs.getString(1);
                pass = rs.getString(2);
                tipo = Integer.parseInt(rs.getString(3));
                
                //verificar credenciales
                if(id.equals(user) && pass.equals(password)){
                    //veridicar tipo de usuario
                    if(tipo == 1){

                        verificacion = 1;
                        JOptionPane.showMessageDialog(null, "Bienvenido administrador");

                        //Open windows
                        PrincipalAdmin principalAdmin = new PrincipalAdmin();
                        principalAdmin.setVisible(true);
                        super.setVisible(false);

                    }else if(tipo == 0) {
                        
                        verificacion = 1;
                        JOptionPane.showMessageDialog(null, "Bienvenido");

                        //Open windows
                        PrincipalStandar principalStandar = new PrincipalStandar();
                        principalStandar.setVisible(true);
                        super.setVisible(false);
                    }
      
                }
            }
            
            //en caso de no haber puesto credenciales correctas
            if (verificacion == 0) {
                JOptionPane.showMessageDialog(null, "Credenciales erroneas");
            }
            

            //Fin
        } catch (SQLException ex) {
            
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }
    
    
        //centra ventana
      private void centrarJFrame(){
 
      //Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
      //int height = pantalla.height;
     // int width = pantalla.width;
      setSize(430 , 230);		
 
      setLocationRelativeTo(null);		
      setVisible(true);
  }
      
      public void prueba(){
          System.out.println("Ok");
      }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_dar;
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelxd;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
