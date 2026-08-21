import java.util.Scanner;

public class CalculoINSS {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor do seu salário bruto em reais: ");
    double SalarioBruto = sc.nextDouble();

    double contribuicaoINSS;

    if (SalarioBruto <= 1412.00) {
        contribuicaoINSS = SalarioBruto * 0.075;
    }

    else if (SalarioBruto <= 2666.68) {
        contribuicaoINSS = (SalarioBruto * 0.09) - 21.18;
    }

    else if (SalarioBruto <= 4000.03) {
        contribuicaoINSS = (SalarioBruto * 0.12) - 101.18;
    }

    else if (SalarioBruto <= 7786.02) {
        contribuicaoINSS = (SalarioBruto * 0.14) - 181.18;
    }

    else {
        contribuicaoINSS = 908.86;
    }

    System.out.printf("Contribuição ao INSS: R$ %.2f%n", contribuicaoINSS);
    
    sc.close();

 }
}