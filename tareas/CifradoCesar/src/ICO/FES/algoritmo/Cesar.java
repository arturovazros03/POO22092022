/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.algoritmo;

import java.util.Scanner;


public class Cesar {
    
    Scanner sn = new Scanner(System.in);

    public Cesar() {
        this.sn.useDelimiter("\n");
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        String frase = sn.next();
    }
    
    public static String codificar(String letras, String texto){
        String textoCodificado = "";
        
        texto = texto.toUpperCase();
        
        char caracter;
        for(int i = 0; i<texto.length();i++){
            caracter = texto.charAt(i);
            
            int pos = letras.indexOf(caracter);
            
            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt((pos + 3) % letras.length());
            }
        }
        
        return textoCodificado;
    }
    
    
}
