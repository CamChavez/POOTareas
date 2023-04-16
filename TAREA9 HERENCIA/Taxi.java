public class Taxi extends Automovil{
    private String conductor;
    private String aplicacion;
    private String licencia;

    public Taxi() {
    }

    public Taxi(String conductor, String aplicacion, String licencia) {
        this.conductor = conductor;
        this.aplicacion = aplicacion;
        this.licencia = licencia;
    }

    public Taxi(String marca, String subMarca, String color, String conductor, String aplicacion, String licencia) {
        super(marca, subMarca, color);
        this.conductor = conductor;
        this.aplicacion = aplicacion;
        this.licencia = licencia;
    }

    public Taxi(String tipo, int ruedas, int puertas, String modelo, int velocidadmaxima, String marca, String subMarca, String color, String conductor, String aplicacion, String licencia) {
        super(tipo, ruedas, puertas, modelo, velocidadmaxima, marca, subMarca, color);
        this.conductor = conductor;
        this.aplicacion = aplicacion;
        this.licencia = licencia;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "conductor='" + conductor + '\'' +
                ", aplicacion='" + aplicacion + '\'' +
                ", licencia='" + licencia + '\'' +
                ", marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ruedas=" + ruedas +
                ", puertas=" + puertas +
                ", modelo='" + modelo + '\'' +
                ", velocidadmaxima=" + velocidadmaxima +
                '}';
    }

    public void donde(){
        System.out.println("a donde vamos joven");
    }
    public void app(){
        System.out.println("bienvenido soy tu conductor de " + aplicacion + "¿podemos iniciar tu viaje?");
    }
    public void policia(){
        System.out.println("por eso oficial si traigo licencia");
        System.out.println("si del coche y la mia");
        System.out.println("es " + licencia);
    }
}
