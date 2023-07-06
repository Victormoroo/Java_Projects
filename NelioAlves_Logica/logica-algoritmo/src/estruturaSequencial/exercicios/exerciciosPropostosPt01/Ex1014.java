package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int dist = sc.nextInt();
        double totalComb = sc.nextDouble();

        System.out.printf("%.3f km/l", (dist / totalComb));

        sc.close();
    }
}
