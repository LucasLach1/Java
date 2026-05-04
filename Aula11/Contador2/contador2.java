package Aula11.Contador2;

public class contador2 {
    public static void main(String[] args){
        int cc = 0;
        String Contagem = "";
        while (cc<10) {
            cc++;
            Contagem += cc + " ";
            
        }
        System.out.printf("%s ", Contagem);
    }
}
