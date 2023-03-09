public class Gato {
    private String nombre;
    private String color;
    private String anios;
    private String vacunas;
    private String temperamento;

    public Gato() {
    }

    public Gato(String nombre, String color, String anios, String vacunas, String temperamento) {
        this.nombre = nombre;
        this.color = color;
        this.anios = anios;
        this.vacunas = vacunas;
        this.temperamento = temperamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", anios='" + anios + '\'' +
                ", vacunas='" + vacunas + '\'' +
                ", temperamento='" + temperamento + '\'' +
                '}';
    }
    public void maullar(){
        System.out.println("que ganas de ser un gato puro  mimir y mauw mauw");
    }
    public void comer(){
        System.out.println("me toca sobre, me toca sobre");
    }
}
