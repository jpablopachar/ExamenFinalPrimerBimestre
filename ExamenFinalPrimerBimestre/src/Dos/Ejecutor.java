package Dos;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombreGarante1, apellidoGarante1, nombreGarante2, apellidoGarante2, nombreGarante3, apellidoGarante3, nombreBeneficiario,
            tipoVehiculo, marcaVehiculo, nombreCentroEducativo;
        int interes, tiempoPrestamo, i, j;
        double sueldoGarante1, sueldoGarante2, sueldoGarante3, sueldoBeneficiario, montoPrestamo;
        
        for (i = 0; i < 1; i++) {
            System.out.print("Ingrese el nombre del beneficiario: ");
            nombreBeneficiario = reader.next();
            System.out.print("Ingrese el sueldo del beneficiario: ");
            sueldoBeneficiario = reader.nextDouble();
            System.out.print("Ingrese el monto de prestamo: ");
            montoPrestamo = reader.nextDouble();
            System.out.print("Ingrese el interes a pagar: ");
            interes = reader.nextInt();
            System.out.print("Ingrese el plazo a pagar en años");
            tiempoPrestamo = reader.nextInt();
            System.out.print("Ingrese el tipo de Vehiculo: ");
            tipoVehiculo = reader.next();
            System.out.print("Ingrese la marca del vehiculo: ");
            marcaVehiculo = reader.next();
            System.out.print("Ingrese el nombre del garante 1: ");
            nombreGarante1 = reader.next();
            System.out.print("Ingrese el apellido del garante 1: ");
            apellidoGarante1 = reader.next();
            System.out.print("Ingrese el sueldo del garante 1: ");
            sueldoGarante1 = reader.nextDouble();
            System.out.print("Ingrese el nombre del garante 2: ");
            nombreGarante2 = reader.next();
            System.out.print("Ingrese el apellido del garante 2: ");
            apellidoGarante2 = reader.next();
            System.out.print("Ingrese el sueldo del garante 2: ");
            sueldoGarante2 = reader.nextDouble();
            
            Garante garante1 = new Garante(nombreGarante1, apellidoGarante1, sueldoGarante1);
            Garante garante2 = new Garante(nombreGarante2, apellidoGarante2, sueldoGarante2);
            PrestamoAutomovil auto = new PrestamoAutomovil(nombreBeneficiario, sueldoBeneficiario, montoPrestamo, interes, tiempoPrestamo, garante1, tipoVehiculo, marcaVehiculo, garante2);
            
            System.out.println(auto);
        }
    }
}
