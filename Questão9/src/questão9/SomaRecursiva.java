
package questão9;

import java.util.Scanner;

public class SomaRecursiva {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int n = ler.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }

        Soma soma = new Soma();
        int resultado = soma.somarArray(numeros, 0);

        System.out.println("Soma dos elementos: " + resultado);
    }
}
