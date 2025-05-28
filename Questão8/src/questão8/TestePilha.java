
package questão8;

public class TestePilha {
    private Pilha positivos;
    private Pilha negativos;
    public TestePilha(Pilha n, Pilha p){
        this.positivos = p;
        this.negativos = n;
    }
    
    public void add(int elemento){
        if(elemento > 0){
            positivos.add(elemento);
            return;
        }
        else if(elemento < 0){
            negativos.add(elemento);
            return;
        }
        System.out.println(positivos.pop());
        System.out.println(negativos.pop());
    }
}
    
