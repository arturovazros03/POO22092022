/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.modelo;

import ICO.FES.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author luisyuyots
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    
    //atributos
    private ArrayList<Persona> datos;
    private Persona selected;//para que nos regrese la informacion, vamos a declarar a la variable como a la clase persona

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        //regresara el numero de elementos a mostrar
      return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
       return datos.get(i);//posicion del comboBox
    }

    @Override
    public void addListDataListener(ListDataListener l) {
     
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
    //metodo para simular una consulta de base de datos
    public void consultarBaseDatos(){
        datos = new ArrayList<Persona>();
        //conectarian a bd
        //consulta bd
        datos.add(new Persona("Jose",19));
        datos.add(new Persona("Maria",20));
        datos.add(new Persona("Jesus",78));
        datos.add(new Persona("Diana",23));
    }
    
    public void agregarPersona( Persona p){
        //insert data base
        datos.add(p);
    }
    
    
}
