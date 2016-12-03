package Tres;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Coches coche = new Coches(1111, "Rojo", "Toyota", 5, 5);
        Microbuses microbus = new Microbuses(2222, "Amarillo", "Mitsubishi", 5, 3);
        Furgonetas furgoneta = new Furgonetas(3333, "Plomo", "Hyundai", 5);
        Camiones camion = new Camiones(4444, "Vino", "Hino", 10, 1000);
        
        Vehiculo vh[] = new Vehiculo[4];
        vh[0] = coche;
        vh[1] = microbus;
        vh[2] = furgoneta;
        vh[3] = camion;
        
        for (Vehiculo vehiculo : vh) {
            System.out.println(vehiculo);
            System.out.printf("Valor del alquiler $%,.2f\n\n", vehiculo.obtenerPrecioAlquiler());
        }
    }
}