import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do titular
        System.out.print("Informe o nome do titular: ");
        String titular = scanner.nextLine();

        // Solicita o tipo de conta
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();

        ContaBancaria conta = null;

        // Se for conta corrente, cria uma nova ContaCorrente
        if (tipoConta == 1) {
            conta = new ContaCorrente(titular);
        }
        // Se for conta poupança, solicita a taxa Selic e cria uma ContaPoupanca
        else if (tipoConta == 2) {
            System.out.print("Informe a taxa Selic atual (%): ");
            double selic = scanner.nextDouble();
            conta = new ContaPoupanca(titular, selic);
        } else {
            System.out.println("Opção inválida.");
            return;  // Encerra o programa se a opção for inválida
        }

        // Menu de operações da conta
        int opcao;
        do {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            if (conta instanceof ContaPoupanca) {
                System.out.println("3. Calcular rendimento");
            }
            System.out.println("4. Exibir dados da conta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Informe o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).calcularRendimento();
                    } else {
                        System.out.println("Opção inválida para este tipo de conta.");
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();  // Fecha o scanner
    }
}
