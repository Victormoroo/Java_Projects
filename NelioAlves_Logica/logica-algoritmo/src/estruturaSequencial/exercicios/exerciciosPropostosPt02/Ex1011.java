package estruturaSequencial.exercicios.exerciciosPropostosPt02;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;
        double volume = (4.0/3) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", volume);

        sc.close();
    }
}
