
package reparaciones2014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Copiar_Ficheros {
    /**METODO PARA COPIAR FICHEROS DE  CUALQUIER PARTE HACIA UNA RUTA ESPECIFICA*/
    public String copiar(String path) throws IOException{
        FileOutputStream fsalida = null;
        try {
            FileInputStream fregis = new FileInputStream(path);
             File miFichero= new File(path);
             String ruta="C:/imagenes/"+miFichero.getName();
            fsalida = new FileOutputStream(ruta, true);
           
            
            int b = fregis.read();
            while (b != -1) { 
            fsalida.write(b); 
            b = fregis.read(); 

            }
            fsalida.flush();
            fsalida.close();
            fregis.close();
            return ruta;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Copiar_Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fsalida.close();
            } catch (IOException ex) {
                Logger.getLogger(Copiar_Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    return "";
    }
    
    
}
