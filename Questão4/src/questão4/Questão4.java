
package questão4;
import java.util.Random;
import java.util.Stack;

public class Questão4 {


    public static void main(String[] args) {
        
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();
        
        int quantidade = 100;
        
        for(int i = 0; i > quantidade; i++){
            int numero = random.nextInt(100) + 1;
            pilha.push(numero);
        }
        
        System.out.println("Numero reverso: ");
        System.out.println(pilha.reversed()); 
        
        
    }
    
}
