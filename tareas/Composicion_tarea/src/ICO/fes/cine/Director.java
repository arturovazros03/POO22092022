/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.cine;

/**
 *
 * @author luisyuyots
 */
public class Director {
    //Atributos del director
    private String Nombre;
    private int Experiencia; 

    public Director() {
      
    }

    public Director(String Nombre, int Experiencia) {
        this.Nombre = Nombre;
        this.Experiencia = Experiencia;
    }

    public void Dirigir(){
        System.out.println("El director " + this.Nombre + " está dirigiendo la pelicula.");
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    @Override
    public String toString() {
        return "Director{" + "Nombre=" + Nombre + ", Experiencia=" + Experiencia + '}';
    }
     
   public void dirigir(){
       System.out.println("El director " + this.Nombre + " está dirigiendo la pelicula");
   }
}
