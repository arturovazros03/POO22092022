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
import ICO.fes.herencia.Servidor;
import ICO.fes.herencia.polimorfismo.Animal;
import ICO.fes.herencia.polimorfismo.Perro;
import asus.com.Computadora;
import javax.swing.JFrame;//interfaz grarfica

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
        
        Computadora compu2 = new Computadora("Apple", "MacBook Pro",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "optico"),
                new Teclado("Apple", 101),
                new procesador("M1", 3.4f));
       
        System.out.println( compu2 );
        // mouse  apple y tipo touch
        //compu2.setRaton(new Mouse("apple", "Touch"));
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println( compu2 );
       
        System.out.println("---------------------------------------");
        Alumno alu1=new Alumno();
        alu1.setNombre("José");
        System.out.println( alu1 );
       
        Alumno alu2 = new Alumno("1243243244", "ICO", "JOsé Perex", 19);
        System.out.println( alu2 );
       
        alu1.setNumCuenta("2323232323");
        alu1.setEdad(19);
        System.out.println( alu1 );
        
        System.out.println("-----Composicion y herencia-------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTrajetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
        
        System.out.println("-------ejemplo de polimorfismo------");
        Perro dog = new Perro("Bull dog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();
    }
    
}
