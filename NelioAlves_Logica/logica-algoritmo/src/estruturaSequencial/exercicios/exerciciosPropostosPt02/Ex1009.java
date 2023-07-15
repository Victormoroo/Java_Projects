package estruturaSequencial.exercicios.exerciciosPropostosPt02;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f", vendas * 0.15 + salario);

        sc.close();
    }

}
