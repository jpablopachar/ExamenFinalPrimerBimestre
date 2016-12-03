package Tres;

public class Camiones extends Vehiculo {
    private int toneladas;

    public Camiones(int matricula, String color, String marca, int diasAlquiler, int toneladas) {
        super(matricula, color, marca, diasAlquiler);
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
    
    @Override
    public double obtenerPrecioAlquiler() {
        double calculo = getToneladas() * 20.00;
        return precioBase() + calculo;
    }
}