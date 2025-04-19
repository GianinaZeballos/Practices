package Modulo1;
/*Escribe una función en Java llamada invertirNumero que tome un número entero como parámetro y
devuelva el número invertido. Por ejemplo, si la entrada es 12345, la función debería devolver 54321.*/

import static utils.Escaner.entrada;

public class InvertirNumero010 {
    public static void invertirNum() {
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int resto;
        int invertir = 0;
        for (int i = numero; numero > 0; i++) {
            resto = numero % 10;
            invertir = invertir * 10 + resto;
            numero /= 10;

        }
        System.out.println("Número invertido: " + invertir);

    }
}

/*int invertirNumero(int numero) {
    int invertido = 0;
    while (numero != 0) {
        invertido = invertido * 10 + numero % 10;
        numero /= 10;
    }
    return invertido;
}

*/
