public class Main {
    public static void main(String[] args) {
        System.out.println("Auto");
        Automovil auto1 = new Automovil("BMW", "Camioneta", (byte)500, "Rojo");
        System.out.println(auto1);
        auto1.arrancar();
        auto1.meter();
        auto1.acelerar();

        //TAREA 6 EJERCICIO 1
        System.out.println("");
        System.out.println("MONITOR");
        Monitor m1 = new Monitor(24.7, "Phillips", "SIETE", "OLED", 5238);
        System.out.println(m1);
        m1.encender();
        m1.cargando();
        m1.ver();

        //EJERCICIO 2
        System.out.println("");
        System.out.println("PERSONA");
        Persona p1 = new Persona(17, "Camila", 1.57, 55, "femenino");
        System.out.println(p1);
        p1.despertar();
        p1.estirarse();
        p1.caminar();

        //EJERCIO 3
        System.out.println("");
        System.out.println("LIBRO");
        Libro l1 = new Libro("media carta","dura", 527 , "times new roman", "romantico");
        System.out.println(l1);
        l1.abrir();
        l1.elegir();
        l1.cerrar();
        }
    }
