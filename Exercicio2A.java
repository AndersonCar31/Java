//Exercicio2A.java


import java.util.Scanner;
public class Exercicio2A{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float area, lado;


//entrada
    System.out.println("Por Favor ");
    lado = teclado.nextFloat();
//processamento
    area = lado*lado;

//saida
   System.out.println("Por Favor "+area);
    }
}
