package Clases.Producto;

import Enums.CategoriaPelicula;
import Enums.RecomendacionEdad;

import java.time.LocalDate;

public class Pelicula extends Producto{

    //Atributos
    private RecomendacionEdad recomendacionEdad;
    private CategoriaPelicula categoriaPelicula;
    private int anioSalida;



    //Métodos
    public Pelicula(String nombre, RecomendacionEdad recomendacionEdad,
                    CategoriaPelicula categoria, int anioSalida) {
        super (nombre, 0);
        this.recomendacionEdad = recomendacionEdad;
        this.categoriaPelicula = categoria;
        this.anioSalida = anioSalida;
    }

    public RecomendacionEdad getRecomendacionEdad() {
        return recomendacionEdad;
    }

    public void setRecomendacionEdad(RecomendacionEdad recomendacionEdad) {
        this.recomendacionEdad = recomendacionEdad;
    }

    public CategoriaPelicula getCategoriaPelicula() {
        return categoriaPelicula;
    }

    public void setCategoriaPelicula(CategoriaPelicula categoriaPelicula) {
        this.categoriaPelicula = categoriaPelicula;
    }

    public int getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(int anioSalida) {
        this.anioSalida = anioSalida;
    }


    @Override
    public String toString() {
        return super.toString () +
                "\nRecomendacion de Edad: Mayores de " + recomendacionEdad.getEdad () +
                "\nCategoria de la Pelicula: " + categoriaPelicula.toString () +
                "\nAño de Salida: " + anioSalida +
                "**************************************";
    }
}


