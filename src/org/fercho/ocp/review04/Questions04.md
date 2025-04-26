# OCP - Study Guide  

## Chapter 4. Core APIs

## Review questions

### _Q02. Which of these array declartions are not legal?._

A. ```int [][] score = new int [5][];```

* **Incorrecto**. Expresion valida.

B. ```Object [][][] cubbies = new Object[3][0][5];```

* **Incorrecto**. Expresion valida.

C. ```String beans[] = new beans[6];```

* **Correcto**. Invalido por que beans no es un tipo de dato.

D. ```java.util.Date[]  dates[] = new java.util.Date[2][];```

* **Incorrecto**. Expresion valida.

E. ```int [][] types = new int[];```

* **Correcto**. Falta el valor de la dimension y las dimensiones son incorrectas.

F. ```int [][] java = new int[][];```

* **Correcto**. Falta el valor de la dimension.

### _Q03. Note that March 13, 2022 is the weekend when we spring forward, and November 6, 2022 is when we fall back for daylinght saving tme. Which of the following can fill in the blank without code throwing an exception?_

```java
var zone = ZoneId.of("US/Eastern");
var date = _____________;
var time = LocalTime.of(2, 15);
var z = ZonedDateTime.of(date, time, zone);
```

A. ```LocalDate.of(2022, 3, 13)```

* **Correcto**.

B. ```LocalDate.of(2022, 3, 40)```

* **Incorrecto**. No hay dia 40.

C. ```LocalDate.of(2022, 11, 6)```

* **Correcto**.

D. ```LocalDate.of(2022,1, 7)```

* **Correcto**.

E. ```LocalDate.of(2022, 2, 29)```

* **Incorrecto**. No hay febrero 29.

F. ```LocalDate.of(2022, MonthEnum.MARCH, 13)```

* **Incorrecto**. No hay MonthEnum, solo Month.

### _A03. A, C, D._

### _Q06. How many of this lines contains a compiler error?._

```java
double one = Math.pow(1,2);
int two = Math.round(1.0); // regresa in long poq se esta llamando con double 
float three = Math.random(); // regresa un double
var doubles = new double[] {one, two, three};
```

A. 0

B. 1

C. 2

D. 3

E. 4

### _A06. C._

### _Q07. Which of these statements is true of the following two values?._

```java
2022-08-28T05:00 GMT-04:00 // 5 + 4 = 9:00 GMT
2022-08-28T09:00 GMT-06:00 // 9 + 6 = 15:00 GMT
```

A. The first date/time is earlier.

B.  The second date/time is earlier.

C. Both date/time are the same.

D. The date/time are two hours apart.

E. The date/time are six hours apart.

F. The date/time are 10 hours apart.

### _A07. A, E._

### _Q09. Which of the following are true about arrays?._

A. The first element is index 0. **Correcto**

B. The first element is index 1.

C. Arrays are fixed size.  **Correcto**

D. Arrays are inmutable.

E. Calling equals() on two different arrays containing the same primitive values always return true.

F. Calling equals() on two different arrays containing the same primitive values always return false.

G. Calling equals() on two different arrays containing the same primitive values can return true or false.

### _A09. A, C._

### _Q10. How many of these lines contains a compiler error?._

```java
int one = Math.min(5, 3);
long two = Math.round(5.5);
double three = Math.floor(6.6);
var doubles = new double[] {one, two, three};
```

A. 0 **Correcto** Todas las expresiones esta bien redactadas.

B. 1

C. 2

D. 3

E. 4
