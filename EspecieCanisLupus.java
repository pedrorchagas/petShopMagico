public class EspecieCanisLupus extends GeneroCanis {
    
    public EspecieCanisLupus(int idade) {
        super(idade);
        this.Cor.add("BRANCA");
        this.Cor.add("MARROM");
        this.Cor.add("CARAMELO");
        this.Cor.add("PRETO");
        this.Cor.add("BEGE");
        this.Cor.add("RAJADO");
        this.Cor.add("LARANJA");
        setRandomCor();
    }

    @Override
    public void brincar() {
        System.out.println("  Brinca correndo atrás de bola.");
    }

    @Override
    public String nomePopular() {
        return "Cachorro";
    }
}