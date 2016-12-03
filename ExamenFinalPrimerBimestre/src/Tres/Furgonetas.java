package Tres;

public class Furgonetas extends Vehiculo {

    public Furgonetas(int matricula, String color, String marca, int diasAlquiler) {
        super(matricula, color, marca, diasAlquiler);
    }
    
    @Override
    public double obtenerPrecioAlquiler() {
        return precioBase() + 100.00;
    }
}