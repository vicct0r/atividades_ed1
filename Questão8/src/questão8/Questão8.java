
package questão8;

import java.util.Random;

public class Questão8 {

    public static void main(String[] args) {
        Pilha pilha1 = new Pilha(1000);
        Pilha pilha2 = new Pilha(1000);
        TestePilha obj = new TestePilha(pilha1, pilha2);
        Random random = new Random();
        int num;
        for(int i = 0; i < 1000; i++){
            num = random.nextInt(201) - 100;
            obj.add(num);
        }
        
    }
}