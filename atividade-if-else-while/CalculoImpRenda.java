import java.util.Scanner;

public class CalculoImpRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor do seu salário bruto em reais: ");
    double SalarioB = sc.nextDouble();
    double contribuicao;

    if (SalarioB <= 1412.00) {
        contribuicao = SalarioB * 0.075;
    } else if (SalarioB <= 2666.68) {
        contribuicao = (SalarioB * 0.09) - 21.18;
    } else if (SalarioB <= 4000.03) {
        contribuicao = (SalarioB * 0.12) - 101.18;
    } else if (SalarioB <= 7786.02) {
        contribuicao = (SalarioB * 0.14) - 181.18;
    } else {
        contribuicao = 908.86;
    }

    double CalcImposto = SalarioB - contribuicao;
    double imposto;

    if (CalcImposto <= 2259.20) {
        imposto = 0.0;
    } else if (CalcImposto <= 2826.65) {
        imposto = (CalcImposto * 0.075) - 169.44;
    } else if (CalcImposto <= 4751.05) {
        imposto = (CalcImposto * 0.15) - 381.44;
    } else if (CalcImposto <= 4664.68) {
        imposto = (CalcImposto * 0.225) - 662.77;
    } else {
        imposto = (CalcImposto * 0.275) - 896.00;
    }

    if (imposto < 0) {
        imposto = 0.0;
    }

    double SalarioL = SalarioB - contribuicao - imposto;

    System.out.printf("%nSalário bruto: R$ %.2f%n", SalarioB);

    System.out.printf("Contribuição ao INSS: R$ %.2f%n", contribuicao);

    System.out.printf("Base de cálculo imposto de renda: R$ %.2f%n", CalcImposto);

    System.out.printf("Imposto de renda retido na fonte: R$ %.2f%n", imposto);
    
    System.out.printf("Salário líquido (INSS + Imposto de Renda descontados): R$ %.2f%n", SalarioL);

    sc.close();

 }
}