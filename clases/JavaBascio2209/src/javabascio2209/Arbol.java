/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabascio2209;

/**
 *
 * @author luisyuyots
 */
public class Arbol {
    //Atributos del arbol
    private float altura;
    private int edad;
    
    //atributo miembro (constante)
    public static final int tronco = 1;

    public Arbol() {
    }

    public Arbol(float altura, int edad) {
        this.altura = altura;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Arbol{" + "altura=" + altura + ", edad=" + edad + '}';
    }
    
    //metodo de uso general
    public void crecer(float crecimiento){
        System.out.println("altura actual: "+this.altura);
        this.altura+=crecimiento;
        System.out.println("Altura posterior: "+this.altura);
    }
    
    public static void generaroxigeno(){
        System.out.println("Generando oxigeno");
    }
    
}
