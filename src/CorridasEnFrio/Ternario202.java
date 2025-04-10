package CorridasEnFrio;

public class Ternario202 {
    public static void ternario(){

    int a=5 ,b=10, c=30;
    //  (  condicion  )  ? true o false
    int resultado= a*b>c ? 100  :  20;
        System.out.println(resultado);
        //Como la condición es verdadera, se asigna el primer valor (100) a resultado
    }
}
/*El operador ternario en Java es una forma abreviada de escribir un if-else.

-> condición ? valor_si_verdadero : valor_si_falso;

es equivalente a decir:
if (condición) {
    resultado = valor_si_verdadero;
    } else {
    resultado = valor_si_falso;
}

*/