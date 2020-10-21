import java.util.Scanner;
public class URI1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int PECA1,QUANT1,PECA2,QUANT2;
        float VALOR1,VALOR2,PAGAR;

        PECA1 = teclado.nextInt();
        QUANT1 = teclado.nextInt();
        VALOR1 = teclado.nextFloat();

        PECA2 = teclado.nextInt();
        QUANT2 = teclado.nextInt();
        VALOR2 = teclado.nextFloat();
        

        PAGAR = (QUANT1*VALOR1)+(QUANT2*VALOR2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",PAGAR);


 
    }

}