import java.util.Scanner;

public class URI1043{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        float A,B,C,area,perimetro;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();


//A+B>C AND B+C > A AND A+C > B
        if (A+B>C &&  B+C > A && A+C>B){
            perimetro = A+B+C;
            System.out.printf("Perimetro = %.1f\n",perimetro);

        
        }

        else {
            area = (A+B)*C/2;
            System.out.printf("Area = %.1f\n",area);

        }
    }   

}