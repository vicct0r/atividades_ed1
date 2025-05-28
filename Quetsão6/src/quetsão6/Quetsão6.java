package quetsão6;

import java.util.Random;

public class Quetsão6 {

    public static void main(String[] args) {
        Fila fila = new Fila(2000);
        Pilha pilha = new Pilha(1000);

        int[] numeros = new int[2000];

        for (int i = 0; i < 1000; i++) {
            numeros[i] = i + 1;         
            numeros[i + 1000] = -(i + 1);  
        }

        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < numeros.length; i++) {
            int j = rand.nextInt(numeros.length);
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }

        for (int num : numeros) {
            fila.enfileirar(num); 
        }

        while (!fila.estaVazia()) {
            int valor = fila.desenfileirar();

            if (valor > 0) {
                pilha.empilhar(valor);
            } else {
                Integer retirado = pilha.desempilhar();
                if (retirado != null) {
                    System.out.println("Desempilhado: " + retirado);
                } else {
                    System.out.println("Pilha vazia! Nada a desempilhar.");
                }
            }
        }
    }
}