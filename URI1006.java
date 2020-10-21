import java.util.Scanner;
public class URI1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double A,B,C,MEDIA,NOTAA,NOTAB,NOTAC;

        A= teclado.nextDouble();
        B= teclado.nextDouble();
        C= teclado.nextDouble();

        NOTAA = A*2.0;
        NOTAB = B*3.0;
        NOTAC = C*5.0;

        MEDIA = (NOTAA+NOTAB+NOTAC)/10.0;

        System.out.printf("MEDIA = %.1f\n",MEDIA);
 
    }

}