/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.herencia;

/**
 *
 * @author luisyuyots
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista{
    //iniciando la especializacion 
    private String carrera;
    private String numeriCuenta;
    private String disciplinaDeportista;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeriCuenta, String disciplinaDeportista, String generoArtistico) {
        this.carrera = carrera;
        this.numeriCuenta = numeriCuenta;
        this.disciplinaDeportista = disciplinaDeportista;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeriCuenta() {
        return numeriCuenta;
    }

    public void setNumeriCuenta(String numeriCuenta) {
        this.numeriCuenta = numeriCuenta;
    }

    public String getDisciplinaDeportista() {
        return disciplinaDeportista;
    }

    public void setDisciplinaDeportista(String disciplinaDeportista) {
        this.disciplinaDeportista = disciplinaDeportista;
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre + " está entrenando " + this.disciplinaDeportista);
     }

    @Override
    public void jugar() {
        System.out.println(this.nombre + " esta jugando " + this.disciplinaDeportista);
     }

    @Override
    public void ensayar() {
        System.out.println(this.nombre + " esta ensayando/practicando " + this.generoArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + " esta presentando su obra de " + this.generoArtistico);
    }
    
    
    
}
