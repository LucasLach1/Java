package Aula11.Contador1;

public class Contador1 {
    public static void main(String[] args) {
        int cont = 0;
        while (cont<10) {
            cont++;
            if (cont==2 || cont==3 || cont == 4){
                continue;
            }
            
            if(cont==7){
                break;
            }

            System.out.println("Cambalhota "+ (cont));
            
        }
    }
}
