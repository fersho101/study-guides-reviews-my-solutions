package org.fercho.ocp.review03.snippets;
/*
Q07. Assuming weather is a well-formed nonempty array, which code snippet, when inserted independently into the blank in the following code, prints all of the elements of the weather?

A. int i = weather.length; i > 0; i--
Incorrecto. Lanza una exception, sale del rango, ademas, faltaria el elem 0.

B. int i = 0; i <= weather.length - 1; i++
Correcto, aunque se puede simplificar, con un < y eliminando el -1.

C. var w: weather
Incorrecto. Se lograria modificando el print como System.out.print(w + " ");

D. int i = weather.length - 1; i >= 0; i--
Correcto. Imprime todos los elementos, empezando del mayor.

E. int i = 0, int j=3; i <= weather.length; ++i
Incorrecto. invalida la redeclaracion de j, solo se permite un tipo por expresion, aun que sean del mismo tipo.

F. int i = 0; ++i < 10 && i < weather.length;
Incorrecto. No imprime el index 0, y los elementos en indexes mayores a 9;

G. None of the above.

A07. B, D.

 */

public class Snippet07 {
    public static void main(String[] args) {
        int[] weather = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        for (int i = 0; ++i < 10 && i < weather.length;) {
            System.out.print(weather[i] + " ");
        }
    }

}
