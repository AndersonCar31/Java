//Exercicio2B.java


import java.util.Scanner;
public class Exercicio2B{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float area, altura, base;


//entrada
    System.out.println("Por Favor Digite o altura");
    altura = teclado.nextFloat();

    System.out.println("Por Favor a Base");
    base = teclado.nextFloat();
//processamento
    area = base*altura;

//saida
   System.out.println("Por Favor "+area);
    }
}
