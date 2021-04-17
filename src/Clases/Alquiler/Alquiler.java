package Clases.Alquiler;

import Clases.Persona.Cliente;
import Clases.Persona.Persona;
import Clases.Producto.Pelicula;
import Clases.Producto.Producto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {

    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate fechaRecogida;
    private LocalDate fechaEntrega;

    public Alquiler(Cliente cliente, Pelicula pelicula, LocalDate fechaRecogida) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaRecogida = fechaRecogida;
        setFechaEntrega ();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaRecogida() {
        return fechaRecogida;
    }

    public void setFechaRecogida(LocalDate fechaRecogida) {
        this.fechaRecogida = fechaRecogida;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega() {
            this.fechaEntrega = this.fechaRecogida.plusDays (6);
    }



    @Override
    public String toString() {
        return "Alquiler\n**************************************" +
                "\nCliente: " + this.cliente.getIdCliente () +
                "\nPelicula: " + this.pelicula.getNombre () +
                "\nFecha de Recogida: " + fechaRecogida +
                "\nFecha de Entrega: " + fechaEntrega +
                "\n**************************************";
    }
}
