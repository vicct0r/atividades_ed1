
package questão7;

public class Fila {

    int[] elementos = new int[100];
    int topo;

    public Fila() {
        this.topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == 99;
    }

    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("Pilha cheia!");
        } else {
            topo++;
            elementos[topo] = valor;
        }
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return -1; // valor de erro
        } else {
            int removido = elementos[topo];
            topo--;
            return removido;
        }
    }
}

