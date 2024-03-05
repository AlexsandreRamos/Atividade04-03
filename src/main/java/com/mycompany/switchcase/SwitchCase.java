
package com.mycompany.switchcase;

import java.util.Scanner;


public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        
        System.out.println("ATIVIDADE 1\n\nDigite um número de 1 a 7 sendo: \n1 = Domingo \n2 = Segunda-Feira \n3 = Terça-Feira \n4 = Quarta-Feira \n5 = Quinta-Feira \n6 = Sexta-Feira \n7 = Sabado \nEscreva o número desejado: ");
        num1 = teclado.nextInt();
        
        switch (num1) {
            
            
            case 1:
              System.out.println("Hoje é: Domingo");
                break;
            case 2:
               System.out.println("Hoje é: Segunda-Feira");
                break;
            case 3:
                System.out.println("Hoje é: Terça-Feira");
                break;
            case 4:
                System.out.println("Hoje é: Quarta-Feira");
                break;
            case 5:
                System.out.println("Hoje é: Quinta-Feira");
                break;
            case 6:
                System.out.println("Hoje é: Sexta-Feira");
                break;
            case 7:
               System.out.println("Hoje é: Sábado");
                break;
            default:    
                System.out.println("Valor inválido");
                break;
        }
           
        
            System.out.println("\n\n");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
       
//Scanner teclado = new Scanner(System.in);
        int num2;
        String estacao;
    
        System.out.println("ATIVIDADE 2\n\nEscreva um numero de 1 a 4:\n1 = verão \n2 = primavera \n3 = inverno \n4 = outono \nescreva o número abaixo:");
        
        
        num2 = teclado.nextInt();
        
        switch (num2){
            case 1:
                    System.out.printf("A estação do ano correspondente é: verão");
                break;
            case 2:
                   System.out.printf("A estação do ano correspondente é: primavera");
                break;
            case 3:
                   System.out.printf("A estação do ano correspondente é: inverno");
                break;
            case 4:
              System.out.printf("A estação do ano correspondente é: outono");
                break;
            default:
                  System.out.println("Valor invalido");
        }
        
     
        
        System.out.println("\n\n");
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
    
        int num3;
        
        System.out.println("ATIVIDADE 3\n\nEscreva um numero de 1 a 12 sendo:\n1 = Janeiro\n2 = Fevereiro\n3 = Março\n4 = Abril\n5 = Maio\n6 = Junho\n7 = Julho\n8 = Agosto\n9 = Setembro\n10 = Outubro\n11 = Novembro\n12 = Dezembro\nEscreva abaixo o número desejado:");
            num3 = teclado.nextInt();
            
       switch(num3){
           case 1:
               System.out.println("Estamos em Janeiro");
               break;
           case 2:
               System.out.println("Estamos em Fevereiro");
               break;
           case 3:
               System.out.println("Estamos em Março");
               break;
           case 4:
               System.out.println("Estamos em Abril");
               break;
           case 5:
               System.out.println("Estamos em Maio");
               break;
           case 6:
               System.out.println("Estamos em Junho");
               break;
           case 7:
               System.out.println("Estamos em Julho");
               break;
           case 8:
               System.out.println("Estamos em Agosto");
               break;
           case 9:
               System.out.println("Estamos em Setembro");
               break;
           case 10:
               System.out.println("Estamos em Outubro");
           case 11:
               System.out.println("Estamos em Novembro");
               break;
           case 12:
               System.out.println("Estamos em Dezembro");
               break;
           default:
               System.out.println("VALOR INVÁLIDO");
               break;
       }
        System.out.println("\n\n");
        
      ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
     
      
    
      char letra1;
      
        System.out.println("ATIVIDADE 4\n\nEscreva apenas 1 letra:");
      letra1 = teclado.next().charAt(0);
      
      switch (letra1){
          case 'A':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'a':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'E':
             System.out.printf("A letra '%c' é Vogal",letra1);
          case 'e':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'I':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'i':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'O':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'o':    
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'U':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          case 'u':
              System.out.printf("A letra '%c' é Vogal",letra1);
              break;
          default:
              System.out.printf("A letra '%c' é Consoante",letra1);
              break;
              
              
          
      }
        
        System.out.println("\n\n");
      
     /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        
       
        int num5;
        
        System.out.println("ATIVIDADE 5\n\nEscreva um número de 1 à 3 abaixo:");
        
        num5 = teclado.nextInt();
        
        switch (num5){
            
            case 1:
                System.out.printf("\n\nO número é 1");
                break;
                
            case 2:
                System.out.printf("\n\nO número é 2");
                break;
            case 3:
                System.out.printf("\n\nO número é 3");
                break;
        
       
        }
         
        if(num5 == 1){
          System.out.printf(" e ele é menor que 2 e maior que 0");
                 
         } 
         else{
             if (num5 == 2){
                 System.out.printf(" e ele é maior que 1 e menor que 3");
                 
         }    
         else{
             if (num5 == 3){
                     System.out.printf(" e ele é maior que 2 e menor que 4");
                     
             }
   
        
         else{
             System.out.println("O número não é 1,2 ou 3");
                      
    
            
          
        }}}
                
        
    
      
      
      
      
      
      
    

       
    }
}
