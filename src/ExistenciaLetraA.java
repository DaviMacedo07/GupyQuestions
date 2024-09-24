import java.util.Scanner;

public class ExistenciaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine().toLowerCase();

        int quantidade = 0;

        for (char c : texto.toCharArray()) {
            if (c == 'a') {
                quantidade++;
            }
        }

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vez(es).");
        } else {
            System.out.println("A letra 'a' não está presente na string.");
        }

        scanner.close();
    }
}
