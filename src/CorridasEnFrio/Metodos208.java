package CorridasEnFrio;

public class Metodos208 {

    public static void metodos() {
        int a = 4;
        int b = 2;
        int valor = metodo1(a, b);
        System.out.println(valor);

    }

    public static int metodo1(int a, int b) {
        int result = metodo2(++a, b);
        return result;
    }

    public static int metodo2(int a, int b) {
        return a * b;
    }
}
