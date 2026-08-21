import java.util.Scanner;

public class NumPareImpar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int n1 = sc.nextInt();
    System.out.print("Digite um segundo número: ");
    int n2 = sc.nextInt();

    int inicio;
    int fim;

    if (n1 <= n2) {
        inicio = n1;
        fim = n2;
    } 
    
    else {
        inicio = n2;
        fim = n1;
    }

    System.out.println("Números pares entre " + inicio + " e " + fim + ":");

    int atual = inicio;
    while (atual <= fim) {
        if (atual % 2 == 0) {
            System.out.print(atual + " ");
        }
        atual++;
    }

    System.out.println("Números ímpares entre " + inicio + " e " + fim + ":");

    atual = inicio;
    while (atual <= fim) {
        if (atual % 2 != 0) {
            System.out.print(atual + " ");
        }
        atual++;
    }
    
    System.out.println();
    sc.close();
    
 }
}