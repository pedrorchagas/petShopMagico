public class EspecieCanisLupus extends GeneroCanis {
    
    public EspecieCanisLupus(int idade) {
        super(idade);
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