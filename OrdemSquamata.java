public abstract class OrdemSquamata extends ClasseReptilia {
    public OrdemSquamata(int idade) {
        super(idade);
    }

    @Override
    public void alimentacao() {
        System.out.println("  Sua alimentação é majoritariamente carnívora, com variações ");
    }
}
