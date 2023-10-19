import calculadora.Calculadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");

            System.out.print("Opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calculadora.questao39();
                    break;
                case 2:
                    calculadora.subtrair();
                    break;
                case 3:
                    calculadora.multiplicar();
                    break;
                case 4:
                    calculadora.dividir();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }

        System.out.println("O programa foi encerrado.");
        scanner.close();
    }
}
