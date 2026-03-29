import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PetShop {
    private List<Animal> animaisDisponiveis = new ArrayList<>();

    public PetShop() {
        // Define 4 cachorros aleatórios.
        for (int i = 1; i < ThreadLocalRandom.current().nextInt(4); i++) {
            animaisDisponiveis.add(new EspecieCanisLupus(ThreadLocalRandom.current().nextInt(11)));
        }
    }

    public void mostrarAnimaisDisponiveis() {
        System.out.println("\n\nOs animais disponiveis para adoção são: ");
        int index = 1;
        for (Animal animal : animaisDisponiveis) {
            System.out.printf(" %-1d -> %-15s  | Idade: %d | Cor: %s%n", index, animal.nomePopular(), animal.getIdade(), animal.getCor());
            index++;
        }
        System.out.println("\n\n");
    }

    public Animal getAnimalPeloIndex(int index) {
        index--;
        return animaisDisponiveis.get(index);
    }

    public void entregarAnimal(Animal animal) {
        animal.setAdotado(true);
        animaisDisponiveis.remove(animal);
    }

    public void receberAnimal(Animal animal) {
        animal.setAdotado(false);
        animaisDisponiveis.add(animal);
    }
}