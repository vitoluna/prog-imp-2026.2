import java.util.Scanner;

public class CalculoTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número:");
    int n = sc.nextInt();

    System.out.println("Tabuada do " + n + ":");
    int multiplicador = 1;

    while (multiplicador <= 10) {
        System.out.println(n + " x " + multiplicador + " = " + (n * multiplicador));
        multiplicador++;
    }

    sc.close();
    
 }
}