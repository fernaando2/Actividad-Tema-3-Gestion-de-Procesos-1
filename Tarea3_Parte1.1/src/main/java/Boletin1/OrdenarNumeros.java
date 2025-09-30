package Boletin1;

/**
 * Clase que ordena un conjunto de números enteros recibidos
 * @author
 * @version 1.0
 * @since 2025-09-30
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OrdenarNumeros {
    /**
     * Método principal que ejecuta el programa. Lee números desde la entrada estándar,
     * los ordena y los imprime en la salida estándar.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        try {
            // Crea un InputStreamReader para leer desde System.in
            InputStreamReader isr = new InputStreamReader(System.in);
            // Crea un BufferedReader para leer líneas de texto eficientemente
            BufferedReader bf = new BufferedReader(isr);

            String lineaLeida = null; // Variable para almacenar cada línea leída

            // Lee líneas hasta que no haya más entrada (null)
            while ((lineaLeida = bf.readLine()) != null) {
                // Divide la línea en un array de strings usando espacios como separador
                String[] datos = lineaLeida.split(" ");
                // Crea un array de enteros del mismo tamaño que los datos leídos
                int[] numeros = new int[datos.length];

                // Convierte cada string a entero y lo almacena en el array
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = Integer.parseInt(datos[i]);
                }

                // Ordena el array de números en orden ascendente
                Arrays.sort(numeros);

                // Imprime los números ordenados con un espacio entre ellos
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print(numeros[i] + " ");
                }
                // Nueva línea tras cada conjunto de números
                System.out.println("");
            }

            // Cierra el BufferedReader para liberar recursos
            bf.close();
        } catch (IOException e) {
            // Maneja cualquier excepción de entrada/salida imprimiendo un mensaje de error
            System.out.println("Error");
        }
    }
}