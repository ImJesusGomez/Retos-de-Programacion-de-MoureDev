/* INSTRUCCIONES: 
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
package retosdeprogramacionmouredev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrama {

    public static void main(String[] args) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // Le pedimos al usuario que ingrese dos palabras
        System.out.print("Ingresa la primera palabra: ");
        String primerPalabra = teclado.readLine();

        System.out.print("Ingresa la segunda palabra: ");
        String segundaPalabra = teclado.readLine();

        // Declaramos e inicializamos la variable de esAnagrama
        boolean esAnagrama;

        // Convertimos a minusculas ambas palabras para evitar errores
        primerPalabra = primerPalabra.toLowerCase();
        segundaPalabra = segundaPalabra.toLowerCase();

        // Primero comprobamos si es que las dos palabras son iguales
        if (primerPalabra.equals(segundaPalabra) || primerPalabra.length() != segundaPalabra.length()) {
            esAnagrama = false;
        } else {
            // Convertimos las dos palabras en un arreglo
            char[] arrayPrimeraPalabra = primerPalabra.toCharArray();
            char[] arraySegundaPalabra = segundaPalabra.toCharArray();

            // Ordenamos los arreglos
            Arrays.sort(arrayPrimeraPalabra);
            Arrays.sort(arraySegundaPalabra);
            
            // Comprobamos si contienen el mismo contenido
            esAnagrama = (Arrays.equals(arrayPrimeraPalabra, arraySegundaPalabra));
        }

        // Mostramos al usuario la respuesta
        if (esAnagrama) {
            System.out.println("ES UN ANAGRAMA");
        } else {
            System.out.println("NO ES UN ANAGRAMA");
        }

    }

}
