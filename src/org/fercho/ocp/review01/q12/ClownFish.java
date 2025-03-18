package org.fercho.ocp.review01.q12;

/*
 * 12. Which statement about the following class are correct? 
 * A. Line 2 generates a compiler error.
 *  Correcto. Error por colocar dos diferentes tipos de una misma sentencia.
 * B. Line 3 generates a compiler error.
 * Incorrecto.
 * C. Line 4 generates a compiler error.
 * Correcto. Java no permite asignar valor en el parametro del metodo.
 * D. Line 7 generates a compiler error.
 * Correcto. la variable fins esta fuera del scope.
 * E. The code prints 0.
 * F. The code prints 2.0
 * G. The code prints 2.
 * H. The code prints 3.
 * 
 * A12. A,C,D.
 */

/*  
public class ClownFish {
   int gills = 0,  double weight = 2; // Line 2
   {  int fills = gills; } // Line 3

   void print(int length = 3) { // Line 4
       System.out.println(gills);
       System.out.println(weight);
       System.out.println(fins); //Line 7
       System.out.println(length);
   }
}
 */

public class ClownFish {
    int gills = 0;
    double weight = 2;
    {
        // int fins = gills;
    }

    public void print(int length) {
        System.out.println(gills);
        System.out.println(weight);
        // System.out.println(fins);
        System.out.println(length);
    }
}
