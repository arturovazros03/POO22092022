/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES;

/**
 *
 * @author luisyuyots
 */
public class Circulo implements Figura{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figura.PI * (this.radio * this.radio);
    }
    
    /*
    Principio de diseño de L.P : 0,1 e infinito 
    solo los valores 0,1 e infinito son validos para usarse en la codificacion 
    de algoritmos. El lenguaje de programacion debe proporcionar un mecanismo 
    para evitar usar literales numericas en el programa 
    
    */
    
}
