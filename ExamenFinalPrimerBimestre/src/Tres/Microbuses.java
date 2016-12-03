package Tres;

public class Microbuses extends Vehiculo {
    private int numeroRutasDiarias;

    public Microbuses(int matricula, String color, String marca, int diasAlquiler, int numeroRutasDiarias) {
        super(matricula, color, marca, diasAlquiler);
        this.numeroRutasDiarias = numeroRutasDiarias;
    }

    public int getNumeroRutasDiarias() {
        return numeroRutasDiarias;
    }

    public void setNumeroRutasDiarias(int numeroRutasDiarias) {
        this.numeroRutasDiarias = numeroRutasDiarias;
    }
    
    @Override
    public double obtenerPrecioAlquiler() {
        double calculo = getNumeroRutasDiarias() * 10.00;
        return precioBase() + calculo;
    }
}