package Aula9.ProgramaParImpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = T.nextInt();
        int rest;
        
        rest = n%2;

        if(rest==0){
            System.out.println("É PAR!!!!!!!");
        }else{
            System.out.println("É ÍMPAR!!!!!");
        }
        
    }
}
