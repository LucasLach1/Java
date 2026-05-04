package Aula6.EntradaDeDados;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();

        System.out.printf("A nota de %s é %.1f", nome, nota);

    }
}
