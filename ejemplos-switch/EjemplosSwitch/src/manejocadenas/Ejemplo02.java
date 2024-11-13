/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    
    public static void main(String[] args) {
        String pais;
        
        pais = "Ecuador";
        //      0123456 son los vales que tienen las letras de ecuador 
        char letra = pais.charAt(6); 
        // en este caso siempre se cuenta desde 0 
        System.out.printf("%s\n", letra);
        
    }
}
