public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Aereo", 2, 4, "A33Neo", 1061);
        System.out.println(vehiculo);
        vehiculo.avanzar();
        vehiculo.retroceder();

        //Automovil
        System.out.println("AUTOMOVIL");
        Automovil automovil = new Automovil("hibrido", 4, 4, "Ford Galaxy Hybrid", 185, "Ford", "Galaxy", "NEGRO MATE");
        System.out.println(automovil);
        automovil.arrancar();
        automovil.meter();
        automovil.acelerar();
        automovil.avanzar();
        automovil.retroceder();

        //Taxi
        System.out.println("TAXI");
        Taxi taxi = new Taxi("McLaren", "deportivo", "negro mate", "Antonio Salas", "UBER VIP","26492-JWSD");
        System.out.println(taxi);
        taxi.avanzar();
        taxi.retroceder();
        taxi.arrancar();
        taxi.meter();
        taxi.acelerar();
        taxi.donde();
        taxi.app();
        taxi.policia();
    }
}