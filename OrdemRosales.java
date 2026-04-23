public abstract class OrdemRosales extends ClasseMagnoliopsida {
    public OrdemRosales(int idade) {
        super(idade);
    }

    @Override
    public void alimentacao() {
        System.out.println("  Sua alimentação é base de extração de minerais do solo");
    }
}
