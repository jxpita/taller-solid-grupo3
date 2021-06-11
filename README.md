## taller-solid-grupo3
## Diseño de Software - ESPOL

Taller: identificar violaciones a los principios SOLID y corregir código fuente para que cumpla con ellos.

Integrantes:
* Milca Valdez
* Juan Pita
* Gabriela Ramos


## Literal 1
Se incumple: OCP (Open-Closed Principle)

Razón: En caso de querer introducir nuevos postres, se tendría que modificar el código actual, ya que solo se tienen dos clases con dos tipos de postres.
La solución sería crear una función padre llamada Postre que permita heredar las funcionalidades de todo tipo de postre.

Evidencia Previa:
![ocp](https://user-images.githubusercontent.com/57634672/121573760-36463380-c9eb-11eb-97d5-6a47ebb83bee.PNG)

Solución: Se creo la clase Postre para que Helado y Pastel puedan heredar las carecterísticas, manteniendo solo los métodos necesarios dentro de las clases hijas.
![image](https://user-images.githubusercontent.com/34144827/121629238-5d7b2000-ca40-11eb-8232-96fbd59dbf5c.png)


# Literal 2
Se incumple: ISP (Interface Segregation Principle)

Razón: Si se agregan nuevos postres, no necesariamente se van a usar los métodos añadir/quitar de los anteriores postres existentes.

Evidencia Previa:
![image](https://user-images.githubusercontent.com/34144827/121578800-ae632800-c9f0-11eb-8d02-6a56b76a61e3.png)

Solución: La clase Procesos.OperacionesAderezo fue eliminada puesto que la implementación de esos métodos se realizó en la clase Postre.
![image](https://user-images.githubusercontent.com/34144827/121629419-b6e34f00-ca40-11eb-9c50-840ef8764014.png)


# Literal 3
Se viola: OCP (Open-Closed Principle)

Razón: Dado que cada tipo de postre requiere de su propia implementación para los métodos calcularPrecioFinal() y  showPrecioFinal, se debería crear una clase abstracta o interfaz que declare dichos métodos.

Evidencia Previa:
![ocp2](https://user-images.githubusercontent.com/57634672/121581610-a0fb6d00-c9f3-11eb-8a46-3d3b570ac85a.PNG)

Solución: Se creó la clase ManejadorDePrecios para la implementación de los métodos calcularPrecioFinal() y showPrecioFinal().
![image](https://user-images.githubusercontent.com/34144827/121630949-c617cc00-ca43-11eb-8938-cb93dcbe6af6.png)


# Literal 4
Se incumple: DIP (Dependency Inversion PRinciple

Razón: Al ser un enum hace que aderezo sea muy estático generando una dependencia concreta y no abastracta.

Evidencia Previa:
![image](https://user-images.githubusercontent.com/34144827/121581993-1c5d1e80-c9f4-11eb-8fd4-f803231813f2.png)


# Literal 5 
Se incumple: LSP (Liskov Substitution Principle)

Razón: Se lanza una excepción al querer hacer una torta de chocolate con Leche Deslactosada  y al heredar de la clase padre 'Leche Entera' se espera que Leche Deslactosada lleve el mismo comportamiento del padre. 

Evidencia Previa:
![sistema](https://user-images.githubusercontent.com/68141841/121576750-51ff0900-c9ee-11eb-8bfa-6e9cc6785a2d.png)
![clases](https://user-images.githubusercontent.com/68141841/121576744-50cddc00-c9ee-11eb-8b99-62a2b5f36990.png)




