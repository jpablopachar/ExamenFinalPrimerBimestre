package Uno;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombreDocente, apellidoDocente, tituloDocente, nombreDocente2, apellidoDocente2, tituloDocente2, nombreAlumno, apellidoAlumno;
        char desea;
        
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            nombreAlumno = reader.next();
            System.out.print("Ingrese el apellido del alumno: ");
            apellidoAlumno = reader.next();
            System.out.print("Ingrese el nombre del docente de programación: ");
            nombreDocente = reader.next();
            System.out.print("Ingrese el apellido del docente de programación: ");
            apellidoDocente = reader.next();
            System.out.print("Ingrese el titulo del docente de programación: ");
            tituloDocente = reader.next();
            System.out.print("Ingrese el nombre del docente de base de datos: ");
            nombreDocente2 = reader.next();
            System.out.print("Ingrese el apellido del docente de base de datos: ");
            apellidoDocente2 = reader.next();
            System.out.print("Ingrese el titulo del docente de base de datos: ");
            tituloDocente2 = reader.next();
            
            Docente docente1 = new Docente(nombreDocente, apellidoDocente, tituloDocente);
            Docente docente2 = new Docente(nombreDocente2, apellidoDocente2, tituloDocente2);
            Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, docente1, docente2);
            
            System.out.println(alumno);
            
            System.out.print("¿Desea ingresar otro alumno? (S/N): ");
            desea = reader.next().charAt(0);
        } while (desea == 'S' || desea == 's');   
    }
}
