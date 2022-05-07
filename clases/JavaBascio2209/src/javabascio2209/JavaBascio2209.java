/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabascio2209;

import java.util.ArrayList;
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
        
        //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va una cadena", JOptionPane.ERROR_MESSAGE);
        
        //ventanilla cuestionario
        
       // String dato = JOptionPane.showInputDialog(null, "Digite un numero", "Por favor", JOptionPane.QUESTION_MESSAGE);
        //System.out.println(dato);
        
        System.out.println("--------------------------------------------------------------------");
        //operador ternario
        int edad3 = 15;
        //validar si es mayor de edad
        String resultado = "";
        
        if(edad3<18){
            resultado = "Menor de edad";
        }else{
            resultado = "mayor de edad, ten un tequila para tu garganta";
        }
        System.out.println(resultado);
        
        //es una sintaxis diferente pero cumple con el mismo comentido que el 
        //condicional if
        //el operador ternario ahorra lineas de codigo y es más elegante en programacion
        int edad4 = 20;
        String res ="";
        
        res = edad4 < 18? "Menor de edad" : "Mayor de edad";
        System.out.println(res);
        
        //otra forma de sintaxis
        int edad5 = 16;
        System.out.println(edad5 < 18? "Menor de edad 4" : "Ya, el tequila");
        
        //---------------------------OPERADORES----------------------------------------
        int val1 = 1;
        int val2 = 5;
        //haremos una comparacion a nivel de bits es decir 
        /*
        val1 = 0000....0001;
        val2 = 0000....0010;
        */
        //operador or y and
        System.out.println("------------------------------------------------");
        
        System.out.println(val1 | val2);
        System.out.println(val1 & val2);
        /*
        que esta pasando? 
        val1 = 0000....0001;
        or
        val2 = 0000....0010;
        -----------------------
            0000...0011 => 3
        */
        //---------------------------------------------------------------------
        int val3 = 1; //0000...0001
        int val4 = 0;
        val4 = val3 << 5;
        System.out.println("--------------------------------------------------");
        System.out.println(val4);//tiene que dar 2
        /*esta desplazando el valor a la derecha, despues del << pusimos que el valor 
        se recorre una posicion, por lo que da 2*/
        
        System.out.println("---------ARREGLOS---------------");
        int [] edades;// primero debemos declara el arreglo
        //en este punto aun no esta reservando nada en memoria nuestro arreglo
        edades = new int [5];
        System.out.println(edades);//imprime la referencia de memoria de la maquina virtual
        edades [0] = 10;
        edades [4] = 18;
        System.out.println("La primera edad es: " + edades[0]);
        //imprimira el valor que le asignamos de la posicion 0 del arreglo
        System.out.println("La primera edad es: " + edades[4]);
     
        
        int [] estaturas = new int [5];
        
        int [] pesos = {86,98,56,76,77};
        
        /*System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);*/
        
        //ciclo FOR 
        //imprime lo mismo pero con menos lineas de codigo, usando un ciclo for
        System.out.println("-------Normal----------");
        for (int i = 0; i < pesos.length ; i++){
            System.out.println(pesos[i]);
        }
        System.out.println("--------Inverso------------");
        for (int j = pesos.length-1; j>=0; j--){
            System.out.println(pesos[j]);
        }
        /*En desarrollos de la vida cotidiana, programar con arreglos es muy
        comun, por ejemplo van a recuperar datos desde una base de datos..por ejemplos
        una tabla de alumnos.. al ser varios alumnos de la BD...del lado de java debes
        tener una forma de almacenarlos, es donde entran los arreglos*/
        
        System.out.println("----------------------Alumno-------------------");
        Alumno[] lista = new Alumno[5];//5 alumnos en el arreglo 
        lista[0] = new Alumno("999999999",2,9.0f);
        lista[1] = new Alumno("777777777",2,7.0f);
        lista[2] = new Alumno("555555555",2,7.0f);
        lista[3] = new Alumno("888888888",2,8.0f);
        lista[4] = new Alumno("222222222",2,6.0f);
        
        //fori + tab genera for en automatico
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
        }
        
        //For each es un For especial, introducido en la version 2 de java
        /*sufrio cambios grandes en jaca 
        EL FOR EACH fue introducido para simplificar los for con arreglos
        fore + TAB*/
        
        System.out.println("CON FOR EACH");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
        }
        
        ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
        grupo2209.add( new Alumno("999999", 2, 9.0f));
        grupo2209.add( new Alumno("888888", 2, 8.0f));
        grupo2209.add( new Alumno("777777", 2, 7.0f));
        grupo2209.add( new Alumno("666666", 2, 6.0f));
        grupo2209.add( new Alumno("555555", 2, 5.0f));
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        /*va a agregar este elemento a la lsita 
        en la posicion que deseamos y simplemento el elemento
        que esta en esa posicion lo recorre y todos loe elementos
        de la lista pasara lo mismo*/
        grupo2209.add(2, new Alumno("811111", 2, 9.9f));
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        System.out.println("-----------------------------------------");
        //sacando elemento con el metodo get();
        
        Alumno tmp = grupo2209.get(1); //NC = 88888
        System.out.println("Alumno en index = 1: " + tmp);
        
        Alumno pos = grupo2209.get(3); //NC = 77777
        System.out.println("Alumno en index = 1: " + pos);
           
        System.out.println("-------------------------------------------");
        
        /*borrando cierto elemento por remove (index)*/
        Alumno tmp2= grupo2209.remove(3);
        System.out.println("Elemnto sacado: " + tmp2);
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("Remplazar el 1-esimo elemento");
        
        Alumno tmp3 = grupo2209.set(0, new Alumno("4444444", 4, 4.0f));
        System.out.println("El sacado es : " + tmp3);
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        //excepciones 
        
        try {
            System.out.println("Excepciones");
            System.out.println(grupo2209.get(2));
        } catch (Exception e) {
            System.out.println("Error..revisa los indices");
        }
        
        System.out.println("Fin del programa");
        
        
    }
    
}
