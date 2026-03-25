import java.util.Scanner;

public class Main{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Nosso petShop mágico!");

        int opcao;
        do {

            System.out.println("Escolha uma das opções abaixo:");
            System.out.println(" 1 - Adotar novo animal");
            System.out.println(" 2 - Listar animais adotados");
            System.out.println(" 3 - Alterar animal adotado");
            System.out.println(" 4 - Devolver animal adotado");
            System.out.println(" 0 - Sair do petShop mágico");

            opcao = scanner.nextInt();
            System.out.println(opcao);
        } while (opcao != 0);

        System.out.println("Foi muito bom te ver por aqui, volte sempre!");
    }
}