import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int n1 = sc.nextInt();
    System.out.print("Digite outro número: ");
    int n2 = sc.nextInt();

    int soma = n1 + n2;
    int subtracao = n1 - n2;
    int multiplicacao = n1 * n2;

    System.out.println("Soma: " + n1 + " + " + n2 + " = " + soma);
    System.out.println("Subtração: " + n1 + " - " + n2 + " = " + subtracao);
    System.out.println("Multiplicação: " + n1 + " * " + n2 + " = " + multiplicacao);

    if (n2 != 0) {
        double divisao = (double) n1 / n2;
        System.out.println("Divisão: " + n1 + " / " + n2 + " = " + divisao);
    } 
    
    else {
        System.out.println("não é possível dividir por 0");
    }

    sc.close();

    }
}