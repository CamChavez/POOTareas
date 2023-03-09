public class MainEjercicios {
    public static void main(String[] args) {

        // PAIS
        Pais p=  new Pais("Taiwan", "Taipei", 23.250000, "Tainan", "Tsai Ing-wen", "chino mandarin");
        System.out.println(p);
        p.temperatura();
        p.personas();

        System.out.println("");

        // GIROSCOPIO
        Giroscopio gg = new Giroscopio("que se usa para poder conocer el horizonte, ", "permite conocer y medir la orientación de un elemento, dispositivo o vehículo", " están el del horizonte artificial de los aviones u barcos", 300);
        System.out.println(gg);
        gg.definir();
        System.out.println("que interesante es");
        System.out.println("ahora se que " + gg.getUsos());
        System.out.println("y que cuestan " + gg.getPrecio());
        gg.aparato();

        System.out.println("");

        //COMPUTADORA
        Computadora c = new Computadora(" LENOVO", " Compacto", 24.7, " FullHD", " rojo", " Core 7");
        System.out.println(c);
        c.encender();
        c.usar();
        c.apagar();

        System.out.println("");

        //CUBO DE RUBIK
        Cubo cr = new Cubo("cabe en mi mano", (byte)6, (byte)6, 248.50);
        System.out.println(cr);
        cr.armar();
        cr.cara ();
        cr.terminar();

        System.out.println("");

        //LIBRO
        System.out.println("LIBRO");
        Libro l1 = new Libro("media carta","dura", 527 , "times new roman", "romantico");
        System.out.println(l1);
        l1.abrir();
        l1.elegir();
        l1.cerrar();

        System.out.println("");

        //PAGINA WEB
        PaginaWeb pw = new PaginaWeb ("juegos", "FRIV", "https://friv.jogos.com", "Juegos de todo tipo", "ayer");
        pw.visitar();
        System.out.println("juega juega juega");
        pw.cerrar();

        System.out.println("");

        //BALON
        Balón b = new Balón("grande", "rojo", "firme");
        b.ver();
        b.cambio();

        System.out.println("");

        //LAMPARA
        Lampara l = new Lampara(50, "de mesita", "buro izquierdo de la cama");
        System.out.println(l);
        l.encender();
        System.out.println("así  prendian la lampara en iCarly");
        l.apagar();

    }
}
