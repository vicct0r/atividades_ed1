import java.util.*;

public class FilaPilha {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(10000); 

            if (fila.contains(numero)) {
                pilha.push(numero);
            } else {
                fila.add(numero);
            }
        }

        System.out.println("Fila:");
        for (int n : fila) {
            System.out.print(n + " ");
        }
        
        System.out.println("\n");

        System.out.println("Pilha:");
        for (int n : pilha) {
            System.out.print(n + " ");
        }
    }
}
