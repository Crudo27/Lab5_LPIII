# Laboratorio 05 - Lenguajes de Programación III

Práctica de **Generics en Java** desarrollada para la Escuela Profesional de Ingeniería de Sistemas de la Universidad Católica de Santa María.

## Estructura

- `src/act1`: método genérico `imprimirArreglo` y sobrecarga con validación de subíndices.
- `src/act2`: pila genérica con método `contains` sin alterar la pila original.
- `src/act3`: método genérico `esIgualA` y prueba con distintos tipos, incluido `null`.
- `src/act4`: pila genérica con método `esIgual`.
- `src/ejercicios`: clase `Par`, comparación de pares, `imprimirPar` y `Contenedor` basado en `ArrayList`.
- `evidencias`: capturas obtenidas a partir de la compilación y ejecución real del código.
- `informe`: informe completo en formato simple UCSM.

## Compilación

```bash
mkdir -p bin
javac -d bin src/act1/*.java src/act2/*.java src/act3/*.java src/act4/*.java src/ejercicios/*.java
```

## Ejecución

```bash
java -cp bin act1.PruebaMetodoGenerico
java -cp bin act2.Main
java -cp bin act3.Main
java -cp bin act4.Main
java -cp bin ejercicios.PruebaPar
java -cp bin ejercicios.Main
```
