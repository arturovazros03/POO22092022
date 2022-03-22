/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.datos;

/**
 *
 * @author luisyuyots
 */
public class Autor {
    //atributos de la clase autor 
    private String Nombre;
    private String Corriente; //Barroco, Neoclasicismo, ect
    private String Estilo; // Formal, Poetico, Descriptivo, etc

    public Autor() {
    }

    public Autor(String Nombre, String Corriente, String Estilo) {
        this.Nombre = Nombre;
        this.Corriente = Corriente;
        this.Estilo = Estilo;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorriente() {
        return Corriente;
    }

    public void setCorriente(String Corriente) {
        this.Corriente = Corriente;
    }

    @Override
    public String toString() {
        return "Autor{" + "Nombre=" + Nombre + ", Corriente=" + Corriente + ", Estilo=" + Estilo + '}';
    }
    
    //metodos
    public void escribir (){
        System.out.println("El autor " + this.Nombre + " está escribiendo");
    }
    
    
}
