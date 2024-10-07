import java.util.Scanner;

public class SistemaUber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.print("Informe a distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Informe o tempo de espera (minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Informe a tarifa base: ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Informe o fator de demanda: ");
        double fatorDemanda = scanner.nextDouble();

        // Criação do objeto Corrida
        Corrida corrida = new Corrida(distancia, tempoEspera, tarifaBase, fatorDemanda);

        // Exibe os detalhes e o valor final da corrida
        corrida.exibirDetalhesCorrida();

        scanner.close();  // Fecha o scanner
    }
}
