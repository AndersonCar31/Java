//Exercicio2E.java


import java.util.Scanner;
public class Exercicio2E{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float basemaior, altura, basemenor,area;
        float divisao=2;


//entrada
    System.out.println("Por Favor Digite o base maior");
    basemaior = teclado.nextFloat();

    System.out.println("Por Favor a Base menor");
    basemenor = teclado.nextFloat();

    System.out.println("Por Favor a Altura");
    altura = teclado.nextFloat();

//processamento
    area = (basemaior+basemenor)*altura/divisao;

//saida
   System.out.println("Por Favor "+area);
    }
}
