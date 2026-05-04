package Aula9.ProgramaMedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nt1 = Teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nt2 = Teclado.nextFloat();
        float m = (nt1+nt2)/2;

        System.out.println("Sua média foi: " + m);
        if(m>9){
            System.out.println("Parabéns, pequeno gafanhoto");
        }else{
            System.out.println("Você é um bosta");
        }
    }
}
