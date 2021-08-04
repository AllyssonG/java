import java.util.Scanner;

public class Exercicio2{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b;

        System.out.println("Digite o valor do lado do quadrado: ");
        a = teclado.nextDouble();

        b = a*a;

        System.out.println("Valor da area do quadrado= "+b);
    }
}