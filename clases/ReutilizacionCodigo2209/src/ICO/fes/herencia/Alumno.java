/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.herencia;

/**
 *
 * @author luisyuyots
 */
//ejemplo de herencia -> funcion + extends + superclase 
//extends dice que alumno hereda lo de la clase persona
public class Alumno extends Persona {
    private String numCuenta;
    private String carrera;

    public Alumno() {
    }
    //constructor sobrecargado de la clase alumno
    public Alumno(String numCuenta, String carrera) {
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }
    //constructor sobrecargado con la herencia de la superclase 
    public Alumno(String numCuenta, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numCuenta=" + numCuenta + ", carrera=" + carrera + '}';
    }
    
    //metodos
    public void estudiar(int cantidad ){
        System.out.println(this.getNombre()+" está estudiando" + cantidad + " hrs.");
    }
    
    //Polimorfismo por sobre escritura
    @Override //voy a sobreescribir un metodo
    public void dormir(){
        System.out.println("El estudiante "+ this.getNombre() + " Esta durmiendo 5 hrs...");
    }
    //Polimorfismo por sobre carga
    public void dormir(int horasEstudio){
        int horasDormir = 8;
        System.out.println(this.getNombre()+" esta durmiendo "+ (horasDormir - horasEstudio) + " horas");
    }
}
