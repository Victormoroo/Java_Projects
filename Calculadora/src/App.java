import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String PRIMEIRO_NUMERO = "Digite o primeiro número: ";
        String SEGUNDO_NUMERO = "Digite o segundo número: ";

        System.out.println("Escolha qual operação deseja fazer:\n" + 
        "1. Somar.\n" + 
        "2. Subtrair.\n" + 
        "3. Multiplicar.\n" + 
        "4. Dividir\n" + 
        "0. Sair");

        var resp = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int num1;
        int num2;
        String opcao;

        do {
            opcao = resp.nextLine();
            switch(opcao) {
                case "1":
                    System.out.println(PRIMEIRO_NUMERO);
                    num1 = resp.nextInt();
                    System.out.println(SEGUNDO_NUMERO);
                    num2 = resp.nextInt();
                    var soma = calc.somar(num1, num2);
                    System.out.println("A soma é: " + soma);
                    break;

                case "2":
                    System.out.println(PRIMEIRO_NUMERO);
                    num1 = resp.nextInt();
                    System.out.println(SEGUNDO_NUMERO);
                    num2 = resp.nextInt();
                    var subt = calc.subtrair(num1, num2);
                    System.out.println("A subtração é: " + subt);
                    break;

                case "3":
                    System.out.println(PRIMEIRO_NUMERO);
                    num1 = resp.nextInt();
                    System.out.println(SEGUNDO_NUMERO);
                    num2 = resp.nextInt();
                    var mult = calc.multiplicar(num1, num2);
                    System.out.println("A multiplicação é: " + mult);
                    break;

                case "4":
                    System.out.println(PRIMEIRO_NUMERO);
                    num1 = resp.nextInt();
                    System.out.println(SEGUNDO_NUMERO);
                    num2 = resp.nextInt();
                    Integer divisao;
                    
                    try {
                        divisao = calc.dividir(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }

                    var dividir = calc.dividir(num1, num2);
                    System.out.println("A divisão é: " + dividir);
                    break;

                default:
            }
        } while(!opcao.equals("0"));
        resp.close();
    }
}
