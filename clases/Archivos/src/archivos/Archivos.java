
package archivos;

import java.io.FileWriter;//paqueteria para generacion de archivos
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //utilizando excepciones 
        try {
            //this class in java is used to write character-oriented
            //data to a file
            
            //generando archivo y dando direccion de memoria donde sera generado
            FileWriter fw = new FileWriter("/home/luisyuyots/Desktop/apuntes/HolaMundoArch.txt",true);
            
            fw.write("Hola Mundo Java, estmos usando la maquina virtual VirtualBox");//metodo para agregar un string al archivo
            
            fw.close();//cerrando documento
            
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
