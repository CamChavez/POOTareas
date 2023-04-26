public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel", 6);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.transportar();
        camion.frenar();
        System.out.println(camion.apagar());

        System.out.println("");
        System.out.println("");
        System.out.println("MOTOCICLETA");
        System.out.println("");
        System.out.println("");

        Motacicleta moto = new Motacicleta(185, "Volvo");
        System.out.println(moto.encender());
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        System.out.println(moto.apagar());
    }
}
