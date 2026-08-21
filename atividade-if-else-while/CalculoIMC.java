import java.util.Scanner;

public class CalculoIMC {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu peso (Ex: 67): ");

    float n1 = sc.nextFloat();

    System.out.print("Digite sua altura (Ex: 1,70): ");

    float n2 = sc.nextFloat();
    float n3 = n1 / (n2 * n2);

    System.out.println("O seu IMC é: " + n3);

    if (n3 < 18.5) {
        System.out.println("Magreza");
    } else if (n3 >= 18.5 && n3 <= 24.9) {
        System.out.println("Normal");
    } else if (n3 >= 25.0 && n3 <= 29.9) {
        System.out.println("Sobrepeso");
    } else if(n3 >= 30.0 && n3 <= 39.9) {
        System.out.println("Obesidade");
    } else if (n3 > 40.0) {
        System.out.println("Obesidade grave");
    }

    sc.close();

  }
}