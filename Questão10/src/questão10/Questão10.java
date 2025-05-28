
package questão10;
import java.util.Scanner;

public class Questão10 {
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int a = ler.nextInt();

        System.out.print("Digite o expoente: ");
        int b = ler.nextInt();

        Potencia p = new Potencia();
        int resultado = p.elevar(a, b);

        System.out.println(a + " elevado a " + b + " = " + resultado);
    }
}
    
