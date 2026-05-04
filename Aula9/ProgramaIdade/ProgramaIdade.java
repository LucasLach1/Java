package Aula9.ProgramaIdade;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int nasc = T.nextInt();
        int idade = 2026 - nasc;
        System.out.println("Sua idade é: " + idade);
        if (idade>=18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
