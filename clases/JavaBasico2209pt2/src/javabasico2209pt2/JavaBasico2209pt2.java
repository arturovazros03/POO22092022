/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209pt2;

import ICO.FES.Aritmetica;
import ICO.FES.Circulo;
import ICO.FES.Cuadrado;
import ICO.FES.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisyuyots
 */
public class JavaBasico2209pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Excepciones
        */
        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("Alma");
        nombre.add("Bartolo");
        nombre.add("Carlos");
        nombre.add("Diana");
        nombre.add("Ernesto");
        
        for (String string : nombre) {
            System.out.println(string);
        }
        
        System.out.println("----------------------------");
        
        Scanner teclado = new Scanner(System.in);//ligando archivo
        
        int seleccion = 0;
        
        //ingresando elemnto entero para imprimir respuesta
        
        /*despues de seleccionar un numero del array*/
        String elNombre="";
        try {
            seleccion = teclado.nextInt();
            elNombre = nombre.get(seleccion);
            //si el error llega ocurrir
            //osea, si pone un elemento arriba de 4
        } catch(InputMismatchException ie){
            
            System.out.println("Debe teclear valores numericos");
            
        }catch(IndexOutOfBoundsException ioe){
        
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombre.get(0);
            
        }catch (Exception e) {
            
            System.out.println("Generica");//indica que tipo de error es 
            //se realiza esto
            elNombre = nombre.get(1);
            
        } finally {
            System.out.println(elNombre);
            //limpieza
        }
        
        
        //System.out.println(nombre.get(seleccion));
        //imprimiendo elemento seleccion 
        System.out.println("Continua el programa.....");
        
        Aritmetica cal = new Aritmetica(2,0);
        System.out.println(cal.getA() + "+" + cal.getB() + " = " + cal.sumar());
        
        
        try {
            System.out.println(cal.getA() + "/" + cal.getB() + " = " + cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de programa");
        } 
        
        
        System.out.println("Fin del programa");
        //Manejo de excepciones
        /*
        Sintaxis 
        try{
            //codigo que produce una excepcione
        }
        catch(Exception e){
            //copdigo para tratar una exception
        }
        */
        
        System.out.println("-------------------------------------------------");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo cir = new Circulo(4.5f);
        
        System.out.println("area del cuadrado es :" + cuad.calcularArea());
        System.out.println("area del circulo es : " +  cir.calcularArea());
        
        System.out.println("------------------------------------------------");
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportista("Futbol");
        eda.setGeneroArtistico("Fografia");
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);
        
        
    }
    
}
