package Modulo1;

import static utils.Escaner.entrada;

/*008-Escribe una función en Java llamada calcularCuadrado que tome un número entero como parámetro y
devuelva el cuadrado de ese número. A continuación, en el programa principal,
llama a la función calcularCuadrado con un valor específico y muestra el resultado.
 */
public class CalcularCuadrado008 {
    public static void calcularQadra2() {
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int alCuadrado= numero * numero;
        System.out.println(alCuadrado);
    }
}
