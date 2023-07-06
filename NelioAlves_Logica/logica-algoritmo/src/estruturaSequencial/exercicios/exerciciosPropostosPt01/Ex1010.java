package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt(), quant1 = sc.nextInt();
        double val1 = sc.nextDouble();

        int cod2 = sc.nextInt(), quant2 = sc.nextInt();
        double val2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f", (quant1 * val1 + quant2 * val2));

        sc.close();
    }
}
