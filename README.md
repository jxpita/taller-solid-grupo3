# taller-solid-grupo3
# Diseño de Software - ESPOL

Taller: identificar violaciones a los principios SOLID y corregir código fuente para que cumpla con ellos.

Integrantes:
* Milca Flores
* Juan Pita
* Gabriela Ramos


## Literal 1
Se incumple: OCP (Open-Closed Principle)

Razón: En caso de querer introducir nuevos postres, se tendría que modificar el código actual, ya que solo se tienen dos clases con dos tipos de postres.
La solución sería crear una función padre llamada Postre que permita heredar las funcionalidades de todo tipo de postre.

Evidencia Previa:
![ocp](https://user-images.githubusercontent.com/57634672/121573760-36463380-c9eb-11eb-97d5-6a47ebb83bee.PNG)



## Literal 2
Se incumple: ISP (Interface Segregation Principle)

Razón: Si se agregan nuevos postres, no necesariamente se van a usar los métodos añadir/quitar de los anteriores postres existentes.

Evidencia Previa:
![image](https://user-images.githubusercontent.com/34144827/121578800-ae632800-c9f0-11eb-8d02-6a56b76a61e3.png)


## Literal 3
Se viola: OCP

Razón: Dado que cada tipo de postre requiere de su propia implementación para los métodos calcularPrecioFinal() y  showPrecioFinal, se debería crear una clase abstracta o interfaz que declare dichos métodos.

Evidencia Previa:
![ocp2](https://user-images.githubusercontent.com/57634672/121581610-a0fb6d00-c9f3-11eb-8a46-3d3b570ac85a.PNG)



## Literal 4

## Literal 5 
Se incumple: LSP (Liskov Substitution Principle)

Razón: Se lanza una excepción al querer hacer una torta de chocolate con Leche Deslactosada  y al heredar de la clase padre 'Leche Entera' se espera que Leche Deslactosada lleve el mismo comportamiento del padre. 

Evidencia Previa:

![sistema](https://user-images.githubusercontent.com/68141841/121576750-51ff0900-c9ee-11eb-8bfa-6e9cc6785a2d.png)
![clases](https://user-images.githubusercontent.com/68141841/121576744-50cddc00-c9ee-11eb-8b99-62a2b5f36990.png)




