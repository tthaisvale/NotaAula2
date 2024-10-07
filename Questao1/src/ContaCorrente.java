public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial = 1000.0;

    // Construtor
    public ContaCorrente(String titular) {
        super(titular);  // Chama o construtor da classe base (ContaBancaria)
    }

    // Sobrescreve o método sacar para incluir o cheque especial
    @Override
    public void sacar(double valor) {
        if (valor > 0 && (saldo + chequeEspecial) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso (com cheque especial, se necessário).");
        } else {
            System.out.println("Saldo insuficiente, mesmo com cheque especial.");
        }
    }

    // Exibir dados da conta corrente (inclui cheque especial)
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cheque especial disponível: R$ " + chequeEspecial);
    }
}
