public abstract class Animal implements ComportamentoAnimal {

    // Variaveis para o petShop
    private String nome;
    private final int idade;
    private boolean adotado;

    // Variaveis para a taxonomia
    protected boolean eucarionte;
    protected boolean multicelular;
    protected boolean heterotrofico;
    protected boolean embrionario;

    // Construtor base de animal, informação que é inerente a todos
    public Animal(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public abstract String nomePopular();

    @Override
    public abstract void brincar();

    @Override
    public abstract void reproducao();

    @Override
    public abstract void alimentacao();

    @Override
    public abstract void crescimento();

    @Override
    public abstract void respiracao();

    public void mostrarSuasInformacoes() {
        System.out.printf("  Sua idade e: %d%n", idade);

        if (eucarionte) {
            System.out.println("  Ele possui carioteca em seu nucleo");
        }

        if (multicelular) {
            System.out.println("  E multicelular");
        }

        if (heterotrofico) {
            System.out.println("  Nao produz o proprio alimento");
        }

        alimentacao();
        brincar();
        reproducao();
        crescimento();
        respiracao();
    }
}
