package Testes;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) throws Exception, IOException{
        
        //Pegar a teclado

        Scanner Keys = new Scanner(System.in);
        
        //Variáveis
        int opcao;
        int n1, n2;

        //Opções
        System.out.println("-------------------------------------------");
        System.out.println("O que você quer fazer?");
        System.out.println("1. Multiplicação");
        System.out.println("2.Divisão");
        System.out.println("3.Soma");
        System.out.println("4.Subtração");
        System.out.println("5.Circunferência");
        System.out.print("Opção: ");
        
        opcao = Keys.nextInt();
        /*
        1.Multiplicação n1 * n2
        2.Divisão n1/n2
        3.Soma n1 + n2
        4.Subtração n1 - n2
        5.Circunferência diâmetro * 3,1415
        */
        if(opcao == 1){
            //Apaga as coisas na tela
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Multiplicação");
            //Pedindo os números
            System.out.print("Digite um número: ");
            n1 = Keys.nextInt();
            System.out.print("Digite outro: ");
            n2 = Keys.nextInt();
            //
            int multi = n1 * n2;

            System.out.printf("A multiplicação de %d e %d dá %d", n1, n2, multi);
        }else if(opcao == 2){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Divisão");
            System.out.print("Digite um número: ");
            n1 = Keys.nextInt();
            System.out.print("Digite outro: ");
            n2 = Keys.nextInt();

            int divi = n1/n2;

            System.out.printf("A divisão de %d e %d dá %d", n1, n2, divi);
        }else if(opcao == 3){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Soma");
            System.out.print("Digite um número: ");
            n1 = Keys.nextInt();
            System.out.print("Digite outro: ");
            n2 = Keys.nextInt();

            int soma = n1 + n2;

            System.out.printf("A soma entre %d e %d dá %d", n1, n2, soma);
        }else if(opcao == 4){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Subtração");
            System.out.print("Digite um número: ");
            n1 = Keys.nextInt();
            System.out.print("Digite outro: ");
            n2 = Keys.nextInt();

            int sub = n1 - n2;

            System.out.printf("A subtração entre %d e %d dá %d", n1, n2, sub);
        }else if(opcao==5){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Circunferência");
            System.out.print("Digite o raio: ");
            int raio = Keys.nextInt();
            int diametro = 2*raio;
            double PI = Math.PI;

            double circunferencia = (float) diametro * PI;
            
            System.out.printf("A circunferência de raio %d com diâmetro %d dá %.2f", raio, diametro, circunferencia);
        }
    }
}