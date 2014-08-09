
package reparaciones2014;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion_ORACLE {
    Connection conn;
    public Connection conectar(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
           
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","REPARACIONES","REPARACIONES");
            JOptionPane.showMessageDialog(null, "exito :)");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "fallo :(");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "fallido :( ");
        }  
     return conn;   
    } 
}
