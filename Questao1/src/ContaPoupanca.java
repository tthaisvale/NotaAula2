public class ContaPoupanca extends ContaBancaria {
    private double selic;

    // Construtor
    public ContaPoupanca(String titular, double selic) {
        super(titular);  // Chama o construtor da classe base (ContaBancaria)
        this.selic = selic;
    }

    // Método para calcular o rendimento com base na taxa Selic
    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado: R$ " + rendimento);
        System.out.println("Novo saldo: R$ " + saldo);
    }

    // Exibir dados da conta poupança
    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
