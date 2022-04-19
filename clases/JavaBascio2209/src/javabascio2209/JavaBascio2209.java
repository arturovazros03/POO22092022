/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabascio2209;

import javax.swing.JOptionPane;

/**
 *
 * @author luisyuyots
 */
public class JavaBascio2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad = 29;
        System.out.println("Edad = "+edad);
        Integer edad2 = new Integer(22);//llamando a la clase integer
        System.out.println(edad2);
        double x = edad2.doubleValue();//convirtiendo a double
        System.out.println(x);
        System.out.println(edad2.shortValue());//utiliza la mitad de memoria que el double
        
        //conviritiendo String a entero
        System.out.println("-----------------------------");
        String cadena = "99";
        int altura = Integer.parseInt(cadena);//Metodo miembro o metodo de clase
        //comprobacion de que la conversion se hizo bien
        altura += 1;
        System.out.println("Altura: "+altura);
        
        //conversion a flotante
        float y = Float.parseFloat(cadena);
        y+= 0.5f; //especificando que es un flotante
        System.out.println("Altura: "+y);
        
        System.out.println("-----------------------");
        
        Arbol tree = new Arbol(2.4f, 20);
        System.out.println(tree);
        
        //llamando a la constante del arbol, tronco
       /*un metodo de una clase son identificadores que guardan un valor 
        constanrte o un comportamiento constante igual para todos 
        los objetos de la misma. Al ser constantes, no es necesario 
        crear una instancia (objeto) para acceder a ellos*/
       /*concepto de metodo y atributo de clase -> buscar en youtube*/
        System.out.println("Tronco de un arbol: "+Arbol.tronco);
        
        //como generar ventanillas 
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va una cadena", JOptionPane.ERROR_MESSAGE);
        //ventanilla cuestionario
        String dato = JOptionPane.showInputDialog(null, "Digite un numero", "Por favor", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
    }
    
}
