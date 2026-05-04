package Aula7.Operadores;

import java.util.Scanner;

public class operadores1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int Numero1;
        int Numero2;
        float divisao;
        float res;

        System.out.print("Digite um Numerador: ");
        Numero1 = teclado.nextInt();
        System.out.print("Digite um Denominador: ");
        Numero2 = teclado.nextInt();

        divisao = Numero1 / Numero2;
        res = (float) Math.sqrt(Numero1);

        System.out.printf("A divisão entre %d e  %d é %.2f\n", Numero1, Numero2, divisao);
        System.out.printf("A raiz quadrada do Numerador é %d ", res);

    }   
}
