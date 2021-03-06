
package ICO.FES.awt;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


//utilizamos herencia multiple para el Frame y con el MouseListener 
public class ventana extends Frame implements MouseListener{
    private String titulo;
    private Button boton1;
    private FlowLayout layout;//posiciona a los botones
    private Label etiqueta;
    private TextField cuadroTexto;
   

    public ventana() throws HeadlessException {
    }

    public ventana(String titulo) throws HeadlessException {
        super(titulo);
        this.setSize(350, 220);//para definir el tamaño de la venta alto x ancho
        layout = new FlowLayout(FlowLayout.LEFT);//alineacion del boton hacia la izquierda
        this.setLayout(layout);//estableciendo el layout  
        boton1 = new Button("Presioname");
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Texto inicial");
        
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        
        this.boton1.addMouseListener(this);//el objeto que va a procesar los eventos del MouseListener 
        this.setVisible(true);//para hacer visible la ventana
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "ventana{" + "titulo=" + titulo + '}';
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
        
        //donde escribimos algo, imprimira el hola + nombre o cosa
        etiqueta.setText("Hola " + cuadroTexto.getText());
    }

    //deteccion de eventos de MouseListener
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}
