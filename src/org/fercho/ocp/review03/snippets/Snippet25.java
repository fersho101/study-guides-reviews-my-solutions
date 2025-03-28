package org.fercho.ocp.review03.snippets;

/*
Q25. What is the output of the following code snippet?

        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";

        int p = -1;
        switch (instrument) {
            case "bass":
                break;
            case CELLO:
                p++;
            default:
                p++;
            case "VIOLIN":
                p++;
            case "viola":
                ++p;
                break;
        }
        System.out.println(p);

A. -1

B. 0

C. 1

D. 2 -> Correcto.

E. 3

F. The code does not compile.

A25. D. Al no encontra opcion correcta entra la default, y sigue hasta encontrar un break; incrementando p 3 veces. Salida 2.
 */
public class Snippet25 {
    public static void main(String[] args) {
        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";

        int p = -1;
        switch (instrument) {
            case "bass":
                System.out.println("bass");
                break;
            case CELLO:
                p++;
            default:
                p++;
            case "VIOLIN":
                p++;
            case "viola":
                ++p;
                break;
        }
        System.out.println(p);
    }
}
