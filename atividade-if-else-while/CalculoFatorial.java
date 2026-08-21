import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número que seja positivo e inteiro também: ");
    int n = sc.nextInt();

    if (n < 0) {
        System.out.println("Fatorial não é feito com número negativo");
    } else {
        long fatorial = 1;
        int contador = n;

    while (contador > 1) {
        fatorial *= contador;
        contador--;
    }
        
    System.out.println("O fatorial de " + n + " é " + fatorial);

    }

    sc.close();
 }
}