package Aula6.Calculador;

import java.util.Scanner;

public class Calculadora {
   public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("Calculadora");
        System.out.println("--------------------------------------");

        System.out.println("Soma");

        
        System.out.print("Digite um número: ");
        int N1 = teclado.nextInt();
        System.out.print("Digite um segundo número: ");
        int N2 = teclado.nextInt();
        int soma = N1 + N2;
        System.out.printf("A soma dos valores %d e %d deu %d\n", N1, N2, soma);

        System.out.println("--------------------------------------");
        System.out.println("Multiplicação");
        System.out.println("--------------------------------------");

        int multiplicacao = N1 * N2;

        System.out.printf("A multiplicação dos valores %d e %d deu %d", N1, N2, multiplicacao);
   } 
}
