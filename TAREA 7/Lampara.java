public class Lampara {
    private double tamanio;
    private String tipo;
    private String lugar;

    public Lampara() {
    }

    public Lampara(double tamanio, String tipo, String lugar) {
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.lugar = lugar;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tamanio=" + tamanio +
                ", tipo='" + tipo + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("laaammmmpaara");
    }
    public  void apagar(){
        System.out.println("ya no la ocupo, laaammmmparaaa apagateee");
    }
}
