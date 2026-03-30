public abstract class FamiliaGekkonidae extends OrdemSquamata {
    public FamiliaGekkonidae(int idade) {
        super(idade);
    }

    @Override
    public void crescimento() {
        System.out.println("  Seu tempo de crescimento é entre 2 - 3 meses.");
    }

        @Override
    public void reproducao() {
        System.out.println("  Sua reprodução é sexuada, fecundação interna e Põe ovos");
    }
}