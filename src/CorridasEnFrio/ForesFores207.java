package CorridasEnFrio;

public class ForesFores207 {
    public static void forcito() {
        int suma = 0;
        int contador = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                suma += i;
                contador++;
            }
        }
        System.out.println("suma es " + suma);
        System.out.println("Contador es " + contador);
    }

    public static void forcitote() {
        int acumulado = 55;
        for (int j = 10; j < 60; j += 2) {
            acumulado += 10;
        }
        System.out.println(acumulado);
    }

    public static void forReforsado() {
        String datos = "aprendiendo el uso de java";
        String vocales = "";
        boolean exp = true;

        for (int i = 0; i < datos.length(); i++) {
            exp = datos.charAt(i) == 'a' || datos.charAt(i) == 'e' || datos.charAt(i) == 'i' || datos.charAt(i) == 'o' || datos.charAt(i) == 'u';
            vocales = exp ? vocales = vocales + datos.charAt(i) : vocales;
        }
        System.out.println(vocales);
    }

    public static void forConIF() {
        int acumulador = 34;
        double divid = 350;

        for (int i = 35; i < 52; i = i + 3) {
            acumulador += 10 + i;
            divid /= 2;
        }
        if (acumulador == 378) {
            System.out.println("Ejecute la primer conducion");
        } else if (acumulador == 349) {
            System.out.println("Ejecute la segunda conducion");
        } else {
            System.out.println("Ejecute el else");
        }
        System.out.println(acumulador);
        System.out.println(divid);
    }

    public static void fortuna() {
        String palabra = "mesa";
        String resultado = hacerVuelta(palabra);
        System.out.println(resultado);
    }

    public static String hacerVuelta(String palabra) {
        String result = "";
        for (int p = palabra.length() - 1; p >= 0; p--) {
            result = result + palabra.charAt(p);
        }
        return result;
    }

}
