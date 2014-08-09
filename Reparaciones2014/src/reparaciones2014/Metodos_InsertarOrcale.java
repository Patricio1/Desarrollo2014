
package reparaciones2014;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Metodos_InsertarOrcale {
   Conexion_ORACLE cn= new Conexion_ORACLE();
               Connection con= cn.conectar();
               
    public void insertar_celular(String codigo,String cliente,String marca,String modelo,String color){
        try {
               Statement st= con.createStatement();
               st.execute("insert into CELULARES values('"+codigo+"',"+"'"+cliente+"','"+marca+"','"+modelo+"','"+color+"')");
               JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }
    }
        
  
        
        public void insertar_clientes(String cedula,String nombre,String apellido,String direccion,String telefono){
            try {
                Statement st= con.createStatement();
               st.execute("insert into CLIENTES values('"+ cedula+"',"+"'"+nombre+"','"+apellido+"','"+direccion+"','"+telefono+"')");
               JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }
    }

        public void insertar_sucursal(int codigo,String nombre,String direccion,String telefono){
            try {
                Statement st= con.createStatement();
               st.execute("insert into SUCURSAL values('"+ codigo+"',"+"'"+nombre+"','"+direccion+"','"+telefono+"')");
               JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }
        }
 
        public void insertar_usuarios(String cedula,String nombre,String apellido,String cargo,String password){
          try {
                Statement st= con.createStatement();
               st.execute("insert into USUARIOS values('"+cedula+"',"+"'"+nombre+"','"+apellido+"','"+cargo+"','"+password+"')");
               JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }   
        }
        
    
        public void insertar_reparaciones(int numero,String celular,String tecnico,Date ingreso,Date entrega,String dañio,Double costo){
            try {
                Statement st= con.createStatement();
               st.execute("insert into REPARACIONES values('"+numero+"',"+"'"+celular+"','"+tecnico+"','"+ingreso+"','"+entrega+"','"+dañio+"','"+costo+"')");
               JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }   
        }
    
        
        public void insertar_Tecnicos(String cedula,int sucursal,String nombre,String apellido,String telefono,String direccion,Date ingreso,Double sueldo,Double comision,String horario,String jefe,String foto){
              try {
                Statement st= con.createStatement();
               st.execute("insert into TECNICOS values('"+cedula+"',"+"'"+sucursal+"','"+nombre+"','"+apellido+"','"+telefono+"','"+direccion+"','"+ingreso+"','"+sueldo+"','"+comision+"','"+horario+"','"+jefe+"','"+foto+"')");
               JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        } 
        }
        }
                
                
                
            
        
    

