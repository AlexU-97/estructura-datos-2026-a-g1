# Análisis de Eficiencia de Algoritmos

## Algoritmo A

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### Complejidad
O(n)

Este algoritmo tiene crecimiento lineal porque utiliza un solo ciclo.

---

## Algoritmo B

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

### Complejidad
O(n²)

Este algoritmo tiene crecimiento cuadrático porque utiliza ciclos anidados.

---

# Comparación

El algoritmo B crece más rápido cuando n aumenta debido a la gran cantidad de operaciones que realiza.

El algoritmo A es más eficiente porque solo recorre los datos una vez.

En cambio, el algoritmo B ejecuta un ciclo dentro de otro, aumentando considerablemente el tiempo de ejecución.