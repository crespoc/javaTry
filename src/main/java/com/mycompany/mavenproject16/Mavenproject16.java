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
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        System.out.println("Ingresar el primer numero");
        String strNumero1 = buffer.readLine();
        int numero1 = Integer.parseInt(strNumero1);
        
        System.out.println("Ingresar el primer numero");
        String strNumero2 = buffer.readLine();
        int numero2 = Integer.parseInt(strNumero2);
        
        System.out.println("Ingresar el primer numero");
        String strNumero3 = buffer.readLine();
        int numero3 = Integer.parseInt(strNumero3);
        
        int numeroMayor = numero1;
        
        if(numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if(numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        
        System.out.println("El numero mayor es " + numeroMayor);
        
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
