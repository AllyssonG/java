import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b,c;

        System.out.println("Digite o valor da base do triangulo: ");
        a = teclado.nextDouble();

        System.out.println("Digite o valor da altura do triangulo: ");
        b = teclado.nextDouble();

        c = (a*b)/2;

        System.out.println("Valor da area do triangulo= "+c);
    }
}