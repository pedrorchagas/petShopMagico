public abstract class ClasseMagnoliopsida extends FiloTracheophyta {
    public ClasseMagnoliopsida(int idade) {
        super(idade);
    }

    @Override
    public void reproducao() {
        System.out.println("  Sua reprodução é sexuada ou assexuada.");
    }

    @Override
    public void respiracao() {
        System.out.println("  Sua respiração é por células de trocas gasosas.");
    };
}