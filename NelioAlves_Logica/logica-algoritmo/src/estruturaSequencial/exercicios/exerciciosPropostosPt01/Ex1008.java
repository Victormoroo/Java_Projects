package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int func = sc.nextInt(), horas = sc.nextInt();
        double salario = sc.nextDouble();

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f", (salario * horas));

        sc.close();
    }
}
