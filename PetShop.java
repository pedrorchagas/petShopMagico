import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Animal> animaisDisponiveis = new ArrayList<>();

    public PetShop() {
        animaisDisponiveis.add(new EspecieCanisLupus(2));
        animaisDisponiveis.add(new EspecieCanisLupus(6));
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

    public void adotarAnimal(Animal animal) {
        animal.setAdotado(true);
        animaisDisponiveis.remove(animal);
    }
}