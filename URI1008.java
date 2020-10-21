import java.util.Scanner;
public class URI1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int NUMEROFUNC,HORASTRAB;
        float VALORHORA,SALARY;

        NUMEROFUNC = teclado.nextInt();
        HORASTRAB = teclado.nextInt();
        VALORHORA = teclado.nextFloat();
        

        SALARY = HORASTRAB*VALORHORA;

        System.out.println("NUMBER = "+NUMEROFUNC);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);

 
    }

}