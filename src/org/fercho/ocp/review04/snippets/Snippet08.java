package org.fercho.ocp.review04.snippets;

/*
Q08. Which of the following returns 5 when run independently?

A.  builder.chatAt(4) -> Correcto.

B. builder.replace(2, 4, "6").charAt(3) -> Correcto

C. builder.replace(2, 5, "6").charAt(2) -> Regresa 6

D. string.charAt(5) -> Incorrecto, no exite index 5 para el string "12345".

E. string.length -> Incorrecta falta parentesis, string.length() si regresaria 5.

F. string.replace("123", "1").charAt(2) -> "145" -> "5" Correcto regresa "5".

G. None of the above. Incorrecto, si existen expresiones correctas.

A08.  A, B, F
 */
public class Snippet08 {

    public static void main(String[] args) {
        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(string.replace("123", "1").charAt(2)); // -> "145" -> "5"
        System.out.println(builder.replace(2, 5, "6").charAt(2)); // "126" -> "6"
    }
}
