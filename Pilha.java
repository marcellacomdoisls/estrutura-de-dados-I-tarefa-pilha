import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        String entrada = teclado.nextLine();
        teclado.close();

        String[] palavras = entrada.split(" ");
        String saida = "";

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<Character>();
            for (int i = 0; i < palavra.length(); i++) {
                pilha.push(palavra.charAt(i));
            }
            while (!pilha.empty()) {
                saida += pilha.pop();
            }
            saida += " ";
        }

        System.out.println(saida.trim());
    }
}
