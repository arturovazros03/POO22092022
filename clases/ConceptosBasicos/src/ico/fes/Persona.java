/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author luisyuyots
 */
public class Persona {  //java Bean  Es diferente a un Enterpise Java Bean
    private int edad; 
    private String nombre;

    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        //condicional para proteger la integridad
        if(edad >= 0 && edad <=120){
        this.edad = edad;
        }else{
            System.out.println("Valor fuera del rango");
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
}
