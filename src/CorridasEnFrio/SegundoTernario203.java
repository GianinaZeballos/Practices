package CorridasEnFrio;

public class SegundoTernario203 {
public static void otroTernario(){
    int a = 15;
    int b= 41;
    double c= 45.5;
    boolean esta= false;
    //comparador ternario compuesto o anidado
    int resultado = (a+b)% 7==0 && c*2 > 90 && esta ? 50 : a % 2==0 ? 100 : 150;
    System.out.println(resultado);
}
}
