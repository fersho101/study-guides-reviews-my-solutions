package org.fercho.ocp.review02.q17;

/*
 * Q17. Given the following code snipped, what are the values of the varibles after it is executed?
 * 
 * A. ticketsSold is 8.
 * B. ticketsTaken is 2.
 * C. ticketsSold is 6. -> Correcto. 
 * D. ticketsTaken is 6.
 * E. ticketsSold is 7.
 * F. ticketsTaken is 4. --> Correcto.
 * G. The code does not compile.
 * 
 * A17. C, F.
 * 
 */
public class Main {
    public static void main(String[] args) {
        int ticketsTaken = 1;
        int ticketsSold = 3;

        ticketsSold += 1 + ticketsTaken++;       
        ticketsTaken *= 2;
        ticketsSold += (long) 1;

        System.out.println("ticketsSold: " + ticketsSold);
        System.out.println("ticketsTaken: " + ticketsTaken);
    }
}
