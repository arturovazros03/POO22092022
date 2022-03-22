/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.datos;

/**
 *
 * @author luisyuyots
 */
public class Editorial {
    //atributos de la clase editorial
    private String Nombre;
    private String Genero; //Narrativo, Dramático, Didactico, etc.
    private String Ilustracion; //Digital vectorial, fotos o realista.

    public Editorial() {
    }

    public Editorial(String Nombre, String Genero, String Ilustracion) {
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Ilustracion = Ilustracion;
    }

    public String getIlustracion() {
        return Ilustracion;
    }

    public void setIlustracion(String Ilustracion) {
        this.Ilustracion = Ilustracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", Genero=" + Genero + ", Ilustracion=" + Ilustracion + '}';
    }
    
    //Metodos
    
    public void publicar (){
        System.out.println("La editorial " + this.Nombre + " ha publicado un nuevo libro");
    }
    
    
    
}
