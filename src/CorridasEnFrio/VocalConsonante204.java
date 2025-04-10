package CorridasEnFrio;

public class VocalConsonante204 {
    public static void vocalConsonante(){
         String palabra= "UTEC";
         String result;
         char a = palabra.charAt(2);
         // charAt(int index) se usa en Java para obtener un solo carácter de una cadena (String) en la posición indicada.
         // o sea que U-0 T-1 E-2 C-3 por lo tanto palabra.charAt(2) es equivalente a E
         switch(a){
             case 'a': case 'e': case 'i': case 'o': case 'u':
             result = "Es una vocal";
             break;

             case 'b': case 'c': case 'd': case 'f': case 'g':
             case 'h': case 'j': case 'k': case 'l': case 'm':
             case 'n': case 'p': case 'q': case 'r': case 's':
             case 't': case 'v': case 'w': case 'x': case 'y': case 'z':
             result = "Es una consonante";
         default:
             result= "No es vocal ni consonante";
         }
        System.out.println(result);
    }
}
// No es vocal ni consonante ya que en el swutch se pone a sin las comilas, sino si seria una vocal

