public abstract class FamiliaRosaceae extends OrdemRosales {
    public FamiliaRosaceae(int idade) {
        super(idade);
    }

    @Override
    public void crescimento() {
        System.out.println("  Seu tempo de crescimento é continuo e depende da disponibilidade de minerais no solo.");
    }

    @Override
    public void reproducao() {
        System.out.println("  Sua reprodução é sexuada ou assexuada por meio de poléns.");
    }
}