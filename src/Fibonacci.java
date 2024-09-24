import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um número para a verificação do Fibonacci: ");
        int nF = scanner.nextInt();

        boolean pertence = pertenceFibonacci(nF);

        if (pertence) {
            System.out.println("O número " + nF + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + nF + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
    public static boolean pertenceFibonacci(int n) {
        int a = 0, b = 1;
        if (n == a || n == b) return true;

        while (b < n) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return b == n;
    }
}
