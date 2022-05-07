/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES;

/**
 *
 * @author luisyuyots
 */
public class Cuadrado implements Figura {
    
    //atributo de la clase cuadrado
    private float lado;

    //constructor por defecto
    public Cuadrado() {
    }

    //constructor sobrecargado
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float calcularArea() {
        System.out.println("Multiplicando lado por lado");
        return this.lado * this.lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
    
}
