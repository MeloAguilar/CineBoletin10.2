package Clases.Alquiler;

import Clases.Persona.*;
import Clases.Persona.*;
import Clases.Producto.Pelicula;
import Clases.Producto.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {

    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate fechaRecogida;
    private int dias;
    public static final double VALOR_INVARIABLE = 1.67;

    public Alquiler(Cliente cliente, Pelicula pelicula, LocalDate fechaRecogida, int dias) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaRecogida = fechaRecogida;
        this.dias = dias;
        getFechaEntrega ();
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
          return  this.fechaRecogida.plusDays (this.dias);
    }


    public double setPrecioAlquiler(){
       return VALOR_INVARIABLE*(this.dias*0.5);
    }

    @Override
    public String toString() {
        return "Alquiler\n**************************************" +
                "\nCliente: " + this.cliente.getIdCliente () +
                "\nPelicula: " + this.pelicula.getNombre () +
                "\nFecha de Recogida: " + fechaRecogida +
                "\nFecha de Entrega: " + this.getFechaEntrega() +
                "\nPrecio del Alquiler: " + this.setPrecioAlquiler()+"€"+
                "\n**************************************";
    }
}
