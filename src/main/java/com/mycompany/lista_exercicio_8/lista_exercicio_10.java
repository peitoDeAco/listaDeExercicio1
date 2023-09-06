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
public class lista_exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float precoT;
        int produto, quantidade;
        
        System.out.println("Informe o produto");
        System.out.println("1 - laranja | valor: R$4,00");
        System.out.println("2 - limão | valor: R$5,00");
        System.out.println("3 - feijão | valor: R$10,00");
        System.out.println("4 - margarina | valor: R$3,00");
        System.out.println("5 - arroz | valor: R$9,00");
        produto = scanner.nextInt();
        
        if(produto == 1){
            System.out.println("Informe a quantidade: ");
            quantidade = scanner.nextInt();
            precoT = 4 * quantidade;
            System.out.println("total da compra: R$"+ precoT);
            
        }else if(produto == 2){
            System.out.println("Informe a quantidade: ");
            quantidade = scanner.nextInt();
            precoT = 5 * quantidade;
            System.out.println("total da compra: R$"+ precoT);
                       
        }else if(produto == 3){
            System.out.println("Informe a quantidade: ");
            quantidade = scanner.nextInt();
            precoT = 10 * quantidade;
            System.out.println("total da compra: R$"+ precoT);
            
        }else if(produto == 4){
            System.out.println("Informe a quantidade: ");
            quantidade = scanner.nextInt();
           precoT = 3 * quantidade;
            System.out.println("total da compra: R$"+ precoT);
        
        }else if(produto == 5){
            System.out.println("Informe a quantidade: ");
            quantidade = scanner.nextInt();
            precoT = 9 * quantidade;
            System.out.println("total da compra: R$"+ precoT);
        }
    }
    
}
