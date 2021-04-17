package Menu;

import Clases.Persona.Cliente;
import Clases.Producto.Pelicula;
import Enums.CategoriaPelicula;
import Enums.RecomendacionEdad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner (System.in);
    public static final String MENSAJEPEDIRDATO = "Introduce aquí ";
    public static final String MENSAJEINICIAL = "Que desea realiza:\n1 --> Registrar Cliente\n2 --> Registrar Pelicula\n3 --> Registrar un Alquiler\n4 --> Mostrar alquileres\n5 --> salir";
    public static final String MENSAJEERROR = "Dato erroneo introducido.";
    public static final String MENSAJE_INTRODUCE_RECOMENDACION = "Introduce:\nGrado0 --> Todos los públicos.\nGrado1 --> +7" +
            "\nGrado2 --> +12\nGrado3--> +16\nGrado4 --> +18";
    public static final String MENSAJE_INTRODUCE_RECOMENDACION_VALIDA = "Introduce una recomendación de edad válida";
    public static final String MENSAJE_INTRODUCE_CATEGORIA_PELICULA = "Introduce la categoría de la pelicula:\nCategorías Posibles" +
            " --> ACCION, AVENTURAS, COMEDIA, FANTASIA, TERROR, DRAMA, MUSICAL, CIENCIA_FICCION, BELICA, CRIMEN, INFANTIL";
    public static final String MENSAJE_INTRODUCE_PELICULA_VALIDA = "Introduce una categoría válida";

    public static String pedirDato(String quePedir){
        System.out.print (MENSAJEPEDIRDATO + quePedir );
        return sc.nextLine ();
    }

    /**
     * Método que valida que un String se puede convertir en un entero y lo devuelve
     * Precondiciones: ninguna
     * Postcondiciones: devuelve el valor númerico de el parámetro cadena
     *
     * @param cadena
     * @return: entero valor
     */
    public static int parseInt(String cadena) {
        int valor;
        try {
            valor = Integer.parseInt (cadena);
        } catch (IllegalArgumentException e) {
            valor = 0;
        }
        return valor;
    }

    /**
     * Método que traduce 3 Strings introducidos por teclado a enteros y después devuelve una fecha a partir de estos.
     * Precondiciones: diaCadena, mesCadena y anioCadena deben ser números enteros. Esto se hace para evitar los problemas
     * de volcado de variables cuando se utiliza un escaner para pedir al usuario un entero
     *
     * @param descripcionFechaAPedir: String que muestra para que servirá la fecha.
     * @return Una fecha compuesta a partir de 3 Strings pedidos por teclado.
     */
    public static LocalDate introducirYValidarFechas(String descripcionFechaAPedir) {
        int dia = 0, mes = 0, anhio = 0;
        String diaCadena = "", mesCadena = "", anioCadena = "";
        LocalDate fechaAux = null;
        while (dia < 1 || mes < 1 || anhio < 1) {
            try {
                System.out.println ("Introduce el día " + descripcionFechaAPedir);
                diaCadena = sc.nextLine ( );
                dia = parseInt (diaCadena);
                System.out.println ("Introduce el mes " + descripcionFechaAPedir);
                mesCadena = sc.nextLine ( );
                mes = parseInt (mesCadena);
                System.out.println ("Introduce el año " + descripcionFechaAPedir);
                anioCadena = sc.nextLine ( );
                anhio = parseInt (anioCadena);
            } catch (IllegalArgumentException e) {
                System.out.println ("Introduce una fecha correcta");
            }
        }
        fechaAux = LocalDate.parse (diaCadena + "-" + mesCadena + "-" + anioCadena, DateTimeFormatter.ofPattern ("dd-MM-yyyy"));
        return fechaAux;
    }


    /**
     * Método que pide al usuario que introduzca la recomendación de edad de una película, lo valida y lo devuelve.
     * Precondiciones: ninguna
     * Postcondiciones: devuelve la variable recomendacion validada.
     *
     * @return: RecomendacionEdad recomendacion
     */
    public static CategoriaPelicula introducirYValidarCategoriaPelicula() {
        CategoriaPelicula categoriaPelicula = null;
        while (categoriaPelicula == null) {
            System.out.println (MENSAJE_INTRODUCE_CATEGORIA_PELICULA);
            try {
                categoriaPelicula = CategoriaPelicula.valueOf (sc.nextLine ( ).toUpperCase ( ).replace (' ', '_'));

            } catch (IllegalArgumentException e) {
                System.out.println (MENSAJE_INTRODUCE_PELICULA_VALIDA);
            }
        }
        return categoriaPelicula;
    }

    /**
     * Método que pide al usuario que introduzca la recomendación de edad de una película, lo valida y lo devuelve.
     * Precondiciones: ninguna
     * Postcondiciones: devuelve la variable recomendacion validada.
     *
     * @return: RecomendacionEdad recomendacion
     */
    public static RecomendacionEdad introducirYValidarRecomendacionEdad() {
        RecomendacionEdad recomendacion = null;
        while (recomendacion == null) {
            System.out.println (MENSAJE_INTRODUCE_RECOMENDACION);
            try {
                recomendacion = RecomendacionEdad.valueOf (sc.nextLine ( ).toUpperCase ( ).replace (' ', '_'));

            } catch (IllegalArgumentException e) {
                System.out.println (MENSAJE_INTRODUCE_RECOMENDACION_VALIDA);
            }
        }
        return recomendacion;
    }


    public static int imprimirYRecorrerListaClientes(ArrayList<Cliente> lista) {
        System.out.println ("Lista de clientes registrados: ");
        int index = 1;
        for (Cliente cliente : lista) {
            System.out.println ((index++) + " --> " + cliente);
        }
        index = 0;
        while ((index - 1) < 0 || lista.size ( ) < index) {
            System.out.println ("introduzca la posicion del cliente al que desea alquilar la película");
            String indiceCadena = sc.nextLine ( );
            index = parseInt (indiceCadena);
        }
        return index - 1;
    }

    public static int imprimirYRecorrerListaPeliculas(ArrayList<Pelicula> lista) {
        System.out.println ("Lista de clientes registrados: ");
        int index = 1;
        for (Pelicula pelicula : lista) {
            System.out.println ((index++) + " --> " + pelicula);
        }
        index = 0;
        while ((index - 1) < 0 || lista.size ( ) < index) {
            System.out.println ("introduzca la posicion de la película a alquilar");
            String indiceCadena = sc.nextLine ( );
            index = parseInt (indiceCadena);
        }
        return index - 1;
    }


}
