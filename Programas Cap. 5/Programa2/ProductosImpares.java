//Ejercicio 5.12
//Programa que cálcula el producto de los números impares del 1 al 15.

public class ProductosImpares {

    public static void main(String[] args) {

        int mult = 1;

        //Título del programa
        System.out.print("\n\t\t\tPrograma que cálcula y muestra el producto de los números impares del 1 al 15\n");
        System.out.print("\n\t\t\tEsto supone multiplicar 1*3*5*7*9*11*13*15 \n");

        //Cálculo el producto mediante un ciclo for
        for (int i = 1; i <= 15; i++) {

            if (i % 2 != 0)

                mult *= i;

        }

        //Muestra de resultados
        System.out.printf("\n\t\t El producto de los números impares del 1 al 15 es: %s %n%n", mult);
    }

}
