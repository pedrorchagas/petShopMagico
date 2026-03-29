public abstract class ClasseMamiferos extends FiloCordados {
    public ClasseMamiferos(int idade) {
        super(idade);
    }

    @Override
    public void reproducao() {
        System.out.println("  Sua reprodução é sexuada.");
    }

    @Override
    public void respiracao() {
        System.out.println("  Sua respiração é por pulmões.");
    };
}