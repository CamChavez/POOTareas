public class Pais {
    private String nombre;
    private String capital;
    private double habitantes;
    private String ciudad;
    private String presidente;
    private String idioma;

    public Pais() {
    }

    public Pais(String nombre, String capital, double habitantes, String ciudad, String presidente, String idioma) {
        this.nombre = nombre;
        this.capital = capital;
        this.habitantes = habitantes;
        this.ciudad = ciudad;
        this.presidente = presidente;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(double habitantes) {
        this.habitantes = habitantes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", habitantes=" + habitantes +
                ", ciudad='" + ciudad + '\'' +
                ", presidente='" + presidente + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }

    public void temperatura() {
        System.out.println("Aqui en " + nombre + " hace mucho calor");
    }
    public void personas(){
        System.out.println("valor aproximado de personas habitando " + nombre + " : " + habitantes + " millones");
    }
}
