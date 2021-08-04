import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b,c,d,e;

        System.out.println("Digite o valor do salario minimo: ");
        a = teclado.nextDouble();

        System.out.println("Digite o valor do gasto de kw: ");
        b = teclado.nextDouble();

        c = a/7/100;

        d = c*b;

        e = d-((d/100)*10);

        System.out.println("Cada Kw custa= "+c);
        System.out.println("Valor de reais a ser pago= "+d);
        System.out.println("Total com 10% de desconto= "+e);
    }
}