package Modulo1;
import static utils.Escaner.entrada;
/*005-Complete la función 'sumarNaturalesHasta' que toma un número entero positivo 'limite' y
devuelve la suma de todos los números naturales hasta ese límite. Firma de la función:
1.Complete la función sumarNaturalesHasta de manera que utilice un bucle while para sumar los números naturales
desde 1 hasta el limite. 2.Devuelva la suma obtenida.*/

public class SumarNaturalesHasta {
    public static void sumarNaturalesHasta() {
        System.out.println("Ingrese un numero que defina el limite: ");
        int limite = entrada.nextInt();
        int numero = 0;
        int suma = 0;
        while ( limite > numero) {
            numero ++;
           suma +=numero;
       }
       System.out.println(suma);
    }
}
