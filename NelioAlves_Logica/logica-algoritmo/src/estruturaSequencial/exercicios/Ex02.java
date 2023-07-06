package estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble(), altura = sc.nextDouble();

        System.out.printf("AREA: %.4f%n", base * altura);
        System.out.printf("PERIMETRO: %.4f%n", 2 * base + 2 * altura);
        System.out.printf("DIAGONAL: %.4f%n", Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0)));

        sc.close();
    }
}
