package org.fercho.ocp.review02.q19;

/*
 * Q19. What is the result of executing the following code snippet?
 * A. start is 0.
 * B. start is -128. -> Correcto. al incremetar 1 al maximo valor permitido toma  numero negativo debido al overflow. 
 * C. start is 127.
 * D. end is 8.
 * E. end is 11
 * F. end is 12. -> Correcto. start incrementa a 8 y luego se suman los 4 de end dando 12.
 * G. the code does not compile.
 * H. The code compiles but throws an exeption at runtime.
 * 
 * A19. B, F.
 */
public class Main {
    public static void main(String[] args) {
        int start = 7;
        int end = 4;

        end += ++start; //12
        start = (byte)(Byte.MAX_VALUE + 1);

        System.out.println("start: " + start);
        System.out.println("end: " + end);
    }

}
