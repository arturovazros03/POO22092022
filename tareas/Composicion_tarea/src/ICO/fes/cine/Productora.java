/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.cine;

/**
 *
 * @author luisyuyots
 */
public class Productora {
    //Atributos de la clas
    private String Nombre;
    private String Genero; //romanticista, ciencia ficcion, terror, cine historico, etc.

    //constructor por defecto
    public Productora() {
    }
    
    //contructor sobrecargado 
    public Productora(String Nombre, String Genero) {
        this.Nombre = Nombre;
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "Nombre=" + Nombre + ", Genero=" + Genero + '}';
    }
    
    //metodos
    public void Grabar(){
        System.out.println("La productora " + this.Nombre + " está grabando la pelicula");
    }
}
