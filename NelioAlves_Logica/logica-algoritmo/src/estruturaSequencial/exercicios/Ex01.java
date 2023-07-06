package estruturaSequencial.exercicios;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double valorM = sc.nextDouble();

        double area = largura * comprimento;

        System.out.printf("ÁREA = %.2f%n", area);
        System.out.printf("PREÇO = %.2f", valorM * area);

        sc.close();
    }
}
