public class EspecieHemidactylusMabouia extends GeneroHemidactylus {

    public EspecieHemidactylusMabouia(int idade) {
        super(idade);
    }

    @Override
    public void brincar() {
        System.out.println("  Brinca comendo moscas.");
    }

    @Override
    public String nomePopular() {
        return "Largatixa doméstica";
    }
}