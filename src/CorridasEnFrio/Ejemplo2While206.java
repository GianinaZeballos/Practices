package CorridasEnFrio;

public class Ejemplo2While206 {
    public static void otroWhileMas() {
        String palabra = "roma";
        int i = palabra.length() - 1;
        String result = "";
        do {
            result = result + palabra.charAt(i) + result;
            i--;
        } while (i >= 0);
        System.out.println(result);
    }


    public static void otroWhileMas2() {
        int i = 15;
        do {
            System.out.println("el valor es: " + i);
            i++;
        } while (i < 10);
    }
}
