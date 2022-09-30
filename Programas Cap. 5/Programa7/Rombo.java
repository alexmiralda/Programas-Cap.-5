//Ejercicio 5.24
//Programa que imprime un rombo.

public class Rombo {

    public static void main(String[] args) {

        int Tamano = 9;

        // la varibale Tamano controla la diagonal del rombo

        for (int i = 1; i <= ((Tamano / 2) + 1); i++) {

            for (int k = 1; k <= Tamano / 2 - i + 1; k++)
                System.out.printf(" ");

            // Este ciclo imprime el triangulo superior
            for (int j = (Tamano / 2) - i + 2; j <= (Tamano / 2) + i; j++)
                System.out.printf("*");

            System.out.printf("\n");

        }

        // Abre segundo for, que imprime el triangulo de abajo

        for (int l = 1; l <= Tamano / 2; l++) {

            for (int m = 1; m <= l; m++) {

                System.out.printf(" ");

            }

            for (int n = l + 1; n <= Tamano - l; n++)
                System.out.printf("*");

            System.out.println();

        }

    }
}
