
package quetsão6;

public class Fila {
    
    private int[] dados;
    private int inicio, fim, tamanho;

    public Fila(int capacidade) {
        dados = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void enfileirar(int valor) {
        if (tamanho < dados.length) {
            dados[fim] = valor;
            fim = (fim + 1) % dados.length;
            tamanho++;
        }
    }

    public int desenfileirar() {
        if (!estaVazia()) {
            int valor = dados[inicio];
            inicio = (inicio + 1) % dados.length;
            tamanho--;
            return valor;
        }
        return 0;
    }
}
