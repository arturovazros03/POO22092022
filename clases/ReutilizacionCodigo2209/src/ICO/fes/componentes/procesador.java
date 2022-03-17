/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.fes.componentes;

/**
 *
 * @author luisyuyots
 */
public class procesador {
    private String marca;
    private float frecuenciaEnGhz;

    public procesador() {
    }

    public procesador(String marca, float frecuenciaEnGhz) {
        this.marca = marca;
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }

    public float getFrecuenciaEnGhz() {
        return frecuenciaEnGhz;
    }

    public void setFrecuenciaEnGhz(float frecuenciaEnGhz) {
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "procesador{" + "marca=" + marca + ", frecuenciaEnGhz=" + frecuenciaEnGhz + '}';
    }
    
    
    
    
}
