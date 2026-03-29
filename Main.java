import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animaisAdotados = new ArrayList<>();
        PetShop petShop = new PetShop();
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

            switch (opcao) {
                case 1: {
                    // Ver as opções disponiveis de animais
                    petShop.mostrarAnimaisDisponiveis();
                    int indexAnimal;
                    // ver as caracteristicas de cada animal pelo index
                    do {
                        System.out.println("Digite o número do animal para ver suas caracteristicas. \nDigite 0 para sair");
                        indexAnimal = scanner.nextInt();
                        if (indexAnimal != 0) {
                            Animal animal = petShop.getAnimalPeloIndex(indexAnimal);
                            animal.mostrarSuasInformacoes();
                            System.out.println("\n\n\n");
                        }
                    } while (indexAnimal != 0);
                    // escolher adotar ou não

                    // 
                }
            }
        } while (opcao != 0);

        System.out.println("Foi muito bom te ver por aqui, volte sempre!");
    }
}