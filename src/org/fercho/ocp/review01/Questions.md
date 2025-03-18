# OCP - Study Guide  

## Chapter 1. Building Blocks

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

### _Q08. Which of the following code snippet about var compile without issue when used in a method?_

A. ```var spring = null;```

* Incorrecto.  _var_ no se puede inicializar en _null_.

B.  ```var fall = "leaves"```;

* Correcto.

C. ```var evening = 2; evening = null;```

* Correcto. Despues de inicializarse _var_ con un valor valido, es posible cambiar a _null_.

D. ```var night = Integer.valueOf(3);```

* Correcto.

E. ```var day = 1/0;```

* Correcto.

F. ```var winter = 12, cold;```

* Incorrecto. Mala declaracion de variables.

G. ```var fall = 2, autum = 2;```

* Incorrecto. No es valido declar con _var_ multiples variables.

H. ```var morning = ""; morning = null;```

* Correcto. Son dos sentencia independientes;

### _Q09. Which of the following are correct?_

A. An instance variable of type _float_ default to _0_.

* Incorrecto. El valor default de los flotantes es _0.0f_.

B. An instance variable of type _char_ default to _null_.

* Incorrecto. Los primitivos no puede tener _null_  por default.

C. A local variable of type _double_ defaults _0.0_.

* Incorreco. Las variables locales no tienen valor _default_. Se deben de inicializar antes de usare.

D. A local variable of type _int_ defaults _null_.

* Incorrecto. Variables locales deben inicializarse.

E. A class variable of type _String_ defaults to null.

* Correcto.

F. A class variable of type _String_ defaults to the empty string _""_.

* Incorrecto. Variables de clase _String_ default a _null_.

### _Q10. Whisch of the following expressions, When inserted independently into the blank line, allow the code to compile?_

```java
public class Bunny {
    public static void main(String[] x) {
        Bunny bun = new Bunny();
    }
}
```

A. ```3_1```

* Correcto.

B. ```1_329_.0```

* Incorrecto. guion bajo no puede estar antes de punto.

C. ```3_13.0_```

* Incorrecto. Guion bajo no puede estar al final.

D. ```5_291._2```

* Incorrecto. Guion bajo no puede estar seguido del punto.

E. ```2_234.0_0```

* Correcto.

F. ```9___6```

* Correcto.

G. ```_1_3_5_0```

* Incorrecto. Underscore no puede estar al inicio del literal.

### _Q11. Given the following two class files, what is the maximum number of import that can be removed and have the code still compile?_

* Water.java

```java

package aquarium;

public class Water {}

```

* Tank.java

```java
package aquarium;

import java.lang.*; // Es importado automaticamente
import java.lang.System; // El java.lang es importado es impoertado en automatico.
 import aquarium.Water;  // No es necesario ya que las clases se encuentran en el mismo paquete.
 import aquarium.*; //No es necesario

public class Tank {
    public void print(Water water) {
        System.out.println(water);
    }
}
```

A. 0

B. 1

C. 2

D. 3

E. 4

F. Does not compile.

### _A11. E. Ninguno de los **imports** es necesario._

### _Q13. Given the following class, which of the following snippets can independently be inserted in place of INSERT IMPORTS HERE and have the code compile?._

```java

package aquarium;

public class Water {
    boolean salty = false;
}
```

```java

package aquarium.jellies;

public class Water {
    boolean salty = true;
}
```

```java
package employee;

INSERT IMPORTS HERE

public class WaterFiller {
    Water water;
}
```

A

```java
// Correcto.  Por que importa todas clases en el package aquarium.
import aquarium.*;
```

B

```java
// Correcto. Por que importa Water por classname. Por className tiene precedencia sobre el wildcard
import aquarium.Water; 
import aquarium.jellies.*; 
```

C

```java
// Correcto. Por que importa Water por classname. Por className tiene precedencia sobre el wildcard
import aquarium.*; 
import aquarium.jellies.Water; 
```

D

```java
// Incorrecto. Java no se sabra cual de los 2 Water class usar.
import aquarium.*; 
import aquarium.jellies.*; 
```

E

```java
// Incorrecto. Por que no se puede usar la misma clase en 2 imports
import aquarium.Water; 
import aquarium.jellies.Water; 
```

F. None of these imports can meke the code compile.

### _A13. A, B, C._

### _Q14. ?Which of the following statements about the code snippet are true?_

```java
short numPets = 5L; // Line 3
int numGrains = 2.0; // Line 4
String name = "Scruffy"; // Line 5
int d = numPets.length(); // Line 6
int e = numGrains.length; // Line 7
int f = name.length(); // Line 8
```

A. Line 3 generates a compiler error.

* Correcto. La _L: convierte al literal en un _long_, el cual no cabe en un _short_ directamente.

B. Line 4 generates a compiler error.

* Correcto. El literal es un _double_ .

C. Line 5 generates a compiler error.

* Incorrecto.  Compila sin problema.

D. Line 6 generates a compiler error.

* Correcto.  _numsPets_  es un primitivo.

E. Line 7 generates a compiler error.

* Correcto.  _numsPets_  es un primitivo.

F. Line 8 generates a  compiler error.

### _Q15. Which of the following statements about garbage collector are correct?_

A. Calling _System.gc()_ is guaranteed  to free up memory by destroying objects elegible for garbage collection.

* Incorrecto. Llamar al _System.gc()_ no es garantia de que corra. JVM es libre de inganora el  _System.gc()_.

 B. Garbage collection runs on a set schedule.

* Incorrecto. No es calendarizable.

 C. Garbage collecton allows the JVM to reclaim memory for other objects.

* Correcto. Es el proposito del _Garbage collection_, Reclamar memoria usaada.

 D. Garbage  collection run when your program has used up half the available memory.

* Incorrecto. No es garantia de que corra cuando esto suceda.

 E. An object may be elegible for garbage collection but never removed from the heap.

* Correcto. Puede que nunca sea colectado y el programa termine.

 F. An object is elegible for garbage collection once no reference to it are accesible in the program.

* Correcto. El un criterio de elegibilidad para garbage collector.

G. Marking a variable final means its asociated object will never be garbage collected.

* Incorrecto. Eso significa que es una constante en su scope.

### _A15. C, E, F._

### _Q16. Whichare true about this code?_

```java
var blocky = """
    squirel \s
    pigeon      \
    termite""";

System.out.print(blocky);    
```

A. It output two lines.

* Correcto. Imprime 2 lineas.

 B. It outputs three lines.

* Incorrecto. solo imprime 2 lineas.

C. It outputs four lines.

* Incorrecto.

D. There is one line with trailing whitespace.

* Correcto. La linea con _\s_.

E. There is two line with trailing whitespace.

* Incorrecto. Solo existe una linea con trailing whitespace.

F. If we indented each line five characters, it would change the output.

* Incorrecto. Serian ignorados.


### _Q18. Which of the following statement about _var_ are true?_

A. A _var_  can be used as a constructor parameter.

 * Incorrecto. _var_ no puede usarse como parametro de un metodo, contructor o variable de clase o instancia.

 B. The type of a _var_ is known at compile time.

 * Correcto.

 C. A _var_ cannot be used as an instance variable.

 * Correcto. _var_ no puede usarse con instance o class variable.

 D. A _var_ can be used in a multiple variable assigment statement.

 * Incorrecto. No puede usarse en asignacion multiple.

 E. The value of a _var_  cannot change at runtime.

 * Incorrecto. El valor de _var_ si puede ser cambiado en runtime.

 F. The type of a _var_ cannot change at runtime.

 * Correcto. No se puede cambiar el tipo de _var_ en runtime.

 G. The word _var_ is a reserved word in Java.

 * Nop. No es palabra reservada.


 ### _Q19. Which are true about the following code?_

 ```java
 var num1 = Long.parseLong("100");
 var num2 = Long.valueOf("100");
 System.out.println(Long.max(num1, num2));
 ```

 A. The output is _100_

 * Correcto. Imprime _100_.

 B. The output is _200_

 * Incorrecto. 

 C. The code does not compile.

 * Incorrecto. Compila sin problema.

 D. _num1_ is a primitive.

 * Correcto. _.parseLong_ convierte a _long_ que es primitivo. _valueOf_ convierte a _Long_ que es _reference object_.

 E. _num2_ is a primitive.

 * Incorrecto. Es de tipo referencia.

