# OCA - Study Guide  

## Chapter 1. Building Blocks

## Review questions

### _1. Which of the following are valid Java identifiers? (Choose all that apply)_

A. ```A$B```

* Correcto.

B. ```_helloWorld```

* Correcto. Underscore es permitido al inicio.

C. ```true```

* Incorrecto.  Palabra reservada.

D. ```java.lang```

* Incorrecto. _java.lang_ es un paquete de _Java_

E. ```Public```

* Correcto. _public_ es reservada, pero _Public_ no lo es.

F. ```1980_s```

* Incorrecto. Identificadores no pueden iniciar en numero. Solo letras, $ y _.

### _A01. A, B, E._

### _Q03. Which of the following are true?_

```java
short numPets = 5; // Line 4
int numGrains = 5.6; // Line 5
String name = "Scruffy"; // Line 6
numPets.length(); // Line 7
numGrains.length; // Line 8
name.length(); // Line 9
```

A. Line 4 generates a compiler error.

* Incorrecto.

B. Line 5 generates a compiler error.

* Correcto. El literal es un _double_ .

C. Line 6 generates a compiler error.

* Incorrecto.  Compila sin problema.

D. Line 7 generates a compiler error.

* Correcto.  _numsPets_  es un primitivo.

E. Line 8 generates a compiler error.

* Correcto.  _numsPets_  es un primitivo.

F. Line 9 generates a  compiler error.

*Incorrecto. _name_ es _String_ y el metodo _length_ esta bien aplicado.

G. The code compiles as is.

* Incorrecto.

### _A03. B, D, E ._

### _Q04. Given the following class, which of the following is true? (Choose all that apply)._

 ```java
 1: public class Snake {
 2:
 3:   public void shed(boolean time) {
 4:
 5:     if (time) {
 6:
 7:     }
 8:     System.out.println(result);
 9:
10:  }
11: }
```

A. If ```String result = "done";``` is inserted on line 2, the code will compile.

* **Correcto**. Seria una variable de clase.

B. If ```String result = "done";``` is inserted on line 4, the code will compile.

* **Correcto**. Seria una variable local con el _scope_ de todo el metodo _shed_

C. If ```String result = "done";``` is inserted on line 6, the code will compile.

* **Incorrecto**. Su _scope_ seria el bloque _if_.

D. If ```String result = "done";``` is inserted on line 9, the code will compile.

* **Incorrecto**. Se utilizaria antes de ser declarada.

E. None of the above changes will make the code compile.

* **Incorrecto**. El codigo pueder lograr compilar con las respuestas A y B.

### _A04. A, B._

### _Q05. Given the following classes, which of the following can independently replace INSERT IMPORTS HERE to make the code compile? (Choose all that apply)._

```java
//Tank,java
package aquarium;
public class Tank { }

// Jelly.java
package aquarium.jellies;
public class Jelly { }

//AquariumVisitor.java
package visitor;
INSERT IMPORTS HERE
public class AquariumVisitor {
 public void admire(Jelly jelly) { } }
 ```

A. ```import aquarium.*;```

* **Incorrecto**. Solo importa las clases en el paquete _aquarium_, pero no incluye las clases de nivel mas profundo.

B. ```import aquarium.*.Jelly;```

* **Incorrecto**. El _wildcard_  solo se puede usar al final del _import_.

C. ```import aquarium.jellies.Jelly;```

* **Correcto**. Importa la clase _Jelly_.

D. ```import aquarium.jellies.*;```

* **Correcto**. Importa todas las clase dentro de _jellies_ incluyendo _Jelly_.

E. ```import aquarium.jellies.Jelly.*;```

* **Incorrecto**. No se puede importar partes de la clase.

F. None of these can make the code compile.

* **Incorrecto**. Opciones C y D, logran compilar el codigo.

### _A05. C, D_

### _Q06. Given the following classes, what is the maximum number of imports that can be removed and have the code still compile?_

```java
// Water.java
package aquarium; public class Water { }

//Tank.java
package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
 public void print(Water water) {
 System.out.println(water); } }
 ```

A. 0

B. 1

C. 2

D. 3

E. 4

* **Correcta** . _java-lang_ es automaticamente importada incluyendo _System_. _Water_ y _Tank_ estan en el mismo paquete siendo innecesario el import de _aquarium_ y de todas sus clases.

F. Does not compile.

### _A06. D._

### _Q07. Given the following classes, which of the following snippets can be inserted in place of INSERT IMPORTS HERE and have the code compile? (Choose all that apply)._

```java
// Water.java
package aquarium;
public class Water {
 boolean salty = false;
}

//Water.java
package aquarium.jellies;
public class Water {
 boolean salty = true;
}

//WaterFiller.java
package employee;
 INSERT IMPORTS HERE
public class WaterFiller {
 Water water;
}
```

A. ```import aquarium.*;```

* **Correcto**. Importa todas las clases de _aquarium_.

B. ```import aquarium.Water;```

```import aquarium.jellies.*;```

* **Correcto**. Importa Water por clase teniendo mas precedencia que el _wildcard_.

C. ```import aquarium.*;```

```import aquarium.jellies.Water;```

* **Correcto**. Lo mismo que el anterior, pero ahora dentro del paquete _jellies_

D. ```import aquarium.*;```

```import aquarium.jellies.*;```

* **Incorrecto**. _Java_ no sabria cual clase escoger entre los dos _wildcards_.

E. ```import aquarium.Water;```

```import aquarium.jellies.Water;```

* **Incorrecto**. Entraria en comflicto el mismo nombre de clase.

F. None of these imports can make the code compile.

* **Incorrecto**. Si se lograria compilar con las opciones A, B, C.

### _A07. A, B, C._

### _Q09. Which of the following legally fill in the blank so you can run the main() method from the command line? (Choose all that apply)_

```java
public static void main( ____ )
```

A. String[] _names

* **Correcto**. No se viola ninguna regla con el identificador del nombre.
B. String[] 123

* **Incorrecto**. Numero no permitido al inicio del nombre.

C. String abc[]

* **Correcto**.  Nombre y tipo correcto.

D. String _Names[]

* **Correcto**. Nombre y tipo correcto.

E. String... $n

* **Correcto**. Nombre y tipo correcto.

F. String names

* **Incorrecto**. No contiene el tipo correcto.

G. None of the above.

* **Incorrecto**.

### _A09. A,C,D,E._

### _Q10. Which of the following are legal entry point methods that can be run from the command line? (Choose all that apply)._

A. ```private static void main(String[] args)```

* **Incorrecto**. metodo _main_ no puede ser _private_.  

B. ```public static final main(String[] args)```

* **Incorrecto**. Falta el tipo de retorno _void_.

C. ```public void main(String[] args)```

* **Incorrecto**. Metodo _main()_ debe de ser _static_.

D. ```public static void test(String[] args)```

* **Incorrecto**. Metodo _main()_ debe de llamarse _main_.

E. ```public static void main(String[] args)```

* **Correcto**. Entrada canonica.

F. ```public static main(String[] args)```

* **Incorrecto**. Falta el tipo de retorno _void_.

G. None of the above.

* **Incorrrecto**. Opcion E es correcta.

### _A10. E._

### _Q11. Which of the following are true? (Choose all that apply)._

A. An instance variable of type _double_ defaults to _null_.

* **Incorrecto**. Tipo _double_ default _0.0_

B. An instance variable of type _int_ defaults to _null_.

* **Incorrecto**. Tipo _int_ default _0_.

C. An instance variable of type _String_ defaults to _null_.

* ### **Correcto**

D. An instance variable of type _double_ defaults to _0.0_

* **Correcto**.

E. An instance variable of type _int_ defaults to _0.0_

* **Incorrecto**. Default a _0_.

F. An instance variable of type _String_ defaults to _0.0_

* **Incorrecto**. Default a _null_.

G. None of the above.

* **Incorrecto**. C y D son correctas.

### _A11. C, D._

### _Q12. Which of the following are true? (Choose all that apply)_

A. A local variable of type _boolean_ defaults to _null_.

* **Incorrecto**. Variable locales no tienen valor por _default_.

B. A local variable of type _float_ defaults to _0_.

* **Incorrecto**. Variable locales no tienen valor por _default_.

C. A local variable of type _Object_ defaults to _null_.

* **Incorrecto**. Variable locales no tienen valor por _default_.

D. A local variable of type _boolean_ defaults to _false_.

* **Incorrecto**. Variable locales no tienen valor por _default_.

E. A local variable of type _boolean_ defaults to _true_.

* **Incorrecto**. Variable locales no tienen valor por _default_.

F. A local variable of type _float_ defaults to _0.0_.

* **Incorrecto**. Variable locales no tienen valor por _default_.

G. None of the above.

* **Correcto**. Las variables locales necesitan inicializarse para porder usarse.

### _A12. G._

### _Q13. Which of the following are true? (Choose all that apply)_

A. An instance variable of type _boolean_ defaults to _false_.

* **Correcto**.  _boolean_ defaults a _false_

B. An instance variable of type _boolean_ defaults to _true_.

* **Incorrecto**.  _boolean_ defaults a _false_

C. An instance variable of type _boolean_ defaults to _null_.

* **Incorrecto**.  _boolean_ defaults a _false_

D. An instance variable of type _int_ defaults to _0_.

* **Correcto**. _int_ default a _0_.

E. An instance variable of type _int_ defaults to _0.0_.

* **Incorreto**. _double_ default a _0.0_.

F. An instance variable of type _int_ defaults to _null_.

* **Incorrecto**. _String_ default a _null_.

G. None of the above.

* **Incorrecto**. a y D son ciertas.

### _A13. A, D._

### _Q14. Given the following class in the file:_

#### /my/directory/named/A/Bird.java

```java
INSERT CODE HERE
public class Bird { }
```

_Which of the following replaces INSERT CODE HERE if we compile from **/my/directory**?_

(Choose all that apply)

A. ```package my.directory.named.a;```

B. ```package my.directory.named.A;```

C. ```package named.a;```

* **Incorrecto**. Es case sensitive.

D. ```package named.A;```

* **Correcto**.  Al encontrarnos en _/my/directory_ este seria el nombre del paquete.

E. ```package a;```

F. ```package A;```

G. Does not compile.

### _A14. D._

### _15. Which of the following lines of code compile? (Choose all that apply)_

A. int i1 = 1_234;

* **Correcto**.

B. double d1 = 1_234_.0;

* **Incorrecto**. _Underscore_ antes del punto.

C. double d2 = 1_234._0;

* **Incorrecto**. _Underscore_ despues del punto.

D. double d3 = 1_234.0_;

* **Incorrecto**. _Underscore_ al final del literal.

E. double d4 = 1_234.0;

* **Correcto**.

F. None of the above.

* **Incorrecto**.  A y d son buenas.

### _A15. A, D._

### _16. Given the following class, which of the following lines of code can replace INSERT CODE HERE to make the code compile? (Choose all that apply)_

```java
public class Price {
    public void admission() {
            INSERT CODE HERE
        System.out.println(amount);
 } }
 ```

A. int amount = 9L;

* **Incorrecto**. El tipo es _int_ y el literal es un _long_.

B. int amount = 0b101;

* **Correcto**. Es un binario.

C. int amount = 0xE;

* **Correcto**. Es un hexadecimal.

D. double amount = 0xE;

* **Correcto**. Es un hexadecimal.

E. double amount = 1_2_.0_0;

* **Incorrecto**. _Underscore_ antes de punto.

F. int amount = 1_2_;

* **Incorrecto**. _Underscore_ al final.

G. None of the above.

* **Incorrecto**. B, C, D son correctas.

### _A16. B, C, D._

### _Q17. Which of the following are true? (Choose all that apply)_

```java
public class Bunny {
        public static void main(String[] args) {
                Bunny bun = new Bunny();
} }
```

A. Bunny is a class.

* **Correcto**. _Bunny_ es una clase.

B. bun is a class.

* **Incorrecto**. _bun_ es una instancia de una clase.

C. main is a class.

* **Incorrecto**. _main_ es un metodo.

D. Bunny is a reference to an object.

* **Incorrecto**. Es una clase.

E. bun is a reference to an object.

* **Correcto**. _bun_ es una referencia a un objeto.

F. main is a reference to an object.

* **Incorrecto**. _main_ es un metodo.

G. None of the above.

* **Incorrecto**. A y E son correctas.

### _A17. A, E._

### _Q18. Which represent the order in which the following statements can be assembled into a program that will compile successfully? (Choose all that apply)_

```java
A: class Rabbit {}
B: import java.util.*;
C: package animals;
```

A. A, B, C

* **Incorrecto**.

B. B, C, A

* **Incorrecto**.

C. C, B, A

* **Correcto**. _package_, _import_ y _class_.

D. B, A

* **Correcto**. , _import_ y _class_.

E. C, A

* **Correcto**. _package_, _class_.

F. A, C

* **Incorrecto**.

G. A, B

* **Incorrecto**.
