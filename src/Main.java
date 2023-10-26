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
            System.out.println("2. triangular");
            System.out.println("3. Combinacao");
            System.out.println("4. resto");
            System.out.println("5. Sair");

            System.out.print("Opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calculadora.questao39();
                    break;
                case 2:
                    calculadora.triangular();
                    break;
                case 3:
                    calculadora.combinacao();
                    break;
                case 4:
                    calculadora.restoDivisao();
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
