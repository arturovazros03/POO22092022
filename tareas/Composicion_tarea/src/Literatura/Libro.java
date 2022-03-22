/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Literatura;

import ICO.fes.datos.Autor;
import ICO.fes.datos.Editorial;

/**
 *
 * @author luisyuyots
 */
public class Libro {
    //atributos exclusivos de la clase libro
    private String Nombre;
    private String NumSerie;
    //composicion de la clases Autor y Editorial
     private Autor autor;
     private Editorial edi;

    public Libro() {
        autor = new Autor();
        edi = new Editorial();
    }

    public Libro(String Nombre, String NumSerie, Autor autor, Editorial edi) {
        this.Nombre = Nombre;
        this.NumSerie = NumSerie;
        this.autor = autor;
        this.edi = edi;
    }

    public Editorial getEdi() {
        return edi;
    }

    public void setEdi(Editorial edi) {
        this.edi = edi;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(String NumSerie) {
        this.NumSerie = NumSerie;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "Nombre=" + Nombre + ", NumSerie=" + NumSerie + ", autor=" + autor + ", edi=" + edi + '}';
    }
     
    //metodos
    public void abrir(){
        System.out.println("El libro " + this.Nombre + " esta abierto");
    } 
    
}
