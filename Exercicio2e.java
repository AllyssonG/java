import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b,c,d;

        System.out.println("Digite o valor da base maior do trapezio: ");
        a = teclado.nextDouble();

        System.out.println("Digite o valor da base menor do trapezio: ");
        b = teclado.nextDouble();

        System.out.println("Digite o valor da altura do trapezio: ");
        c = teclado.nextDouble();

        d = (a+b)*c/2;

        System.out.println("Valor da area do trapezio= "+d);
    }
}