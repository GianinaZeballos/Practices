package Modulo1;
import static utils.Escaner.entrada;

/* 002-Complete la función 'evaluarAprobacion' que toma una calificación como argumento y
 devuelve un mensaje indicando si el estudiante aprueba o reprueba el curso.
 La calificación es un número entre 0 y 100 (ambos inclusive) Complete la función evaluarAprobacion de manera que,
 si la calificación es mayor o igual a 60, devuelva "Aprobado". Si la calificación es menor a 60, devuelva "Reprobado". */

public class EvaluarAprobacion002 {
    public static void evaluarAprobacion(){
    int calificacion;
        System.out.println("Ingrese la calificacion del estudiante (entre 0 y 100): ");
        calificacion = entrada.nextInt();
        if(calificacion >= 60){
            System.out.println("Aprobado");
        }else {
            System.out.println("Reprobado");
        }
    }
}
