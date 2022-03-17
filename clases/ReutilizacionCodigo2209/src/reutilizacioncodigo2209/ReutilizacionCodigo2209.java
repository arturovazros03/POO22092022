/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import ICO.fes.componentes.Monitor;
import ICO.fes.componentes.Mouse;
import ICO.fes.componentes.Teclado;
import ICO.fes.componentes.procesador;
import ICO.fes.herencia.Alumno;
import asus.com.Computadora;
import javax.swing.JFrame;

/**
 *
 * @author luisyuyots
 */

/*esto es un ejemplo de la reutilizacion de codigo 
dicho ejemplo sera usando codigo ya creado por los creadores de java*/
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José");//constructor por defecto
        System.out.println( nombre );
        System.out.println(nombre.charAt(3));
        //imprime el caracter que especifiques
        System.out.println(nombre.toUpperCase());
        //mayusculas del contenido
        
        //interfaz grafica basica JFr + crtl + space
        /*JFrame ventana = new JFrame("mi primer ventana Java");
        ventana.setSize(600, 400);//dimensones de la ventana
        ventana.setVisible(true);//sera visisble con valor bool*/
        
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new procesador("Intel",2.6f));
        System.out.println(miCompu);
        //llamamos al atributo cpu y su marca 
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //ejercicio -> establecer un mouse marca Logitech del tipo optico
        miCompu.setRaton(new Mouse("Logitech","Optico"));
        System.out.println(miCompu);
        
        //creando nuevo obj -> composicion
        Computadora compu2 = new Computadora("Apple", "MacBoock", 
                new Monitor("Toshiba", 14.3f), 
                new Mouse("Acteck", "Tipo"), 
                new Teclado("Apple", 101), 
                new procesador("MI", 3.4f));
        System.out.println(compu2);
        //cambiando el mouse a:  apple y tipo touch  forma 1
        //compu2.setRaton(new Mouse("Apple", "Touch"));
        //System.out.println(compu2);
            
        //forma 2
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println(compu2);
        
        System.out.println("----------------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("Jose");//herencia del atrubito nombre de la clase persona 
        System.out.println(alu1);
        
        Alumno alu2 = new Alumno("23789765241","ICO","Jose Perez", 19);
        System.out.println(alu2);
        
    }
    
}
