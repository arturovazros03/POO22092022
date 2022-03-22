/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.herencia;

import ICO.fes.componentes.Monitor;
import ICO.fes.componentes.Mouse;
import ICO.fes.componentes.Teclado;
import ICO.fes.componentes.procesador;
import asus.com.Computadora;

/**
 *
 * @author luisyuyots
 */
public class Servidor extends Computadora {
    private int numeroFuentesPoder;
    private int numeroTrajetasRed;
    private int tipoRaid;

    //contructor por defecto
    public Servidor() {
    }
    //constructor sobrecargado local
    public Servidor(int numeroFuentesPoder, int numeroTrajetasRed, int tipoRaid) {
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTrajetasRed = numeroTrajetasRed;
        this.tipoRaid = tipoRaid;
    }

    //constructor sobrecargado con herencia
    public Servidor(int numeroFuentesPoder, int numeroTrajetasRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTrajetasRed = numeroTrajetasRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuentesPoder() {
        return numeroFuentesPoder;
    }

    public void setNumeroFuentesPoder(int numeroFuentesPoder) {
        this.numeroFuentesPoder = numeroFuentesPoder;
    }

    public int getNumeroTrajetasRed() {
        return numeroTrajetasRed;
    }

    public void setNumeroTrajetasRed(int numeroTrajetasRed) {
        this.numeroTrajetasRed = numeroTrajetasRed;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numeroFuentesPoder=" + numeroFuentesPoder + ", numeroTrajetasRed=" + numeroTrajetasRed + ", tipoRaid=" + tipoRaid + '}';
    }
    
    
    
    
}
