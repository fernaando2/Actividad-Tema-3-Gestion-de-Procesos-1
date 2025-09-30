package Boletin1;

/**
 * Clase que genera números aleatorios y los imprime en la salida estándar.
 * @author [Tu nombre]
 * @version 1.0
 * @since 2025-09-30
 */
import java.util.Random;

public class Aleatorios {
    /**
     * Genera y muestra 40 números aleatorios entre 0 y 100.
     * @param args No se usa.
     */
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            int numero = random.nextInt(101);
            System.out.println(numero);
        }
    }
}