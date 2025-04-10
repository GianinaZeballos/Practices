package CorridasEnFrio;

public class Cadena200 {
public static void cadena() {
    String nombre1 = "Pedro";
    String nombre2 = new String("Pedro");
    if(nombre1 == nombre2) {
        System.out.println("Son iguales");
    }else{
        System.out.println("No son iguales");
       }
    } // No son iguales Porque nombre1 y nombre2 no apuntan al mismo objeto, aunque el texto sea igual.

    public static void cadena2(){
        String nombre1 = "Pedro";
        String nombre2 = new String("Pedro");
        String mensaje= nombre2.equals(nombre1) ? "Son iguales" : "No son iguales";
        System.out.println(mensaje);
    }
}
