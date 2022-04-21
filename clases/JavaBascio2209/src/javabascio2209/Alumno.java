package javabascio2209;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisyuyots
 */
public class Alumno {
    private String numeroCuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, int semestre, float promedio) {
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    //metodo 
    public void estudiar(int minutos){
        System.out.println("Estudiando " + minutos);
    }
    
    public String evaluarDesempenio(){
        //condicionals
        return this.promedio > 8.0f? "Sobresaliente":"Regular";
    }
    
}
