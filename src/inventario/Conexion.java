/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



/**
 *
 * @author Lugue
 */
public class Conexion {
    Connection cn;

    public Connection conectar() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            System.out.println("La conexion se realizo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
    }
}
