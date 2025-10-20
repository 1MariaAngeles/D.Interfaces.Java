# D.Interfaces.Java

## 03_Inheritance
La jerarquia es Emnpleado (padre) y luego 2 hijos que heredan de él PorHoras y TiempoCompleto.
El polimorfismo se utiliza en el array cuando utilizamos el mismo array y en el contiene al padre(Empleado) y los dos hijos(PorHoras y TiempoCompleto).
  También se puede ver el polimorfismo cuanto utilizamos para todas las clases calcularSalario() esta en todas, pero en cada una funciona de una forma.

1. ¿Por qué es útil definir métodos con el mismo nombre en distintas clases?
Por que si estan en diferentes clases y esas clases heredan de otras se puede utilizar polimorfismo y rehutilizar codigo.

2. ¿Qué ventaja aporta el uso de super frente a duplicar código?
Por que evitamos duplicar el codigo. Además si cambiamos en el padre en los hijos se cambia automaticamente

3. ¿Cómo mejora el polimorfismo la escalabilidad del programa?
Podemos añadir más empleados sin modificar el codigo de las otras clases solo del main

4. Si añadieras un nuevo tipo de empleado, ¿qué cambios deberías realizar en la jerarquía?
Se puede añadir un nuevo empleado sin modificar nada en la jerarquia, solo hay que modificar el codigo del main, ampliar el array y crear el objeto.
