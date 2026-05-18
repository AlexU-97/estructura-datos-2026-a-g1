# Semana 13 – Aplicación práctica de estructuras de datos

Estudiante: Alex Stiven Uribe Rey

Aplicación práctica de estructuras de datos
Aplicación práctica de estructuras de datos
1. Descripción del sistema

El sistema propuesto es una plataforma sencilla de gestión de biblioteca digital.
Este sistema permite registrar libros, controlar préstamos, gestionar historial de acciones y organizar categorías de libros de manera estructurada.

2. Tipos de datos manejados

El sistema manejará los siguientes tipos de información:

Libros registrados
Historial de acciones realizadas
Solicitudes de préstamos
Categorías de libros

3. Estructuras de datos utilizadas
Tipo de información	Estructura de datos	Justificación
Libros registrados	Lista enlazada	Permite agregar y eliminar libros dinámicamente.
Historial de acciones	Pila	La última acción realizada puede deshacerse primero.
Solicitudes de préstamos	Cola	Los préstamos se atienden en orden de llegada.
Categorías de libros	Árbol binario	Facilita organizar categorías de forma jerárquica.

4. Justificación de las estructuras
Lista enlazada

La lista enlazada es adecuada para almacenar libros porque el sistema puede aumentar o disminuir constantemente la cantidad de registros.

Pila

La pila permite guardar acciones recientes, como agregar o eliminar libros, siguiendo el principio LIFO (Last In, First Out).

Cola

La cola es útil para gestionar solicitudes de préstamos porque respeta el orden de llegada de los usuarios.

Árbol binario

El árbol binario ayuda a organizar categorías y subcategorías de libros manteniendo relaciones jerárquicas.

5. Interacción entre estructuras

Las estructuras trabajan juntas dentro del sistema.
La lista enlazada almacena los libros principales, mientras que la pila registra las acciones realizadas sobre esos libros.
La cola administra las solicitudes pendientes de préstamo y el árbol binario organiza las categorías para facilitar búsquedas y clasificación.

6. Ejemplo conceptual en Java
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Lista de libros
        List<String> libros = new LinkedList<>();

        // Historial de acciones
        Stack<String> historial = new Stack<>();

        // Cola de préstamos
        Queue<String> prestamos = new LinkedList<>();

        // Agregar libros
        libros.add("Java Básico");
        libros.add("Estructuras de Datos");

        // Registrar acciones
        historial.push("Se agregó Java Básico");
        historial.push("Se agregó Estructuras de Datos");

        // Solicitudes de préstamo
        prestamos.add("Usuario 1");
        prestamos.add("Usuario 2");

        // Mostrar información
        System.out.println("Libros: " + libros);
        System.out.println("Historial: " + historial);
        System.out.println("Cola de préstamos: " + prestamos);
    }
}
Conclusión

Las estructuras de datos permiten organizar la información de manera eficiente según las necesidades del sistema.
Cada estructura cumple una función específica y juntas facilitan la gestión dinámica de datos dentro de una aplicación real.