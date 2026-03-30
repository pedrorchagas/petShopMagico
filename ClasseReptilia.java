public abstract class ClasseReptilia extends FiloCordados {
    public ClasseReptilia(int idade) {
        super(idade);
    }

    @Override
    public void respiracao() {
        System.out.println("  Sua respiração é por pulmões.");
    };
}