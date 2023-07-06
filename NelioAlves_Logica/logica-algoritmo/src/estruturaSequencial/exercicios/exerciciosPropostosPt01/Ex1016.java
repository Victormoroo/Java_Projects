package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dist = sc.nextInt();

        System.out.printf("%d minutos", dist * 2);

        sc.close();
    }
}
