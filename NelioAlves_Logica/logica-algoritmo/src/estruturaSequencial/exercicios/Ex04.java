package estruturaSequencial.exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), resto, horas, minutos, segundos;

        horas = num / 3600;
        resto = num % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
