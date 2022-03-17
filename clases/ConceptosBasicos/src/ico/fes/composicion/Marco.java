/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

/**
 *
 * @author luisyuyots
 */
public class Marco {
    private String Marca;
    private String material;

    public Marco() {
    }

    public Marco(String Marca, String material) {
        this.Marca = Marca;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Marco{" + "Marca=" + Marca + ", material=" + material + '}';
    }
    
    
}
