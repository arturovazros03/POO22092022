
package pruebaejemplo;

/**
 *
 * @author luisyuyots
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaranco el objeto cuentas usando arreglos
        Cuentahabiente[] listaCuentas = new Cuentahabiente[5];//5 cuentas 
        
        listaCuentas[0] = new Cuentahabiente("187656309876730", "Luis Donaldo Colosio ", 125000.00f);
        listaCuentas[1] = new Cuentahabiente("897645686568990", "Gerardo Yael Rubio Jimenez ", 23000.00f);
        listaCuentas[2] = new Cuentahabiente("787665462901987", "Sergio Lopez Hernandez", 10000.00f);
        listaCuentas[3] = new Cuentahabiente("523723129874839", "Luis Rogelio Rodriguez Iturbide ", 60000.00f);
        listaCuentas[4] = new Cuentahabiente("326489324746354", "Shandi Ximena Rodriguez Iturbide", 4000.00f);
        
        System.out.println("----------------------Clasificacion del clientes--------------------------------\n");
      
        //ciclo FOR EACH
        for (Cuentahabiente cuentas : listaCuentas) {
            System.out.println("El cliente " + cuentas.getNombre()  + " es "+ cuentas.evaluarNivelCliente());
        }
        
        System.out.println("\n--------------------Registro de retiro de dinero-------------------------");
        listaCuentas[0].retirarDinero(67897.00f);
        listaCuentas[1].retirarDinero(125.00f);
        listaCuentas[2].retirarDinero(6000.00f);
        listaCuentas[3].retirarDinero(1000.00f);
        listaCuentas[4].retirarDinero(1500.00f);
       
    }
    
}
