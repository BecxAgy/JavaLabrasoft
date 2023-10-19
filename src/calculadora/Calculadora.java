package calculadora;

import java.util.Scanner;

public class Calculadora {
    private  Scanner scanner;

    public Calculadora(){
        this.scanner = new Scanner(System.in);
    }

    public  void somar(){

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;
        System.out.println("Resultado da soma: " + resultado);

        scanner.close();

    }

    public  void subtrair(){

    }

    public  void multiplicar(){

    }

    public void dividir(){

    }

    public void questao39(){
        int numA = 4870;
        int[] digitos = new int[4];
        int fator = 2;
        int soma = 0;

        for (int i = 3; i >= 0; i--)
        {
            digitos[i] = numA % 10;
            numA /= 10;

            digitos[i] *= fator;
            fator++;

            soma += digitos[i];

        }
        int digitofinal = 11-(soma % 11) ;
        System.out.println(digitofinal);

    }



}
