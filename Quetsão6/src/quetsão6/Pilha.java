
package quetsão6;

public class Pilha {
    
    private int[] dados;
    private int topo;

    public Pilha(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public void empilhar(int valor) {
        if (topo < dados.length - 1) {
            dados[++topo] = valor;
        }
    }

    public Integer desempilhar() {
        if (!estaVazia()) {
            return dados[topo--];
        }
        return null;
    }
}



