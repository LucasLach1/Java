package Aula7.Testes;

import java.util.Scanner;

public class CalculadoraCircuferencia {
    public static void main(String[] args) {

        Scanner Teclado =  new Scanner(System.in);

        int raio;
        int diametro;
        double circunferencia;
        double PI = Math.PI;//3,1415...

        System.out.println("Digite um raio: ");
        raio = Teclado.nextInt();
        //Descubrir o diâmetro
        diametro = raio * 2;
        //Descubrir a circunferência
        circunferencia = (float) diametro * PI;
        //Escrever na tela
        System.out.printf("O raio de %d tem o diâmetro de %d\n", raio, diametro);
        System.out.printf("A circunferência do raio de %d é %.2f", raio, circunferencia);
    }
}
