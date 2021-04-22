package Main;

import Clases.Alquiler.*;
import Clases.Persona.*;
import Clases.Producto.Pelicula;
import Enums.*;
import Menu.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alquiler> alquileres = new ArrayList<> ( );
        ArrayList<Pelicula> peliculas = new ArrayList<> ( );
        ArrayList<Cliente> clientes = new ArrayList<> ( );
        boolean exit = false;
        String eleccionInicio;
        while (!exit) {
            System.out.println (Menu.MENSAJEINICIAL);
            eleccionInicio = Menu.pedirDato ("su elección: ");
            switch (eleccionInicio) {
                case "1" -> {
                    establecerCliente (clientes);
                }
                case "2" -> {
                    establecerPelicula (peliculas);
                }
                case "3" -> {
                    establecerAlquiler (alquileres, clientes, peliculas);
                }
                case "4" -> {
                    imprimirYRecorrerListaAlquileres (alquileres);
                }
                case "5" -> {
                    System.out.println ("Good Bye!");
                    exit = true;
                }

                default -> {
                    System.out.println (Menu.MENSAJEERROR);
                }
            }
        }
    }


    //Case 1
    private static void establecerCliente(ArrayList<Cliente> clientes) {
        String nombre;
        String apellidos;
        String dni;
        LocalDate fechaNaciemiento = null;
        nombre = Menu.pedirDato ("el nombre del cliente");
        apellidos = Menu.pedirDato ("los apellidos del cliente");
        dni = Menu.pedirDato ("el Documento Nacional de Identidad del cliente");
        fechaNaciemiento = Menu.introducirYValidarFechas ("de nacimiento del cliente");
        Cliente cliente = new Cliente (nombre, apellidos, dni, fechaNaciemiento);
        clientes.add (cliente);
    }


    //Case 2
    private static void establecerPelicula(ArrayList<Pelicula> peliculas) {
        String nombre;
        RecomendacionEdad recomendacionEdad = null;
        CategoriaPelicula categoriaPelicula = null;
        int anioSalida;
        nombre = Menu.pedirDato ("el nombre de la pelicula");
        recomendacionEdad = Menu.introducirYValidarRecomendacionEdad ( );
        categoriaPelicula = Menu.introducirYValidarCategoriaPelicula ( );
        anioSalida = Menu.parseInt (Menu.pedirDato ("el año de salida"));
        Pelicula peli = new Pelicula (nombre, recomendacionEdad, categoriaPelicula, anioSalida);
        peliculas.add (peli);
    }

    //Case 3
    private static void establecerAlquiler(ArrayList<Alquiler> alquileres, ArrayList<Cliente> clientes, ArrayList<Pelicula> peliculas){
        Cliente cliente = null;
        Pelicula pelicula = null;
        LocalDate fechaRecogida = null;
        cliente = clientes.get (Menu.imprimirYRecorrerListaClientes (clientes));
        pelicula = peliculas.get (Menu.imprimirYRecorrerListaPeliculas (peliculas));
        fechaRecogida = Menu.introducirYValidarFechas ("de alquiler de la película");
        int dias = Menu.parseInt(Menu.pedirDato ("el número de días que va a alquilar la película"));
        Alquiler alquiler = new Alquiler (cliente, pelicula, fechaRecogida,dias);
        alquileres.add (alquiler);
    }

    //Case 4
    private static void imprimirYRecorrerListaAlquileres(ArrayList<Alquiler> lista) {
        System.out.println ("Lista de alquileres: ");
        int index = 1;
        for (Alquiler alquiler : lista) {
            System.out.println ((index++) + " --> " + alquiler);
        }
    }

}
