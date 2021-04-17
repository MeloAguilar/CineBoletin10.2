package Clases.Persona;

import java.time.LocalDate;

public class Cliente extends Persona{

    private static int numClientes = 0;
    private int idCliente;

    public Cliente(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {
        super (nombre, apellidos, dni, fechaNacimiento);
        this.numClientes++;
        this.idCliente = numClientes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return super.toString () +
                "\nIdCliente: " + idCliente +
                "\n*************************************************";
    }
}
