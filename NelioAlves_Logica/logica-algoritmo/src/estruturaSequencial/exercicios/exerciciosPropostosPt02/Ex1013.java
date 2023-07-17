package estruturaSequencial.exercicios.exerciciosPropostosPt02;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), x, y;

        x = (a + b + Math.abs(a - b)) / 2;
        y = (x + c + Math.abs(x - c)) / 2;

        System.out.println(y + " eh o maior");

        sc.close();
    }
}
