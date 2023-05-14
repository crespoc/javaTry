/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ruddycrespo
 */
public class Mavenproject16 {

    public static void main(String[] args) throws IOException {
        
        String resultado = "";
        
        int contador = 0;
        int numero = 1;
        
        while(contador < 100) {
            if(esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
          System.out.println("los primeros 100 son " + resultado);
    }
    
    private static boolean esPrimo(int numero) {
        
        boolean esUnNumeroPrimo = true;
        for(int i = 2; i < numero; i++) {
           if(numero % i == 0) {
               esUnNumeroPrimo = false;
           }
            
        }
        return esUnNumeroPrimo;
    }
}
