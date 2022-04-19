package reutilizacioncodigo2209;

import ICO.fes.herencia.Alumno;
import ICO.fes.herencia.Persona;

/**
 *
 * @author luisyuyots
 */
public class PruebaPolimorfismo {
    public static void main(String[] args) {
        System.out.println("Hola Polimorfismo");
        Persona per1 = new Persona();
        per1.setNombre("José");
        per1.dormir();
               
        Alumno al1 = new Alumno();
        al1.setNombre("José");
        al1.dormir();
        al1.dormir(4);
         
    }
}
