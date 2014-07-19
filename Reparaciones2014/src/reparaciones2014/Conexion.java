
package reparaciones2014;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    Connection connect = null;
    public Connection conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/reparaciones", "root", "");
            //JOptionPane.showMessageDialog(null, "CONEXION SATISFACTORIA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion intente de nuevo");
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
    
}
