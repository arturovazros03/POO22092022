/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.cine;

/**
 *
 * @author luisyuyots
 */
public class Actor {
    //atributos
    private String Nombre;
    private String personaje;

    public Actor() {
    }

    public Actor(String Nombre, String personaje) {
        this.Nombre = Nombre;
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "Nombre=" + Nombre + ", personaje=" + personaje + '}';
    }
    
    //metodos
    public void Interpretacion(){
        System.out.println("El actor " + this.Nombre + " interpreta al personaje " + this.personaje);
    }
}
