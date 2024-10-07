public class Corrida {
    // Atributos
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    // Construtor
    public Corrida(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    // Método para calcular o valor final da corrida
    public double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    // Método para exibir os detalhes da corrida
    public void exibirDetalhesCorrida() {
        double valorFinal = calcularValorCorrida();
        System.out.println("Detalhes da corrida:");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Tempo de espera: " + tempoEspera + " minutos");
        System.out.println("Tarifa base: R$ " + tarifaBase);
        System.out.println("Fator de demanda: " + fatorDemanda);
        System.out.println("Valor final da corrida: R$ " + valorFinal);
    }
}
