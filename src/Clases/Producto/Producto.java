package Clases.Producto;
import Enums.CategoriaPelicula;


public class Producto {


    //Atributos
    private String nombre;
    private double precio;


    //Métodos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "**************************************" +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio;
    }
}
