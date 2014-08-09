
package reparaciones2014;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Reparaciones2014 {

    public static void main(String[] args) {
        try {
            Conexion_ORACLE cn= new Conexion_ORACLE();
            cn.conectar();
            Copiar_Ficheros p= new Copiar_Ficheros();
         String ruta=   p.copiar("C:/Users/acer/Desktop/Archivos SQL/SCRIPTfirebird.txt");
         System.out.println(ruta);
            Metodos_InsertarOrcale pl= new Metodos_InsertarOrcale();
           // pl.insertar_clientes("1804600910","jaime","lopez","huachi","0987654325");
           // pl.insertar_celular("c01", "1804600912", "nokia", "5200", "blanco");
           // pl.insertar_usuarios("288723", "carlos", "aldaz", "administrador", "123");
          //  pl.insertar_sucursal(1, "globa cell", "Av. cevallos", "032748878");
            //pl.insertar_Tecnicos("1804600918", 1, "rodolfo", "carrillo", "1234485", null, null, Double.NaN, Double.NaN, null, null, null);
            
        } catch (IOException ex) {
            Logger.getLogger(Reparaciones2014.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
