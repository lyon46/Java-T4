package Exercicio;

import java.util.Scanner;

public class Exercicio {
    
    public static void main(String[] args) {
       /* Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. Observação: o valor do desconto 
        é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100. */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do Produto: ");
        int Produto = scan.nextInt();

        System.out.println("Digite a porcentagem para desconto: ");
        double desconto = scan.nextDouble();

        System.out.println("Valor total: ");
        System.out.println (Produto * desconto /100 - Produto  );
        

     

        
    }
}