public class Automovil extends Vehiculo{
    protected String marca;
    protected String subMarca;
    protected  String color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, String color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.color = color;
    }

    public Automovil(String tipo, int ruedas, int puertas, String modelo, int velocidadmaxima, String marca, String subMarca, String color) {
        super(tipo, ruedas, puertas, modelo, velocidadmaxima);
        this.marca = marca;
        this.subMarca = subMarca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ruedas=" + ruedas +
                ", puertas=" + puertas +
                ", modelo='" + modelo + '\'' +
                ", velocidadmaxima=" + velocidadmaxima +
                '}';
    }

    public boolean arrancar(){
        System.out.println("run run");
        return true;
    }
    public void meter (){

        System.out.println("se mete el clutch");
    }
    public void acelerar(){

        System.out.println("R de Recio hasta la maxima veocidad de " + velocidadmaxima + " km/h" );
    }
}