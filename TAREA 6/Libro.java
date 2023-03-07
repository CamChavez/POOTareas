public class Libro {
    private String tamanio;
    private String pasta;
    private double hojas;
    private String letra;
    private String genero;

    public Libro() {
    }

    public Libro(String tamanio, String pasta, double hojas, String letra, String genero) {
        this.tamanio = tamanio;
        this.pasta = pasta;
        this.hojas = hojas;
        this.letra = letra;
        this.genero = genero;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }

    public double getHojas() {
        return hojas;
    }

    public void setHojas(double hojas) {
        this.hojas = hojas;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tamanio='" + tamanio + '\'' +
                ", pasta='" + pasta + '\'' +
                ", hojas=" + hojas +
                ", letra='" + letra + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public boolean abrir (){
        System.out.println("abriendo el libro");
        return true;
    }
     public void elegir (){
        System.out.println("mmmm ¿dónde nos quedamos?");
    }
     public void cerrar (){
        System.out.println("antes de cerrar no olvides el separador");
    }


}