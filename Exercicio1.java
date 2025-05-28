import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Digite uma palavra:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String invertida = "";

        while (!stack.isEmpty()) {
            invertida += stack.pop();
        }

        System.out.println("String invertida: " + invertida);

        if (str.equals(invertida)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
