package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        System.out.println("DIFERENCA = " + (a * b - c * d));

        sc.close();
    }
}
