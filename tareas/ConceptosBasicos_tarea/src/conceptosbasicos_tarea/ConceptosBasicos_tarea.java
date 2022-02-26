/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos_tarea;

import ico.fes.Libro;

/*
 * @author luisyuyots
 */
public class ConceptosBasicos_tarea {

    
    public static void main(String[] args) {
        //llamando a la clase libro y creando a objeto lib 
        Libro lib = new Libro();
        
        //llamando al atributo titulo 
        lib.setTitulo("Finis Mundi");
        System.out.println("Titulo del libro: "+lib.getTitulo());
        
        //llamando al atributo autor
        lib.setAutor("Laura Gallego Garcia");
        System.out.println("Autor del libro: "+lib.getAutor());
        
        //llamando al atributo editorial
        lib.setEditorial("EL BARCO DE VAPOR");
        System.out.println("Editorial del libro: "+lib.getEditorial());
        
        //llamando al atributo paginas
        lib.setPaginas(252);
        System.out.println("Cantidad de paginas del libro: "+lib.getPaginas());
        
        //llamando al atributo codigo
        lib.setCodigo(23780);
        System.out.println("Codigo de identificacion: "+lib.getCodigo());
        
        //METODOS
        lib.abrir();
        lib.cambio_pag(18);
    
    }
}
