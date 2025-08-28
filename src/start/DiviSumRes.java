package start;

import java.util.Scanner;

public class DiviRes {

    public static String dividir(int dividendo, int divisor) {

        if (divisor == 0) {
            return "Error: Dividir por cero no es posible. ";
        }

        if (dividendo == 0) {
            return "Cociente: 0, Residuo: 0";
        }

        boolean siCocienteNegativo = false;
        if ((dividendo < 0 & divisor > 0) | (dividendo > 0 & divisor < 0)) {
            siCocienteNegativo = true;
        }

        int absDividendo = dividendo;
        if (absDividendo < 0) {
            absDividendo = 0 - absDividendo;
        }

        int absDivisor = divisor;
        if (absDivisor < 0) {
            absDivisor = 0 - absDivisor;
        }

        int cociente = 0;
        int residuo = absDividendo;

        while (residuo >= absDivisor) {
            residuo = residuo - absDivisor;
            cociente = cociente + 1;
        }

        if (siCocienteNegativo) {
            cociente = 0 - cociente;
        }

        if (dividendo < 0 && residuo != 0) {
            residuo = 0 - residuo;
        }

        return "Cociente: " + cociente + ", Residuo: " + residuo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Calculadora de División usando solo la resta ");

        System.out.println(" Ingresa el dividendo (número a dividir): ");
        int numDividendo = entrada.nextInt();

        System.out.println(" Ingresa el divisor (número por el que dividir): ");
        int numDivisor = entrada.nextInt();

        String resultado = dividir(numDividendo, numDivisor);

        System.out.println( "Resultado de la división: " + resultado);

        entrada.close();
    }
}
