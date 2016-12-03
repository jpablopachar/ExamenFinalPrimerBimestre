package Tres;

public class Coches extends Vehiculo {
    private int numeroPasajeros;

    public Coches(int matricula, String color, String marca, int diasAlquiler, int numeroPasajeros) {
        super(matricula, color, marca, diasAlquiler);
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    
    @Override
    public double obtenerPrecioAlquiler() {
        double calculo = getNumeroPasajeros() * 5.00;
        return precioBase() + calculo;
    }
}