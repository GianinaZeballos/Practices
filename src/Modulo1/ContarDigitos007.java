package Modulo1;

import static utils.Escaner.entrada;
/*007-Escribe una función en Java llamada contarDigitos que tome un número entero como parámetro
y devuelva la cantidad de dígitos en ese número.*/

public class ContarDigitos007 {
    public static void contarDigitos(int num) {
        int cantDig = 0;
        int numero = num;
        while (num != 0) {
            num /= 10;
            cantDig++;

        }
        System.out.println("El numero " + numero + " tiene " + cantDig + " digitos");
    }
}

