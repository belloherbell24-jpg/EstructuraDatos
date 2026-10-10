public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE PILA ESTÁTICA ===");
        PilaSimple pilaEstica = new PilaSimple(3); // Capacidad máxima de 3 elementos

        System.out.println("¿La pila estática está vacía?: " + pilaEstica.isEmpty());
        pilaEstica.push(10);
        pilaEstica.push(20);
        pilaEstica.push(30);
        pilaEstica.push(40); // Prueba de desbordamiento (isFull)

        pilaEstica.mostrar();
        System.out.println("Elemento en el tope (peek): " + pilaEstica.peek());

        pilaEstica.pop();
        pilaEstica.mostrar();

        System.out.println("\n=== PRUEBA DE PILA DINÁMICA ===");
        PilaDinamica pilaDinamica = new PilaDinamica();

        System.out.println("¿La pila dinámica está vacía?: " + pilaDinamica.isEmpty());
        pilaDinamica.push(100);
        pilaDinamica.push(200);
        pilaDinamica.push(300);

        pilaDinamica.mostrar();
        System.out.println("Elemento en la cima (peek): " + pilaDinamica.peek());

        pilaDinamica.pop();
        pilaDinamica.mostrar();
    }
}