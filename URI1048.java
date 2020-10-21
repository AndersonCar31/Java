import java.util.Scanner;

public class URI1048{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        Double salario,faixa1,faixa2,faixa3,faixa4,faixa5,salarioatual,aumento;

        salario = teclado.nextDouble();
        faixa1 = 0.15;
        faixa2 = 0.12;
        faixa3 = 0.10;
        faixa4 = 0.07;
        faixa5 = 0.04;


        if (salario <= 400){
            aumento=salario*faixa1;
            salarioatual=salario+aumento;

            System.out.printf("Novo salario: %.2f\n",salarioatual);
            System.out.printf("Reajuste ganho: %.2f\n",aumento);
            System.out.println("Em percentual: 15 %");

        }
        else if (salario>400 && salario<=800){
            aumento=salario*faixa2;
            salarioatual=salario+aumento;

            System.out.printf("Novo salario: %.2f\n",salarioatual);
            System.out.printf("Reajuste ganho: %.2f\n",aumento);
            System.out.println("Em percentual: 12 %");
        }
        else if (salario>800 && salario<=1200){
            aumento=salario*faixa3;
            salarioatual=salario+aumento;

            System.out.printf("Novo salario: %.2f\n",salarioatual);
            System.out.printf("Reajuste ganho: %.2f\n",aumento);
            System.out.println("Em percentual: 10 %");
        }
         else if (salario>1200 && salario<=2000){
            aumento=salario*faixa4;
            salarioatual=salario+aumento;

            System.out.printf("Novo salario: %.2f\n",salarioatual);
            System.out.printf("Reajuste ganho: %.2f\n",+aumento);
            System.out.println("Em percentual: 7 %");
        }
        else if (salario>2000){
            aumento=salario*faixa5;
            salarioatual=salario+aumento;

            System.out.printf("Novo salario: %.2f\n",salarioatual);
            System.out.printf("Reajuste ganho: %.2f\n",aumento);
            System.out.println("Em percentual: 4 %");
        }

        
        
       }
}
