
package questão7;
import java.util.Scanner;

public class Questão7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] fila = new int[20];
        int tamanho = 0;

        System.out.println("Digite 20 numeros inteiros:");
        while (tamanho < 20) {
            System.out.print("Numero " + (tamanho + 1) + ": ");
            fila[tamanho] = ler.nextInt();
            tamanho++;
        }

        Fila pilha = new Fila();

        for (int i = 0; i < tamanho; i++) {
            pilha.empilhar(fila[i]);
        }

        for (int i = 0; i < tamanho; i++) {
            fila[i] = pilha.desempilhar();
        }

        System.out.println("Fila invertida:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }
}
