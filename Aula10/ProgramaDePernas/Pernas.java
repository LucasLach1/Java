package Aula10.ProgramaDePernas;

import java.util.Scanner;

public class Pernas {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        
        System.out.print("Digite o número de pernas: ");
        int pernas = T.nextInt();
        String tipo = "";
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.printf("Isso é um(a) %s", tipo);
    }
}
