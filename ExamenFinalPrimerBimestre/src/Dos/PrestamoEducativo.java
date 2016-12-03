package Dos;

public class PrestamoEducativo extends Prestamo{
    private int nivelEstudio;
    private String centroEducativo;
    private Garante garante2;
    private Garante garant3;

    public PrestamoEducativo(String nombreDeBeneficiario, double sueldo, double montoPrestamo, int interes, int tiempoPrestamo, Garante garante1, 
        int nivelEstudio, String centroEducativo, Garante garante2, Garante garant3) {
        super(nombreDeBeneficiario, sueldo, montoPrestamo, interes, tiempoPrestamo, garante1);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.garante2 = garante2;
        this.garant3 = garant3;
    }

    public int getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(int nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

    public Garante getGarant3() {
        return garant3;
    }

    public void setGarant3(Garante garant3) {
        this.garant3 = garant3;
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString(), "\nNivel de estudio: %s\nNombre del centro educativo: %s\n"
            + "Nombre del Garante 3: %s\nApellido del Garante 3: %s\nSueldo del garante 3: %s\n",
            getNivelEstudio(), getCentroEducativo(), garant3.getNombre(), garant3.getApellido(), garant3.getSueldo());
    }
}
