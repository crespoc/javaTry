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
       
        /* Este programa permite ingresar 3 numeros e indica cual
        es el numero mayor y cual es el numero menor*/
        
        //con este codigo pedimos que ingrese el numero
        System.out.println("Ingresar el primer numero"); 
        int numero1 = cargarNumero();
        
        System.out.println("Ingresar el segundo numero");   
        int numero2 = cargarNumero();
        
        System.out.println("Ingresar el tercer numero");     
        int numero3 = cargarNumero();
        
        //con este codigo calculamos el numero mayor y el numero menor
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }
    private static int cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        String strNumero = buffer.readLine();
        int numero = Integer.parseInt(strNumero);
        
        return numero;
    }
    /**
     * Esta funcion sirve para calcular el numero mayor!
     * @param numero1 es el primer numero ingresado!
     * @param numero2
     * @param numero3 
     */
    private static void calcularNumeroMayor(int numero1, int numero2, int numero3) {
        
        int numeroMayor = numero1;
        
        if(numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if(numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        
        System.out.println("El numero mayor es " + numeroMayor);
        
    }
    
    private static void calcularNumeroMenor(int numero1, int numero2, int numero3) {
        
        int numeroMenor = numero1;
        
        if(numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if(numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        
        System.out.println("El numero menor es " + numeroMenor);
    }
            
}
