/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Move;

import ICO.fes.cine.Actor;
import ICO.fes.cine.Director;
import ICO.fes.cine.Productora;

/**
 *
 * @author luisyuyots
 */
public class Pelicula {
    //atributos
    private String titulo;
    private String genero; //porno, cine de ciencia ficcion, terror
    private int duracion; //min
    //composicion de las clases
    private Director dir;
    private Productora pro;
    private Actor actor;

    public Pelicula() {
        dir = new Director();
        pro = new Productora();
        actor = new Actor();
    }

    public Pelicula(String titulo, String genero, int duracion, Director dir, Productora pro, Actor actor) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.dir = dir;
        this.pro = pro;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDir() {
        return dir;
    }

    public void setDir(Director dir) {
        this.dir = dir;
    }

    public Productora getPro() {
        return pro;
    }

    public void setPro(Productora pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", dir=" + dir + ", pro=" + pro + ", actor=" + actor + '}';
    }
    
    //metodo
    public void reproducir(int duracion){
        System.out.println("La pelicula " + this.titulo + " esta siendo reproducida con una duracion de " + this.duracion + " min");
    }
}
