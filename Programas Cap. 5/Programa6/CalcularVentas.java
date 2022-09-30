//Ejercicio 5.17
/*Programa que determina el precio de venta de cada producto utilizando el switch.
 * Y utilizando el método centínela para salir del ciclo.
*/

import java.util.Scanner;

public class CalcularVentas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num_prodcuto, cant_producto;
        double total = 0, venta, ventaf = 0, p1 = 2.98, p2 = 4.50, p3 = 9.98, p4 = 4.49, p5 = 6.87;

        // Título del programa
        System.out.print("\n\t\t\t Programa que determina el precio de venta de cada producto y el total\n");

        // Entrada de datos
        System.out.print("\n\t\t Ingrese el número o escriba -1 para finalizar\n");
        System.out.print("\n\t\t Número 1) 2.98  Número 2) 4.50 Número 3) 9.98 Número 4) 4.49 Número 5) 6.87\n ");
        System.out.print("\n\t\t Ingrese el número del producto: ");
        num_prodcuto = entrada.nextInt();

        // Uso del método centínela por medio del ciclo while
        while (num_prodcuto != -1) {

            System.out.print("\n\t\t Ingrese la cantidad vendida: ");
            cant_producto = entrada.nextInt();

            // Elección de casos mediante el switch
            switch (num_prodcuto / 1) {

                case 1:
                    System.out.print("\n\t\tEl precio del producto es de 2.98 dolares.\n");
                    venta = p1 * cant_producto;
                    ventaf += venta;
                    System.out.printf("\n\t\tLa venta total es de: %.2f \n", venta);
                    break;

                case 2:
                    System.out.print("\n\t\tEl precio del producto es de 4.50 dolares.\n");
                    venta = p2 * cant_producto;
                    ventaf += venta;
                    System.out.printf("\n\t\tLa venta total es de: %.2f \n", venta);
                    break;

                case 3:
                    System.out.print("\n\t\tEl precio del producto es de 9.98 dolares.\n");
                    venta = p3 * cant_producto;
                    ventaf += venta;
                    System.out.printf("\n\t\tLa venta total es de: %.2f \n", venta);
                    break;

                case 4:
                    System.out.print("\n\t\tEl precio del producto es de 4.49 dolares.\n");
                    venta = p4 * cant_producto;
                    ventaf += venta;
                    System.out.printf("\n\t\tLa venta total es de: %.2f \n", venta);
                    break;

                case 5:
                    System.out.print("\n\t\tEl precio del producto es de 6.87 dolares.\n");
                    venta = p5 * cant_producto;
                    ventaf += venta;
                    System.out.printf("\n\t\tLa venta total es de: %.2f \n", venta);
                    break;

            }

            // Entrada de datos de nuevo para saber si volver al ciclo whilw o finalizar
            System.out.print("\n\t\t Ingrese el número o escriba -1 para finalizar\n");
            System.out.print("\n\t\t Ingrese el número del producto: ");
            num_prodcuto = entrada.nextInt();

            // Muestra de resultados en caso de finalizar el centínela
            if (num_prodcuto == -1) {
                total += ventaf;
                System.out.printf("\n\t\tEl total de todas las ventas es de: %.2f \n\n", total);
            }

        }

        entrada.close();
    }
}
