/* INSTRUCCIONES: 
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
package retosdeprogramacionmouredev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaPoligono {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // Le preguntamos al usuario el poligono que desea calcular
        System.out.println("Ingresa una opcion:\na) Triangulo\nb) Cuadrado\nc) Rectangulo ");
        String tipoPoligono = teclado.readLine();

        // Le asignamos una variable a la funcion que retorna el area
        double area = areaPoligono(tipoPoligono);
        System.out.println("Area: " + area + " u.");

    }

    public static double areaPoligono(String tipoPoligono) throws IOException {
        double area;

        // Pedimos al usuario los datos del poligono
        System.out.println("Ingresa la altura: ");
        double altura = Double.parseDouble(teclado.readLine());
        System.out.println("Ingresa la base: ");
        double base = Double.parseDouble(teclado.readLine());

        // Calculamos su area segun el poligono
        if (tipoPoligono.equalsIgnoreCase("a")) { // Triangulo
            area = (base * altura) / 2;
        } else if (tipoPoligono.equalsIgnoreCase("b")) { // Cuadrado
            area = base * altura;
        } else if (tipoPoligono.equalsIgnoreCase("c")) { // Rectangulo
            area = base * altura;
        } else {
            area = 0;
        }

        return area;
    }

}
