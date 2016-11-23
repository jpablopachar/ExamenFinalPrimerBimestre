package Uno;

public class Alumno {
    private String nombre;
    private String apellido;
    private Docente docente_programacion;
    private Docente docente_base_datos;

    public Alumno(String nombre, String apellido, Docente docente_programacion, Docente docente_base_datos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.docente_programacion = docente_programacion;
        this.docente_base_datos = docente_base_datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Docente getDocente_programacion() {
        return docente_programacion;
    }

    public void setDocente_programacion(Docente docente_programacion) {
        this.docente_programacion = docente_programacion;
    }

    public Docente getDocente_base_datos() {
        return docente_base_datos;
    }

    public void setDocente_base_datos(Docente docente_base_datos) {
        this.docente_base_datos = docente_base_datos;
    }
    
    @Override
    public String toString() {
        return String.format("\nNombre del alumno: %s\nApellido del alumno: %s\n"
            + "Nombre del docente de programación: %s\nApellido del docente de programación: %s\nTitulo del docente de programación: %s\n"
            + "Nombre del docente de base de datos: %s\nApellido del docente de base de datos: %s\nTitulo del docente de base de datos: %s\n", 
            getNombre(), getApellido(), docente_programacion.getNombre(), docente_programacion.getApellido(), docente_programacion.getTitulo(),
            docente_base_datos.getNombre(), docente_base_datos.getApellido(), docente_base_datos.getTitulo());           
    }
}
