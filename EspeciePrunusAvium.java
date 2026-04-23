public class EspeciePrunusAvium extends GeneroPrunus {

    public EspeciePrunusAvium(int idade) {
        super(idade);
        this.Cor.add("VERDE");
        setRandomCor();
    }

    @Override
    public void brincar() {
        System.out.println("  Brinca fazendo nada.");
    }

    @Override
    public String nomePopular() {
        return "Cerejeira Doce";
    }
}