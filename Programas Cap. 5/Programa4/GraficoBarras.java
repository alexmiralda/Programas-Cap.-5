//Ejercicio 5.16
/*Programa que lee 5 números del 1 al 30 y muestra una barra adyacente de asteriscos
 * correspondientes al numero ingresado.
 * Ejemplo : numero ingresado es 7 = *******
 */

import java.util.Scanner;

public class GraficoBarras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4, n5;

        // Título del programa
        System.out.printf("\n\t\t\tPrograma que gráfica 5 barras dependiendo el número ingresado\n");

        // Entrada de datos
        System.out.printf("\n\t\t\tIngrese un número del 1 al 30: ");
        n1 = entrada.nextInt();
        System.out.printf("\n\t\t\tIngrese un número del 1 al 30: ");
        n2 = entrada.nextInt();
        System.out.printf("\n\t\t\tIngrese un número del 1 al 30: ");
        n3 = entrada.nextInt();
        System.out.printf("\n\t\t\tIngrese un número del 1 al 30: ");
        n4 = entrada.nextInt();
        System.out.printf("\n\t\t\tIngrese un número del 1 al 30: ");
        n5 = entrada.nextInt();

        // Proceso para mostrar las barras mediante ciclos fors
        for (int i = 1; i <= n1; i++) {

            System.out.printf("*");
        }
        System.out.println();

        for (int i = 1; i <= n2; i++) {

            System.out.printf("*");
        }
        System.out.println();

        for (int i = 1; i <= n3; i++) {

            System.out.printf("*");
        }
        System.out.println();

        for (int i = 1; i <= n4; i++) {

            System.out.printf("*");
        }
        System.out.println();

        for (int i = 1; i <= n5; i++) {

            System.out.printf("*");
        }
        System.out.println();

        entrada.close();

    }

}