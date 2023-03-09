public class Cubo {
    private String tamaño;
    private byte caras;
    private byte colores;
    private double precio;

    public Cubo() {
    }

    public Cubo(String tamaño, byte caras, byte colores, double precio) {
        this.tamaño = tamaño;
        this.caras = caras;
        this.colores = colores;
        this.precio = precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public byte getCaras() {
        return caras;
    }

    public void setCaras(byte caras) {
        this.caras = caras;
    }

    public byte getColores() {
        return colores;
    }

    public void setColores(byte colores) {
        this.colores = colores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "tamaño='" + tamaño + '\'' +
                ", caras=" + caras +
                ", colores=" + colores +
                ", precio=" + precio +
                '}';
    }
    public void armar (){
        System.out.println("seis caras, to contra reloj, espero romper el record");
    }
    public void cara (){
        System.out.println(caras);
    }
    public void terminar(){
        System.out.println("esto fue dificil pero se logro, uniendo los " + colores);
    }
}
