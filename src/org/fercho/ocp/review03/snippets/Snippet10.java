package org.fercho.ocp.review03.snippets;

import java.time.DayOfWeek;

/*
Q10. Given the following method, how many lines contain compilation errors?

        private DayOfWeek getWeekDay(int day, final int thursday) {
                int otherDay = day;
                int  Sunday = 0;
                switch(otherDay) {
                    default:
                    case 1: continue;
                    case thursday: return DayOfWeek.THURSDAY;
                    case 2, 10: break;
                    case Sunday: return DayOfWeek.SUNDAY;
                    case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
                }

                return DayOfWeek.FRIDAY;
            }   

A. None, the code compiles without  issue.

B. 1

C. 2

D. 3

E. 4

Correcto. 4 errores.
* 1. El switch no soporta el continue.
* 2. thursday, es pasado como parametro. Marcarlo como final no hace diferencia.
* 3. Sunday, no esta marcada como final.
* 4. DayOfWeek.MONDAY, no es del tipo otherDay, int.                                

F. 5

G. 6

H. The code compiles but may produce an error at runtime.

A10. E. 

 */
public class Snippet10 {

    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch (otherDay) {
            default:
            // case 1:
            //     continue;
            // case thursday:
            //     return DayOfWeek.THURSDAY;
            case 2, 10:
                break;
            // case Sunday:
            //     return DayOfWeek.SUNDAY;
            // case DayOfWeek.MONDAY:
            //     return DayOfWeek.MONDAY;
        }

        return DayOfWeek.FRIDAY;
    }

    public static void main(String[] args) {

        Snippet10 sp10 = new Snippet10();
        sp10.getWeekDay(1, 2);
        System.out.println(sp10.getWeekDay(1, 2));
    }

}
