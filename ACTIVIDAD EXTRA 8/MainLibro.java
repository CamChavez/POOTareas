package org.example;

import Controlador.ControladorLibro;
import Vista.VentanaLibro;

public class Main {
    public static void main(String[] args) {

  VentanaLibro view = new VentanaLibro("MVC Y JDBC LIBROS");
        ControladorLibro controlador = new ControladorLibro(view);

    }

}
