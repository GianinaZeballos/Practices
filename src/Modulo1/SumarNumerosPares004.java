package Modulo1;
/* 004-Complete la función 'sumarNumerosPares' que toma dos números enteros, 'inicio' y 'fin' (inclusive), y
devuelve la suma de todos los números pares en ese rango.
1.Complete la función sumarNumerosPares de manera que utilice un bucle for para iterar sobre los números en el rango [inicio, fin].
2.Suma únicamente los números pares y devuelve el resultado. */

import static utils.Escaner.entrada;

public class SumarNumerosPares004 {
    public static void sumarNumerosPares (){

        System.out.println("Ingrese dos numeros enteros\n Ingrese el primer numero (inicio): ");
        int inicio = entrada.nextInt();
        System.out.println("Ingrese el segundo (fin): ");
        int fin = entrada.nextInt();

        int num;
        int suma = 0;
        for(num = inicio; num <= fin; num++){
            if (num % 2 == 0){
            suma+=num;
            }
        }
        System.out.println("La suma de los numeros pares es: " + suma);
    }
}
