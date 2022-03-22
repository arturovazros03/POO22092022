/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion_tarea;

import ICO.fes.cine.Actor;
import ICO.fes.cine.Director;
import ICO.fes.cine.Productora;
import ICO.fes.datos.Autor;
import ICO.fes.datos.Editorial;
import Literatura.Libro;
import Move.Pelicula;

/**
 *
 * @author luisyuyots
 */
public class Composicion_tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creando objeto libro de la clase Libro con su respectiva composicion
       Libro lib = new Libro("La tumba", "2356712-f",
                            new Autor("Jose Agusin", "Neoclasiscismo", "Sencillo"),
                            new Editorial("DEBOLSILLO", "Terror", "NO usan ilustraciones"));
       lib.abrir();
        System.out.println(lib);
        
        System.out.println("------------------------------");
        
        Pelicula peli = new Pelicula("Red", "Comedia infantil", 100,
                                    new Director("Domee Shi", 23),
                                    new Productora("Pixar Animation Studios", "Comedia"),
                                    new Actor("Laura Bailey","Abby"));
        peli.reproducir(100);
        System.out.println(peli);
    }
    
}
