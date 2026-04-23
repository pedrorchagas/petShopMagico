public class EspecieHemidactylusMabouia extends GeneroHemidactylus {

    public EspecieHemidactylusMabouia(int idade) {
        super(idade);
        this.Cor.add("VERDE");
        this.Cor.add("BRANCA");
        this.Cor.add("BEGE");
        setRandomCor();
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