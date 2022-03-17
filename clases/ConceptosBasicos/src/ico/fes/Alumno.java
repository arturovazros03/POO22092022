/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;
 //ejemplo de herencia de la clase persona para la clase alumno
public class Alumno extends Persona{ //hereda atributos y metodos
    private String numCuenta;
    private String carrera;
    private int grupo;

    public Alumno() {
    }

    public Alumno(String numCuenta, String carrera, int grupo) {
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        //pasa el override de persona a la subclase Alumno
        return super.toString()+"Alumno{" + "numCuenta=" + numCuenta + ", carrera=" + carrera + ", grupo=" + grupo + '}';
    }
    
    
}
