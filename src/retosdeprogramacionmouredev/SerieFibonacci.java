/* INSTRUCCIONES: 
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
package retosdeprogramacionmouredev;

public class SerieFibonacci {

    public static void main(String[] args) {
        
        long[] arreglo = new long[50];
        
        arreglo[0] = 0;
        arreglo[1] = 1;

        int n = 0;
        for (int i = 0; i < 48; i++) {
            arreglo[n + 2] = arreglo[n] + arreglo[n + 1];
            n++;
        }
        
        for(long numero: arreglo){
            System.out.println(numero);
        }
    }

}
