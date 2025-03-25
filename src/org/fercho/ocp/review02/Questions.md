# OCP - Study Guide  

## Chapter 2. Operators

## Review questions

### _Question 01. Which of the following Java operators can be used with boolean variables?_

A. ```==```

* **Correcto**. _equality operator_ , puede ser usado en primitivos y tipos de refernecia.

B. ```+```

* **Incorrecto**- __arithmetic operator_, exclusivo tipos numericos.

C. ```--```

* **Incorrecto**- __arithmetic operator_, exclusivo tipos numericos.

D. ```!```

* **Correcto**. _logical complement_, exclisivo valores _boolean_

E. ```%```

* **Incorrecto**. _modulus_, exclusivo valores numericos primitivos.

F. ```~```

* **Incorrecto**. _bitwise operator_,  solo valores enteros.

G. _Cast_ with (boolean)

* **Correcto**.  Se puede catear iuna variable _boolean_, por que _boolean_ es un tipo.

### _A01. A, D, G._

### _Q02. What data type (or types) will allow the following code snippet to compile?._

```java
byte apples = 5;
short oranges = 10;
____ bananas = apples + oranges;
```

A.  ```int```

* **Correcto**. Son promovidos automaticamente a _int_

B. ```long```

* **Correcto**. El _int_ cabe perfectamente en _long_

C. ```boolean```

* **Incorrecto**. Valor booleano, no trabaja con valores numericos.

D. ```double```

* **Correcto**. _int_ cabe en _double_.

E. ```short```

* **Incorrecto**. Necesita un _cast_ explicito, por ser tipos mas pequenños

F. ```byte```

* **Incorrecto**. Necesita un _cast_ explicito, por ser tipos mas

### _A02. A, B, D._

### _Q03. What change, when applied independently, would allow the following code snnipet to compile?._

```java
3: long ear = 10;
4: int hearing = 2 * ear;
```

A.  No change, it compiles as is.

* **Incorrecto**.  Necesita un _cast_  en _hearing_.

B. Cast _ear_  on line 4 to _int_

* **Correcto**.

C. change the data type of _ear_ on line 3 to _short_

* **Correcto**. Y sera promovido a _int_ en la operacion aritmetica.

D. Cast _2 * ear_ on line 4 to -_int_

* **Correcto**.

E. Change the data type of _hearing_ on line 4 to _short_.

* **Incorrecto**. _short_ es mas pequeño que _int_

F. Change the data type of _hearing_ on line 4 to _long_.

* **Correcto**.  Asi seria el mismo tipo que _ear_.

### _Q04.What is the output of the following code snipped?._

```java
3: boolean canine = true, wolf = true;
4: int teeth = 20;
5: canine = (teeth != 10) ^ (wolf=false);
6: System.out.println(canine+", "+teeth+", "+wolf );
```

A. ```true, 20, true```

* **Incorrecto**.

B. ```true, 20, false```

* **Correcto**.

C. ```false, 20, true```

* **Incorrecto**.

D. ```false, 20, false```

* **Incorrecto**.

E. The code will not compile because of line 5.

* **Incorrecto**. Compila.

F.None of the above.

* **Incorrecto**. B es correcto.

### _A04. B._

### _Q05. Which of the following operator are ranked in increasing ot the same order of precedence? Assume the + operator is binaryaddition, not the unary form._

A. ```+, * , %, --```

* **Correcto**.

B.```++, (int), *```

* **Incorrecto**.

C.```0, ==, !```

* **Correcto**.

D.```(short), =, !, *```

* **Incorrecto**.

E.```*, /, %, +, ==```

* **Incorrecto**.

F.```!, ||, &```

* **Incorrecto**.

G.```^, +, =, +=```

* **Incorrecto**.

### _A05. A, C._
