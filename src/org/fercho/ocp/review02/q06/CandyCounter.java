package org.fercho.ocp.review02.q06;
/*
 * Q06. What is the output of the following program?
 * A. 4, 6 ,6.0
 * B. 3, 5, 6
 * C. 3, 6, 6
 * D. 4, 5, 6
 * E. The code does not compile because of line 9.
 * F. None of the above.
 * 
 * A06. F. No compila. Error en line 3. El cast solo era aplicable a fruit.
 * En caso de ser eliminado el error, B, seria la opcion correcta, ya que los valores flaot son truncados cuando son casteados a int.
 */

public class CandyCounter {

    static long addCandy(double fruit, double vegetables) {
        // return (int) fruit + vegetables; // Line 3
        return (int) (fruit + vegetables); // Line 3  arreglada
    }

    public static void main(String[] args) {
        System.out.println(addCandy(1.4, 2.4f) + ", ");
        System.out.println(addCandy(1.9, (float) 4) + ", ");
        System.out.println(addCandy((long) (int) (short) 2, (float) 4));
    }
}
