package br.com.alura.praticandoJava.controleDeTemperatura;

public class Principal {
    public static void main(String[] args) {
        SensorTemperatura temperatura = new SensorTemperatura("Setor A", 39.2);
        temperatura.exibeRelatorio();

        SensorTemperatura temperatura1 = new SensorTemperatura("Setor B", 37.5);
        temperatura1.exibeRelatorio();

        SensorTemperatura temperatura2 = new SensorTemperatura("Setor C", 36.0);
        temperatura2.exibeRelatorio();

    }
}
