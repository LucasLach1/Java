package Aula7.Operadores;

public class operadores {
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é: " + m);

       /* int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);

        */ 

        /*int x = 4;
        x += 2; // x=x+2 
        System.out.println(x);
        */

        /* 
        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        */

        double ale = Math.random();
        int n = (int) (15 + ale * (50-15));
        System.out.println(n);
    }
}
