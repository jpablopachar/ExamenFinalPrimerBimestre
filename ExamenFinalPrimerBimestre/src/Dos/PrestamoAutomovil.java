package Dos;

public class PrestamoAutomovil extends Prestamo {
    private String tipoVehiculo;
    private String marcaVehiculo;
    private Garante garante2;

    public PrestamoAutomovil(String nombreDeBeneficiario, double sueldo, double montoPrestamo, int interes, int tiempoPrestamo, Garante garante1,
        String tipoVehiculo, String marcaVehiculo, Garante garante2) {
        super(nombreDeBeneficiario, sueldo, montoPrestamo, interes, tiempoPrestamo, garante1);
        this.tipoVehiculo = tipoVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.garante2 = garante2;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString(), "\nTipo de vehiculo: %s\nMarca de Vehiculo. %s\n"
            + "Nombre del Garante 2: %s\nApellido del Garante 2: %s\nSueldo del Garante 2: %.2f\n",
            getTipoVehiculo(), getMarcaVehiculo(), getMarcaVehiculo(), garante2.getNombre(), garante2.getApellido(), garante2.getSueldo());
    } 
}
