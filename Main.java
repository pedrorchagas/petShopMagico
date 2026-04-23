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
            System.out.println(" 3 - Alterar nome de um animal adotado");
            System.out.println(" 4 - Devolver animal adotado"); 
            System.out.println(" 0 - Sair do petShop mágico");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("\n");
                    // Ver as opções disponiveis de animais
                    int indexAnimal;
                    // ver as caracteristicas de cada animal pelo index
                    do {
                        petShop.mostrarAnimaisDisponiveis();
                        System.out.println("Digite o número do animal para ver suas caracteristicas. \nDigite 0 para sair");

                        indexAnimal = scanner.nextInt();
                        if (indexAnimal != 0) {
                            Animal animal = petShop.getAnimalPeloIndex(indexAnimal);
                            animal.mostrarSuasInformacoes();
                            System.out.println("\n\n");

                            System.out.println(" Deseja adotar esse animal?");
                            System.out.println(" Digite S, para adotar.");
                            System.out.println(" Digite N, para não adotar.");

                            char opcaoAdotar;
                            opcaoAdotar = Character.toUpperCase(scanner.next().charAt(0));
                            if (opcaoAdotar == 'S') {
                                petShop.entregarAnimal(animal);
                                System.out.printf(" Parabéns!! Você adotou um %s\n", animal.nomePopular());

                                System.out.println(" Escreva um nome para o seu animal: ");
                                String nomeAnimal = scanner.next();
                                animal.setNome(nomeAnimal);

                                animaisAdotados.add(animal);
                            }
                        }
                    } while (indexAnimal != 0);
                    break;
                }
                case 2: {
                    System.out.println("\n");
                    if (!animaisAdotados.isEmpty()) {
                        for (Animal animal : animaisAdotados) {
                            System.out.printf(" Animal: %-15s | Nome: %-15s | Idade: %d\n", animal.nomePopular(), animal.getNome(), animal.getIdade());
                        }
                    } else {
                        System.out.println(" Você ainda não possui animais adotados.");
                    }
                    System.out.println("\n");
                    break;
                }
                case 3: {
                    System.out.println("\n");
                    if (!animaisAdotados.isEmpty()) {
                        int opcaoEdicao;
                        do {
                            int indexAnimal = 0;
                            for (Animal animal : animaisAdotados) {
                                System.out.printf(" %d -> Animal: %-15s | Nome: %-15s | Idade: %d ", indexAnimal + 1, animal.nomePopular(), animal.getNome(), animal.getIdade());
                                indexAnimal += 1;
                                System.out.println("\n");
                            }

                            System.out.println(" Digite o número de um dos seus animais para realizar a renomeação dele.");
                            System.out.println(" Ou digite 0 para sair.");

                            opcaoEdicao = scanner.nextInt();
                            if (opcaoEdicao != 0) {
                                Animal animal = animaisAdotados.get(opcaoEdicao - 1);
                                System.out.printf(" Animal selecionado: %s - %s\n",  animal.nomePopular(), animal.getNome());
                                System.out.println(" Digite o novo nome para o seu animal:");

                                String nome = scanner.next();
                                animal.setNome(nome);
                                System.out.printf(" Nome do seu animal definido para: %s", animal.getNome());
                                System.out.println("\n");
                            }
                        } while(opcaoEdicao != 0);
                    } else {
                        System.out.println(" Você ainda não possui aniamis adotados.\n");
                    }
                    break;
                }   
                case 4: {
                    System.out.println("\n");
                    if (!animaisAdotados.isEmpty()) {
                        int indexAnimal = 0;
                        for (Animal animal : animaisAdotados) {
                            System.out.printf(" %d -> Animal: %-15s | Nome: %-15s | Idade: %d ", indexAnimal + 1, animal.nomePopular(), animal.getNome(), animal.getIdade());
                            indexAnimal--;
                            System.out.println("\n");
                        }
                        System.out.println(" Digite o número do animal que você deseja devolver:");
                        int opcaoDevolucao = scanner.nextInt();

                        Animal animal = animaisAdotados.get(opcaoDevolucao - 1);
                        animaisAdotados.remove(animal);
                        petShop.receberAnimal(animal);

                        System.out.printf(" Você devolveu o animal %s - %s para o petshop.\n", animal.nomePopular(), animal.getNome());
                    } else {
                        System.out.println(" Você ainda não possui animais adotados.\n");
                    }
                }
                case 0: break;
                default: System.out.println("Escreva uma opção válida!\n");
            }
        } while (opcao != 0);

        System.out.println("Foi muito bom te ver por aqui, volte sempre!");
    }
}