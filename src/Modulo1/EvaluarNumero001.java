package Modulo1;
import java.util.Scanner;

/* 001-Complete la función 'evaluarNumero' que toma un número entero como argumento
y devuelve un mensaje indicando si el número es positivo, negativo o cero. */

public class EvaluarNumero001 {
    public static void evaluarNumero() {
    double numEntero;
    Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
    numEntero =entrada.nextDouble();
        if(numEntero >0){
        System.out.print("El numero es positivo");
    }else if(numEntero< 0){
        System.out.println("El numero es negativo");
    }else{
        System.out.println("El numero es cero");
     }
    }
}