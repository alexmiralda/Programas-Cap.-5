//Ejercicio 5.11
/*Programa que encuentra el nímero menor entre los valores introducidos.
 El primer valor ingresado especifíca el número de valores que el usuario introducirá.
*/

import java.util.Scanner;

public class NumeroMenor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables
        int determinante, numero = 0, menor = 0;

        // Título del programa
        System.out.print("\n\t\t\tPrograma que determina el numero menor entre los valores ingresados\n");
        System.out.print("\n\t\tEL primer número ingresado determina cuantos datos se introduciran...\n");

        System.out.print("\n\tCuantos numeros desea comparar?...  ");
        determinante = entrada.nextInt();

        // Entrada del primer dato, tomado como base para compararlo
        System.out.print("\n\tIngrese un número: ");
        menor = entrada.nextInt();

        // Inicio del cálculo mediante el ciclo for
        for (int i = 1; i < determinante; i++) {

            System.out.print("\n\tIngrese un número: ");
            numero = entrada.nextInt();

            if (numero < menor) {

                menor = numero;

            }
        }

        // Muestra de resultados
        System.out.printf("\n\t El número menor es: %s %n%n", menor);

        entrada.close();
    }
}