
package reparaciones2014;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Metodos_Insertar {
    Conexion cc = new Conexion();
    public void Insertar_Suc(String Nombre ,String Direccion,String Telefono){
        try {
            Connection p= cc.conectar();
            CallableStatement g= p.prepareCall("CALL INSERTAR_SUC(?,?,?)");
            g.setString(1, Nombre);
            g.setString(2, Direccion);
            g.setString(3,Telefono);
            g.execute();
            JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
            g.close();
            p.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }
    }
      public  Date convertirFecha(String fecha) throws ParseException  {
      java.sql.Date sqlDate=null;
    try {     
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
      java.util.Date utilDate = formatter.parse(fecha);
      sqlDate = new java.sql.Date(utilDate.getTime());
      return sqlDate;
    } catch (ParseException e) {
      e.printStackTrace();
      return sqlDate; 
    }
  }
    
    public void Insertar_Tec(String Cedula,Integer Sucursal,String Nombre,String Apellido,String Telefono,String Direccion,
            Date Ingreso,Double Sueldo,Double Comision,String Horario,String Jefe,String Foto) throws ParseException {
        
        try {
           String fecha=new SimpleDateFormat("yyyy/MM/dd").format(Ingreso);
           java.sql.Date Fecha_Ingreso=convertirFecha(fecha);          
            Connection p= cc.conectar();
            CallableStatement g= p.prepareCall("CALL INSERTAR_TEC(?,?,?,?,?,?,?,?,?,?,?,?)");
            g.setString(1, Cedula);
            g.setInt(2, Sucursal);
            g.setString(3,Nombre);
            g.setString(4,Apellido);
            g.setString(5,Telefono);
            g.setString(6,Direccion);
            g.setDate(7, Fecha_Ingreso);
            g.setDouble(8,Sueldo);
            g.setDouble(9,Comision);
            g.setString(10,Horario);
            g.setString(11,Jefe);
            g.setString(12,Foto);
            g.execute();
            JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
            g.close();
            p.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }
    
    }
    public void Insertar_Cli(String Cedula,String Nombre,String Apellido,String Direccion,String Telefono){
        try {
            Connection p= cc.conectar();
            CallableStatement g= p.prepareCall("CALL INSERTAR_CLI(?,?,?,?,?)");
               g.setString(1, Cedula);
               g.setString(2, Nombre);
               g.setString(3, Apellido);
               g.setString(4, Direccion);
               g.setString(5, Telefono);
               g.execute();
            JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
            g.close();
            p.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }         
    }
    public void Insertar_Cel(String Codigo,String Cliente,String Marca,String Modelo,String Color){
        try {
            Connection p= cc.conectar();
                CallableStatement g= p.prepareCall("CALL INSERTAR_CEL(?,?,?,?,?)");
                   g.setString(1, Codigo);
                   g.setString(2, Cliente);
                   g.setString(3, Marca);
                   g.setString(4, Modelo);
                   g.setString(5, Color);
                    g.execute();
            JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
            g.close();
            p.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }
    }
    
    public void Insertar_Rep(String Celular,String Tecnico,Date Ingreso,Date Entrega,String Danio,Double Costo ){
        try {
            Connection p= cc.conectar();
                    CallableStatement g= p.prepareCall("CALL INSERTAR_REP(?,?,?,?,?,?)");
                    g.setString(1, Celular);
                    g.setString(2, Tecnico);
                    g.setDate(3, Ingreso);
                    g.setDate(4, Entrega);
                    g.setString(5, Danio);
                    g.setDouble(6, Costo);
                    g.execute();
                    JOptionPane.showMessageDialog(null, "DATOS INSERTADOS");
                    g.close();
                    p.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO INSERTADOS");
        }
    }
    
}
