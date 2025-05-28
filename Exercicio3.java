import java.util.*;

public class PistaDecolagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> filaNomes = new LinkedList<>();
        Queue<Integer> filaIds = new LinkedList<>();

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("1 - Listar quantidade de aviões na fila");
            System.out.println("2 - Autorizar decolagem do primeiro avião");
            System.out.println("3 - Adicionar avião na fila");
            System.out.println("4 - Listar todos os aviões na fila");
            System.out.println("5 - Mostrar primeiro avião da fila");
            System.out.println("6 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Quantidade de aviões na fila: " + filaNomes.size());
            }

            if (opcao == 2) {
                if (filaNomes.isEmpty()) {
                    System.out.println("Não tem avião na fila");
                } else {
                    String nome = filaNomes.poll();
                    int id = filaIds.poll();
                    System.out.println("Avião " + nome + " decolou");
                }
            }

            if (opcao == 3) {
                System.out.println("Digite o nome do avião:");
                String nome = sc.nextLine();
                System.out.println("Digite o id do avião:");
                int id = sc.nextInt();
                sc.nextLine();
                filaNomes.add(nome);
                filaIds.add(id);
                System.out.println("Avião adicionado na fila");
            }

            if (opcao == 4) {
                if (filaNomes.isEmpty()) {
                    System.out.println("Fila vazia");
                } else {
                    Queue<String> nomesTemp = new LinkedList<>(filaNomes);
                    Queue<Integer> idsTemp = new LinkedList<>(filaIds);
                    while (!nomesTemp.isEmpty()) {
                        String nome = nomesTemp.poll();
                        int id = idsTemp.poll();
                        System.out.println("Avião " + nome + " - ID " + id);
                    }
                }
            }

            if (opcao == 5) {
                if (filaNomes.isEmpty()) {
                    System.out.println("Fila vazia");
                } else {
                    String nome = filaNomes.peek();
                    int id = filaIds.peek();
                    System.out.println("Primeiro avião: " + nome + " - ID " + id);
                }
            }
        }
    }
}
