package Tres;

public abstract class Vehiculo {
    private int matricula;
    private String color;
    private String marca;
    private int diasAlquiler;

    public Vehiculo(int matricula, String color, String marca, int diasAlquiler) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.diasAlquiler = diasAlquiler;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    
    public double precioBase() {
        return getDiasAlquiler() * 50.00;
    }
    
    @Override
    public String toString() {
        return String.format("Matricula: %s\nColor: %s\nMarca: %s\nDias de alquiler: %s",
            getMatricula(), getColor(), getMarca(), getDiasAlquiler());
    }
    
    public abstract double obtenerPrecioAlquiler();
}