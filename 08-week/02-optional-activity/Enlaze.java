import java.util.List;

public class Enlaze {
    
    class Nodo{
        String nombre;
        Nodo siguiente;
        
        public Nodo (String nombre) {
            this.nombre = nombre;
            this.siguiente = null;
            
        }
        
    }

    public static void main(String[] args) {

        Enlaze lista = new Enlaze();

        Nodo n1 = lista.new Nodo("Alex");
        Nodo n2 = lista.new Nodo("Maria");
        Nodo n3 = lista.new Nodo("Carlos");
        Nodo n4 = lista.new Nodo("Laura");

        n1.siguiente = n2;
        n2.siguiente = n3;
        n3.siguiente = n4;
        n4.siguiente = null;


        Nodo cabeza = n1;
        System.out.println(" Cabeza");
        System.out.println(" ↓");

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.nombre + " → ");
            actual = actual.siguiente;
        }
        System.out.println("null");


    }
}
