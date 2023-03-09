public class Computadora {

    private String marca;
    private String modelo;
    private double pulgadas;
    private String resolucion;
    private String color;
    private String procesador;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, double pulgadas, String resolucion, String color, String procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.color = color;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulgadas=" + pulgadas +
                ", resolucion='" + resolucion + '\'' +
                ", color='" + color + '\'' +
                ", procesador='" + procesador + '\'' +
                '}';
    }
    public void encender(){
        System.out.println( "la computadora " + marca  + "se encenderá");
        System.out.println("Cargando...");
    }
    public void usar(){
        System.out.println(" con este procesador " + procesador + "te agarran los juegos machin");
    }
    public void apagar(){
        System.out.println("me voy a apagar, a momir");
    }
}
