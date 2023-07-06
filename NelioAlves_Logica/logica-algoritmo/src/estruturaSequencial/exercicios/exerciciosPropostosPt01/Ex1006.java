package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble();
        double media = (x * 2.0 + y * 3.0 + z * 5.0) / 10;

        System.out.printf("MEDIA = %.1f", media);

        sc.close();
    }
}
