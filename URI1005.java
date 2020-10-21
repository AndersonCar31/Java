import java.util.Scanner;
public class URI1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double A,B,MEDIA,NOTAA,NOTAB;

        A= teclado.nextDouble();
        B= teclado.nextDouble();

        NOTAA = A*3.5;
        NOTAB = B*7.5;

        MEDIA = (NOTAA+NOTAB)/11;

        System.out.printf("MEDIA = %.5f\n",MEDIA);
 
    }

}