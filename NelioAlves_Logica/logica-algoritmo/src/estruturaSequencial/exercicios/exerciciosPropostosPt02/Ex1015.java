package estruturaSequencial.exercicios.exerciciosPropostosPt02;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();

        System.out.printf("%.4f", Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2)));

        sc.close();
    }
}
