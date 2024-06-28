/* INSTRUCCIONES: 
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
package retosdeprogramacionmouredev;

public class NumerosPrimos {

    public static void main(String[] args) {

        System.out.println("Numeros Primos del 1-100: ");
        
        for(int i = 1; i < 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

}
