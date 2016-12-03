package Dos;

public class Prestamo {
    private String nombreDeBeneficiario;
    private double sueldo;
    private double montoPrestamo;
    private int interes;
    private int tiempoPrestamo;
    private Garante garante1;

    public Prestamo(String nombreDeBeneficiario, double sueldo, double montoPrestamo, int interes, int tiempoPrestamo, Garante garante1) {
        this.nombreDeBeneficiario = nombreDeBeneficiario;
        this.sueldo = sueldo;
        this.montoPrestamo = montoPrestamo;
        this.interes = interes;
        this.tiempoPrestamo = tiempoPrestamo;
        this.garante1 = garante1;
    }

    public String getNombreDeBeneficiario() {
        return nombreDeBeneficiario;
    }

    public void setNombreDeBeneficiario(String nombreDeBeneficiario) {
        this.nombreDeBeneficiario = nombreDeBeneficiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante garante1) {
        this.garante1 = garante1;
    }
    
    public double valorTotalPrestamo() {
        double interes = (getMontoPrestamo() * getInteres()) / 100;
        double valorAnual = getMontoPrestamo() / getTiempoPrestamo();
        double valorTotal = valorAnual + interes;
        return valorTotal;
    }
    
    @Override
    public String toString() {
        return String.format("Nombre del beneficiario: %s\nSueldo: %s\nMonto de prestamo: %,.2f\nInteres: %s'%'\nPlazo de prestamo en años: %s\n"
            + "Nombre del garante: %s\nApellido del garante: %s\nSuedo del garante: %,.2f\n", getNombreDeBeneficiario(), getSueldo(), getMontoPrestamo(), getInteres(), getTiempoPrestamo(),
            garante1.getNombre(), garante1.getApellido(), garante1.getSueldo());
    }
}
