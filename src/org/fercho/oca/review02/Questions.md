# OCA - Study Guide  

## Chapter 2. Operators

## Review questions

### _Q01. Which of the following Java operators can be used with boolean variables? (Choose all that apply)_

A. ```==```

* **Correcto**. Opera tanto en primitivos como en objetos.

B. ```+```

* **Incorrecto**. Para sumo o concatenacion de Strings.

C. ```--```

* **Incorrecto**. Opera en valores numericos.

D. ```!```

* **Correcto**. _Logical complement operator_ Exclusivo de valores booleanos, invierte valores booleanos.

E. ```%```

* **Incorrecto**. _Modulus_, opera en valores numericos primitivos.

F. ```<=```

* **Incorrecto**. Solo valores numericos.

### _A01. A, D._

### _Q02. What data type (or types) will allow the following code snippet to compile? (Choose all that apply)_

```java
byte x = 5;
byte y = 10;
_____ z = x + y;
```

A. int

* **Correcto**. _x_ y _y_ son  promovidas a _int_ en la operacion aritmetica.

B. long

* **Correcto**. El _int_ cabe perfectamente en un _long_

C. boolean

** **Incorrecto**.  No compila con boolean.

D. double

* **Correcto**. El _int_ cabe bien en double.

E. short

* **Incorrecto**. El _int_ es mas grande que el short.

F. byte

* **Incorrecto**. El _int_ es mas grande que el byte.

### _A02. A, B, D._

### _Q04. What change would allow the following code snippet to compile? (Choose all that apply)_

```java
3: long x = 10;
4: int y = 2 * x;
```

A. No change; it compiles as is.

* **Incorrecto**. No compila por el tipo_long_ en _x_.

B. Cast x on line 4 to int.

* **Correcto**.

C. Change the data type of x on line 3 to short.

* **Correcto**. _x_ del tipo _short_ se promociona a _int_ en la operacion aritmetica.

D. Cast _2 * x_ on line 4 to _int_.

* **Correcto**. Casteasr toda la expresin a _int_.

E. Change the data type of y on line 4 to short.

* **Incorrecto**. _long_ en _short_  no cabe.

F. Change the data type of y on line 4 to long.

* **Correcto**. Serian del mismop tipo _long_.

### _A04. B, C, D, F._


