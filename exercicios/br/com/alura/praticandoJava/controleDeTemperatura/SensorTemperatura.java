package br.com.alura.praticandoJava.controleDeTemperatura;

public class SensorTemperatura {
    private String local;
    private double temperaturaAtual;

    public SensorTemperatura(String local, double temperaturaAtual) {
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
    }

    private String calculaTemp() {
        String temperatura;
        if (this.temperaturaAtual >= 37.5) {
            temperatura = "Temperatura acima do limite!";
        } else {
            temperatura = "Temperatura dentro dos limites.";
        }

        return temperatura;
    }

    public void exibeRelatorio() {
        System.out.printf("""
                Sensor no local: %s
                Temperatura: %.1f ºC
                Alerta: %s
                """,this.local, this.temperaturaAtual, this.calculaTemp());
    }
}
