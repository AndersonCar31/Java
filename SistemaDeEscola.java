import java.util.Scanner;
public class SistemaDeEscola{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        double p1,p2,media;

        System.out.println("Digite a nota da P1");
        p1 = teclado.nextDouble();
        System.out.println("Digite a nota da P2");
        p2 = teclado.nextDouble();

        media = (p1+p2)/2;

        System.out.println("Sua media"+media);

        if (media>=6.0){
            System.out.println("Parabens voce foi aprovado");
        }

        else{
            System.out.println("Tente novamente");
        }



    }
}