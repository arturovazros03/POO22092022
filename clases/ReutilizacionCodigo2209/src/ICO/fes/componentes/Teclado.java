/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.componentes;

/**
 *
 * @author luisyuyots
 */
public class Teclado {
   private String Marca;
   private int numeroDeTeclas;

    public Teclado() {
    }

    public Teclado(String Marca, int numeroDeTeclas) {
        this.Marca = Marca;
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "Marca=" + Marca + ", numeroDeTeclas=" + numeroDeTeclas + '}';
    }
   
}
