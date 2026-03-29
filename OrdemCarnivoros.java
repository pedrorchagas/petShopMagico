public abstract class OrdemCarnivoros extends ClasseMamiferos {
    public OrdemCarnivoros(int idade) {
        super(idade);
    }

    @Override
    public void alimentacao() {
        System.out.println("  Sua alimentação é a base de carne");
    }
}
