package Modulo1;
import static utils.Escaner.entrada;

/* 003-Complete la función 'clasificarEstudiante' que toma una calificación como argumento y
devuelve un mensaje indicando la categoría del estudiante. Las categorías son: -
"Excelente" si la calificación es mayor o igual a 90. -
"Bueno" si la calificación es mayor o igual a 80 y menor que 90. -
"Aceptable" si la calificación es mayor o igual a 70 y menor que 80. -
"Insuficiente" si la calificación es menor que 70.*/

public class ClasificarEstudiante003 {
    public static void clasificarEstudiante() {
        int calificacion;
        System.out.println("Ingrese la calificacion del estudiante (entre 0 y 100): ");
        calificacion = entrada.nextInt();

        if(calificacion >= 90){
            System.out.println("Exelente");
        }else if(calificacion >= 80 && calificacion < 90){
            System.out.println("Bueno");
        }else if(calificacion >= 70 && calificacion < 80){
            System.out.println("Aceptable");
        }else{
            System.out.println("Insuficiente");
        }
    }
}
