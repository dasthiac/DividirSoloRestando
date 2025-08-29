package start;

import java.util.Scanner;

public class DiviRes {

    public static String dividir(float dividendo, float divisor) {

        if (divisor == 0) {
            return "Error: Dividir por cero no es posible. ";
        }

        if (dividendo == 0) {
            return "Cociente: 0, Residuo: 0";
        }

        boolean siCocienteNegativo = (dividendo < 0 & divisor > 0) | (dividendo > 0 & divisor < 0);

        float absDividendo = dividendo;
        if (absDividendo < 0) {
            absDividendo = - absDividendo;
        }

        float absDivisor = divisor;
        if (absDivisor < 0) {
            absDivisor = - absDivisor;
        }

        float cociente = 0;
        float residuo = absDividendo;

        while (residuo >= absDivisor) {
            residuo = residuo - absDivisor;
            cociente = cociente + 1;
        }

        if (siCocienteNegativo) {
            cociente = - cociente;
        }

        if (dividendo < 0 && residuo != 0) {
            residuo = - residuo;
        }

        return "Cociente: " + cociente + ", Residuo: " + residuo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Calculadora de División usando solo la resta ");

        System.out.println(" Ingresa el dividendo (número a dividir): ");
        float numDividendo = entrada.nextFloat();

        System.out.println(" Ingresa el divisor (número por el que dividir): ");
        float numDivisor = entrada.nextFloat();

        String resultado = dividir(numDividendo,
                numDivisor);

        System.out.println( "Resultado de la división : " + resultado);

        entrada.close();
    }
}
