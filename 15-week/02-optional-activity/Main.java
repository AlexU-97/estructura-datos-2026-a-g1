import java.util.*;

public class Main {

    public static void main(String[] args) {

        // =========================
        // LISTA ENLAZADA
        // =========================

        LinkedList<String> libros = new LinkedList<>();

        libros.add("Java Básico");
        libros.add("Estructuras de Datos");
        libros.add("Algoritmos");

        // =========================
        // PILA
        // =========================

        Stack<String> historial = new Stack<>();

        historial.push("Se agregó Java Básico");
        historial.push("Se agregó Estructuras de Datos");

        // =========================
        // COLA
        // =========================

        Queue<String> prestamos = new LinkedList<>();

        prestamos.add("Usuario 1");
        prestamos.add("Usuario 2");

        // =========================
        // MOSTRAR DATOS
        // =========================

        System.out.println("================================");
        System.out.println("        LISTA DE LIBROS");
        System.out.println("================================");

        for (String libro : libros) {
            System.out.println("• " + libro);
        }

        System.out.println("\n================================");
        System.out.println("     HISTORIAL DE ACCIONES");
        System.out.println("================================");

        System.out.println(historial);

        System.out.println("\n================================");
        System.out.println("      COLA DE PRÉSTAMOS");
        System.out.println("================================");

        System.out.println(prestamos);
    }
}