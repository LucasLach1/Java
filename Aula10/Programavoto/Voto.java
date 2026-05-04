package Aula10.Programavoto;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int ano = T.nextInt();
        int idade = 2026-ano;
        System.out.println("Sua idade é: " + idade);
        if(idade<16){
            System.out.println("Não vota");
        }else{
            if ((idade>=16 && idade<18) || (idade >= 70)) {
                System.out.println("Voto opcional");
            }else{
                System.out.println("Voto obrigatório");
            }
        }

    }
}
