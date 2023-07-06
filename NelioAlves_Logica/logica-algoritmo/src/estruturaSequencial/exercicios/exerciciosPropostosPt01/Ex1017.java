package estruturaSequencial.exercicios.exerciciosPropostosPt01;

import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt(), velocidade = sc.nextInt();
        double dist = velocidade * tempo;

        System.out.printf("%.3f", (dist / 12));

        sc.close();
    }
}
