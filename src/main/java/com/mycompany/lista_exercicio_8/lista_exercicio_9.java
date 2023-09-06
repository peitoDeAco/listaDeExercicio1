
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicio_8;

import java.util.Scanner;

/**
 *
 * @author gabriel.07907
 */
public class lista_exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Informe a idade: ");
        idade = scanner.nextInt();
        
        if(idade >= 5 && idade <= 7){
            System.out.println("Infantil A");
        }else if(idade >= 8 && idade <= 10){ 
            System.out.println("Infantil B");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Juvenil A");
        }else if(idade >= 14 && idade <= 17){
            System.out.println("Juvenil B");
        }else if(idade >= 18){
            System.out.println("Adulto");
            
        }
    
    }
    
}
