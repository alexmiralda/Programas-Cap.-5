//Ejercicio 5.13
//Programa que cálcula el factorial del 1 al 20

public class Factorial {
    public static void main(String[] args) {

        // Título del programa
        System.out.printf("\n\t\t\tPrograma que cálcula y muestra el factorial del 1 al 20.\n");
        System.out.printf("\n\tEsto supone multiplicar cada digito del 1 al 20: 1*2*3*4*5*6*7*8...\n");

        // Cálculo del factorial mediante un ciclo for
        for (int i = 1; i <= 20; i++) {

            long factor = 1;
            long numero = i;

            while (0 < numero) {
                factor *= numero--;
            }

            // Muestra de resultados
            System.out.printf("\n\tEl factorial de %d es: %d %n%n", i, factor);

        }

    }
}

/*
 * Imprimir el factorial del 1 al 100 nos da como resultado
 * un número muy grande que la varible de tipo long no soporta, y nos arroja
 * como resultado un 0.
 * 
 * Para comprobarlo cambie " i <= 20 " por el numero 100.
 * 
 */