/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_exercicio_8;

import java.util.Scanner;

/**
 *
 * @author gabriel.07907
 */
public class Lista_exercicio_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float num, percentual, resultPercentual;
                
        System.out.println("Informe o número: ");
        num = scanner.nextFloat();
        
        System.out.println("Informe o percentual: ");
        percentual = scanner.nextFloat();
        
        resultPercentual = (num * percentual) / 100;
        
        System.out.println("Resultado:" + resultPercentual);
        
    }
          
}
    

