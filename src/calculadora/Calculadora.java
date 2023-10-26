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

    public void  restoDivisao(){
        int dividendo = 43;
        int divisor = 5;
        int resto = 0;

        while(dividendo >= divisor) {
            resto = dividendo - divisor;
            dividendo -= divisor;
        }

        System.out.println(resto);
        System.out.println(43%divisor);

    }

    public void combinacao(){
        int numero = 7;

        int somador1, somador2;

        for (somador1=1; somador1 < 7; somador1++){

            for(somador2 = 7; somador2 >0; somador2--){

                if(somador2 + somador1 == numero){
                    System.out.println(somador1 + " + " + somador2
                    );
                }
            }
        }
    }
    public void triangular(){
        int num = 21;
        int mult2, mult3;
        int triangular = 0;
        for(int mult1 = 1 ; mult1 <= num ;mult1++){

            mult2 = mult1 +1;
            mult3 = mult1+2;
            if((mult1*mult2*mult3) == num ){
                        triangular = 1;
            }


        }
        System.out.println(triangular);
    }

    public void goldbach(){

    }

}
