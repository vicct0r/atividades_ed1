
package questão2;
import java.util.Stack;
import java .util.Scanner;

public class Questão2 {

    public static void Remover(Stack<Integer> pilha, int elementos){
        Stack<Integer> temp = new Stack<>();
                
        while(!pilha.isEmpty()){
            int topo = pilha.pop();
            if(topo != elementos){
                temp.push(topo);
            }
        }
        
        while(!temp.isEmpty()){
            pilha.push(temp.pop());
        }
  
    }
    
    
    public static void main(String[] args) {
              
        
        Stack<Integer> pilha = new Stack<>();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite os valores da pilha: ");
        String elementos = ler.nextLine();
        String[] partes = elementos.split(" ");
        
        for(String parte : partes){
            pilha.push(Integer.parseInt(parte));
        }
        
        System.out.println("Digite o numero que deseja retirar: ");
        String expressao = ler.nextLine();
        
        int numero = Integer.parseInt(expressao);
        Remover(pilha, numero); 
                
        System.out.println(pilha);
    }
    
}
