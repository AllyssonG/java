import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b,c,d;

        System.out.println("Digite o tempo gasto na viagem: ");
        a = teclado.nextDouble();

        System.out.println("Digite a velocidade media: ");
        b = teclado.nextDouble();

        c = a*b;

        d=c/12;

        System.out.printf("Seu gasto foi de %.1f litros de combustivel\n",d);
        
    }
}