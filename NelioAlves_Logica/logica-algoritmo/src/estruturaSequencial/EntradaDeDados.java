package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
//        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // Para ler palavras
        String x = sc.next();
        System.out.println("Você digitou: " + x);

        // Para ler numeros inteiros
        int y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        // Para ler numeros com casas decimais (double)
        double z = sc.nextDouble();
        System.out.println("Você digitou: " + z);
        System.out.printf("Agora pode sair com vírgula ou não dependendo da região: %.2f%n", z);

        // Para ler caracter
        char w = sc.next().charAt(0);
        System.out.println("Você digitou: " + w);
        sc.nextLine(); // limpa o buffer

        // Para ler um texto até a quebra de linha
        String s1 = sc.nextLine(), s2 = sc.nextLine(), s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
