/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asus.com;

import ICO.fes.componentes.Monitor;
import ICO.fes.componentes.Mouse;
import ICO.fes.componentes.Teclado;
import ICO.fes.componentes.procesador;

/**
 *
 * @author luisyuyots
 */

//ejemplo de composicion
public class Computadora {
  //atributos de la computadora
   private String marca;
   private String modelo;
//composicion de la clase computadora con las otras clases del paquete ico,fes.componentes
    private Monitor pantalla;
    private Mouse raton;
    private Teclado teclado;
    private procesador cpu;

    //constructor por defecto
    public Computadora() {
        pantalla = new Monitor();
        raton = new Mouse();
        teclado = new Teclado();
        cpu = new procesador();
    }

    //constructor sobreCaragado
    public Computadora(String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, procesador cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public procesador getCpu() {
        return cpu;
    }

    public void setCpu(procesador cpu) {
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        /*String estado = "Marca: "+this.marca ;
        estado = estado + "Modelo: " + this.modelo;
        estado = estado + "Raton: " + this.raton.getMarca() + "Tipo: "+ this.getRaton().getTipo();
        return estado;*/
        
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", raton=" + raton + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }   

    public void getRaton(Mouse mouse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
