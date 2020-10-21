import java.util.Scanner;

public class URI1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo,qtda;
        double total;

        codigo = teclado.nextInt();
        qtda = teclado.nextInt();

        if (codigo == 1){
            total = qtda*4.0f;
        }
        else if (codigo == 2){
                total = qtda*4.50f;
        }
        else if (codigo == 3){
                total = qtda*5.0f;
        }
        else if (codigo == 4){
                total = qtda*2.0f;
        }
         
        else {
            total = qtda*1.50f;
        }


            System.out.printf("Total: R$ %.2f\n",total);
    }
}
