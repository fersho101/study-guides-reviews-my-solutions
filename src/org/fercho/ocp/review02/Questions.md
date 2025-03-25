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

### _Q12.The ___ operator increase a value and return the original value, while the ___ operator decrease a value and returns the new value._

A. post-increment, post-increment

B. post-decrement,post-decrement

C. post-increment, post-decrement

D. post-increment, pre-decrement

* **Correcto**. _post_ indica el valor es regresado antes de la operacion, _pre_ indica la operacion es aplicada y entonces el nuevo valor es retornado.

E. pre-increment, pre-decrement

F. pre-increment, post-decrement

### _AQ12. D._

### _Q14. Which of the following statements are correct?._

A. The return value of an assigment operation expression can be void.

* **Incorrecto**. No se puede asignar un void.

B. The inequality operator _(!=)_ can be used to compare objects.

* **Correcto**. al igual que el equality operator _(==)_.

C. The equality operator _(==)_ can be used to compare a boolean value with a numeric  value.

* **Incorrecto**. No se puede compararar un boolean con un tipo numerico.

D. During runtime, the _&_ and _|_ operators may cause only the left side of the expression to be evaluated.

* **Incorrecto**.  Los operadores logicos comparan ambos lados. El operador &&  y  el || son los que actuan como short-circuit.

E. The return value of an assigment operation espression is the value of the newly assigned variable.

* **Correcto**. Es el nuevo valor asignado.

F. In Java, _0_ and _false_ may be used interchangeably.

* **Incorrecto**. En Java no.

G. The logical complement operator (!) cannot be used to flip numeric values.

* **Correcto**. No es para eso. Es para intecambia valores boleanos.

### _A14. B, E, G._

### _Q15. Which operators take three operands or values?._

A. ```=```

B. ```&&```

C. ```*=```

D. ```?  :```

* **Correcto**. Unico asertado, el ternary operator.

E. ```&```

F. ```++```

G. ```/```

### _A15. D._

### _Q16. How many lines of the following code contain compiler errors._

```java
int note = 1 * 2 + (long)3;
short melody = (byte)(double)(note *= 2 );
double song = melody;
float symphony = (float)((song == 1_000f) ? song * 2L : song);
```

A. 0

B. 1

* **Correcto**. Unico correcto. en la primer linea, no se puede almacenar un _long_ en un _int_, es el unico error.

C. 2

D. 3

E. 4

### _A16. B._

### _Q18. Which of the following can be used to change the order of the operation in an expression?._

A. ```[]```

B. ```<>```

C. ```()```

* **Correcto**. Unico correcto. Los parentesis.

D. ```\/```

E. ```{}```

F. ```""```

### _A20. Which of the following statements about unary operatora are true?_

A.  Unary operators are always executed before any surronding numeric binary or ternary operators.

* **Correcto**. Estos tienes mas precedencia.

B. The - operator can be used to flip a boolean value.

* **Incorrecto**.

C. The pre-increment operator ++ returns the value of the variable before the increment is applied.

* **Incorrecto**.

D. The post-decrement operator -- returns the value of the variable before the decrement is applied.

* **Correcto**. primero regresa el valor despues realiza el decremento.

E. the ! operator cannot be used on numeric values.

* **Correcto**. solo es aplicable en booleanos.

F. None of the above.

* **Incorrecto**.

### _A20. A, D, E._
