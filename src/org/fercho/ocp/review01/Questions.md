# Chapter 1. Building Blocks

## Review questions

### _Question 01. Which of the following are legal entry points methods that can be run from the command line?_

A.  ```private static void main(String[] args)```

* Incorrecto por que el metodo main debe ser _public_.

B.  ```public static final main(String[] args)```

* Incorrecto. El metodo main debe de tener el tipo de retorno _void_.

C.  ```public void main(String[] args)```

* Incorrecto. El metodo main debe de ser _static_.

D.  ```public static final void main(String[] args)```

* Correcto. _final_ es redundante pero compila.

E.  ```public static void main(String[] args)```

* Correcto.

F.  ```public static main(String[] args)```

* Incorrecto. El metodo main debe de tener el tipo de retorno _void_

### _A01. D, E_

### _Q02. Which answer options reperesent the order in which the following statements can be assembled into a program that will compile successfully?_

```java
X: class Rabbit {}

Y: import java.util.*;

z: package animals;

```

A.  X, Y, Z.

B: Y, Z, X.

C. Z, Y, X.

* Correcto.  Primero los paquetes en caso de exixtir. Segundo los imports, en caso de existir.  Por ultimo la definicion de la clase.

D. Y, X.

* Correcto.

E. Z, X.

* Correcto.

F. X, Z.

G. None of the above.

### _A02. C, D, F._

### _Q03. Which of the following are true?_

```java
public class Bunny {
    public static void main(String[] x) {
        Bunny bun = new Bunny();
    }
}
```

A. Bunny is a class.

* Correcto.

B. bun is a class.

* Incorrecto. _bun_ es una instancia.

C. _main_ is a class.

* Incorrecto _main_ es un metodo estatico.

D. _Bunny_ is a reference to an object.

* Incorrecto.

E. _bun_ is a reference to an object.

* Correcto. _bun_ es una instancia de clase.

F. _main_ is a reference to an object.

* Incorrecto.

G. The _main()_ method doesn't run because the parameter name is incorrect.

* Incorrecto. El metodo _main()_ es correcto.

### _A03. A, E._

### _Q04. Which of the following are valid Java indetifiers?_

A. ```_```

* Incorrecto. Single underscore no es valido.

B. ```_helloWorld$```

* Correcto.

C. ```true```

* Incorrecto. _true_ es una palabra reservada.

D. ```java.lang```

* Incorrecto. No esta permitido el punto.

E. ```Public```

* Correcto. Por la distincion entre mayusculas y minusculas.

F. ```1980_s```

* Incorrecto. El primer caracter no puede ser numero.

G. ```_Q2_```

### _A04. B, E, G._

### _Q05. _