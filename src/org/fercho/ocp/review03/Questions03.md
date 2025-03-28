# OCP - Study Guide  

## Chapter 3. Making Decisions

## Review questions

### _Q01. Which of the following data types can be used in a switch expresion?_

A. ```enum```

* **Correcto**.

B. ```int```

* **Correcto**.

C. ```Byte```

* **Correcto**.

D. ```long```

* **Incorrecto**. Demasiodo grande.

E. ```String```

* **Correcto**.

F. ```char```

* **Correcto**.

G. ```var```

* **Correcto**. Si el tipo se resuelve a un tipo que soporte el _switch expression_

H. ```double```

* **Incorrecto**.

### _Q03. Which of the following data types are permitted on the right side of a for-each expression?._

A. ```Double[][]```

* **Correcto**.

B. ```Object```

* **Incorrecto**.

C. ```Map```

* **Incorrecto**.

D. ```List```

* **Correcto**.

E. ```String```

* **Incorrecto**.

F. ```char[]```

* **Correcto**.

G. ```Exception```

* **Incorrecto**.

H. ```Set```

* **Correcto**.

### _A03. A, D, F, H._

### _Q06. Which statements about decision structures are true?._

A. A _for-each_ loop can be executed on any Collections Framework object.

* **Incorrecto**. En solo los que implementan _java.lang.iterable_ o _arrays_.

B. The body of a _while_ loop is guaranteed to be executed at least once.

* **Incorrecto**. Puede no ejecutarse ni una sola vez si la condicion no se cumple.

C. The conditional expression of a _for_ loop is evaluated before the first execution of the loop body.

* **Correcto**. Se evalua primero, en caso de no cumpir, el flujo de ejecucion salta el loo entero.

D. a _switch expression_ that takes a _String_ and assigns the result to a variable requires a _default_ branch.

* **Correcto**. Todos los posible casos deben de estar cubiertos.

E. The body of a _do/while_ loop is guaranteed to be executed at least once.

* **Correcto**. Siempre se executa por lo menos una vez.

F. An _if_ statement can have multiple corresponding _else_ statements.

* **Incorrecto**. A cada _if_ corresponde solo un _else_ opcional.

### _Q14.Which statement about the following code snippet are correct?_

```java
for (var penguin : new int[2])
    System.out.println(penguin);
var ostrich = new Character[3];
for (var emu : ostrich)
    System.out.println(emu);
List<Integer> parrots = new ArrayList<Integer>();
for(var macaw: parrots)
    System.out.println(macaw);
```

A. The data type of penguin is Integer.

* **Incorrecto**.

B. The data type of penguin is int.

* **Correcto**.

C. The data type of emu is undefined.

* **Incorrecto**.

D. The data type of emu is Character.

* **Correcto**.

E. The data type of macaw is List.

* **Incorrecto**.

F. The data type of macaw is Integer.

* **Correcto**.

G. None of the above, as the code does not compile.

* **Incorrecto**. El codigo compila sin problema.

### _A14.B, D, F._
