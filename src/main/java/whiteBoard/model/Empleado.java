package whiteBoard.model;

import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private Double sueldo;

    @Override
    public String toString() {
        return nombre +
                "," + apellido +
                "," + fecha +
                "," + sueldo;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
