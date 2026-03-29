public abstract class FamiliaCanideos extends OrdemCarnivoros {
    public FamiliaCanideos(int idade) {
        super(idade);
    }

    @Override
    public void crescimento() {
        System.out.println("  Seu tempo de crescimento é entre 10 - 24 meses.");
    }
}