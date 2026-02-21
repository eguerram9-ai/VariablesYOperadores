# Práctica de Variables y Operadores en Java

## Respuestas Teóricas

### ¿Para qué se utilizan los operadores lógicos en programación?
Los operadores lógicos (AND `&&`, OR `||`, NOT `!`) se utilizan para combinar o negar expresiones booleanas. Permiten evaluar múltiples condiciones simultáneamente, lo que es fundamental para tomar decisiones complejas en el flujo de un programa (por ejemplo, en estructuras condicionales o bucles).

### ¿Por qué es importante declarar correctamente el tipo de dato de una variable?
Declarar el tipo de dato adecuado es crucial porque:
- **Uso de memoria:** Cada tipo ocupa un espacio diferente en memoria (por ejemplo, `int` 4 bytes, `byte` 1 byte).
- **Rango de valores:** Determina qué valores puede almacenar la variable.
- **Operaciones permitidas:** No todas las operaciones son válidas para todos los tipos (por ejemplo, dividir dos enteros da un entero truncado, mientras que con `double` se obtiene un resultado decimal).
- **Seguridad y claridad:** Ayuda a prevenir errores y hace el código más legible y mantenible.

## Justificación Técnica

### Clasificación de edad (Ejercicio 4)
Se utilizó la estructura `if-else` porque las categorías se definen por rangos de edad. `switch` en Java no maneja rangos de forma directa (a menos que se use el `switch` con expresiones complejas, pero `if-else` resulta más natural y legible para este caso).

### Día de la semana (Ejercicio 5)
Se optó por `switch` debido a que se compara una variable entera con valores constantes y discretos. Esta estructura hace el código más compacto y fácil de entender que una serie de `if-else`.

### Verificación de acceso (Ejercicio 6)
Se empleó `if-else` anidado porque la lógica requiere una validación en dos pasos: primero el usuario, y si es correcto, luego la contraseña. Esto no se puede modelar de manera eficiente con `switch`, ya que las condiciones no son independientes ni valores fijos.
