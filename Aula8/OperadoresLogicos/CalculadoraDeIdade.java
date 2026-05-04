package Aula8.OperadoresLogicos;

import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int ano = 0;
        System.out.print("Digite seu ano de nascimento: ");
        ano = Teclado.nextInt();
        int idade = 2026-ano;
        
        String situacao = (idade>=18)?"Maior":"Menor";

        System.out.printf("Sua idade é de %d anos\n",idade);
        System.out.println("Sua situação é: " + situacao);

    }
}