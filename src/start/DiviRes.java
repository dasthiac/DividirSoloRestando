package start;

import java.util.Scanner;

public class DiviRes {

    public static String dividir(double dividendo, double divisor) {

        if (divisor == 0) {
            return "error no se puede dividir por 0 ";
        }

        if (dividendo == 0) {
            return "cociente: 0, residuo: 0";
        }

        boolean siCocienteNegativo = (dividendo < 0 & divisor > 0) | (dividendo > 0 & divisor < 0);

        double absDividendo = dividendo;
        if (absDividendo < 0) {
            absDividendo = -absDividendo;
        }

        double absDivisor = divisor;
        if (absDivisor < 0) {
            absDivisor = -absDivisor;
        }

        double cociente = 0;
        double residuo = absDividendo;

        while (residuo >= absDivisor) {
            residuo = residuo - absDivisor;
            cociente = cociente + 1;
        }

        if (siCocienteNegativo) {
            cociente = -cociente;
        }

        if (dividendo < 0 && residuo != 0) {
            residuo = -residuo;
        }

        return " resultado: " + cociente + ", residuo: " + residuo;


    }
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println(" calculadora de división usando solo la resta ");

        System.out.println(" ingrese el numero a dividir : ");
        double numDividendo = numero.nextDouble();

        System.out.println(" ingrese el numero divisor : ");
        double numDivisor = numero.nextDouble();

        String resultado = dividir(numDividendo,
                numDivisor);

        System.out.println( "Resultado de la división : " + resultado);

        numero.close();
    }
}
