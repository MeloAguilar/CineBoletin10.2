package Clases.Persona;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {

    //Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad(){
        return (int)ChronoUnit.DAYS.between (fechaNacimiento, LocalDate.now ())/365;
    }


    @Override
    public String toString() {
        return "*************************************************" +
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nDni: " + dni +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nEdad: " + this.getEdad ();
    }
}
