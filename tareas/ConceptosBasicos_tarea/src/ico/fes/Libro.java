/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author luisyuyots
 */
public class Libro {
    //Atributos
    private int paginas; //atributo hojas (cuantas hojas tendra nuestro libro)
    private int codigo; //atribuo codigo (codigo con el que representa al libro)
    private String titulo; //atributo titulo de la clase libro
    private String autor; //atributo autor de la clase libro
    private String editorial; //atributo editorial de la clase libro

    public Libro() {//constructor por defecto
    }
    
    //constructor sobrecargado
    public Libro(int paginas, int codigo, String titulo, String autor, String editorial) {
        this.paginas = paginas;
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     //metodos
    public void cambio_pag(int cambio){
        System.out.println("Del libro "+ this.titulo +" cambio a la pagina: "+ cambio);
    }
    
    public void abrir(){
        System.out.println("El libro "+ this.titulo + " esta abierto");
    }
    
}
