/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.herencia.polimorfismo;

/**
 *
 * @author luisyuyots
 */
public class Perro extends Animal{
    private String raza;
    private String pedigree;

    public Perro() {
    }

    public Perro(String raza, String pedigree) {
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public Perro(String raza, String pedigree, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", pedigree=" + pedigree + '}';
    }
    
    @Override //estamos sobre escribiendo un metodo 
    public void emitirSonido(){
        System.out.println("El perro esta ladrando...");     
    }
}
