package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        System.out.printf("A=%.4f", (3.14159 * Math.pow(raio, 2.0)));

        sc.close();
    }
}
