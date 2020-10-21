import java.util.Scanner;
public class URI1070{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();

        if (X % 2 ==0){
            X++;
        }
        for (int cont=1; cont <= 6 ; cont++){
             System.out.println(X);
             X=X+2;


        }

    }
}   