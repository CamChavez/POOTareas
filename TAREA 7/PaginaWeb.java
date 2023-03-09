public class PaginaWeb {
    private String tipo;
    private String nombre;
    private String url;
    private String contenido;
    private String fechaModif;

    public PaginaWeb() {
    }

    public PaginaWeb(String tipo, String nombre, String url, String contenido, String fechaModif) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.url = url;
        this.contenido = contenido;
        this.fechaModif = fechaModif;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaModif() {
        return fechaModif;
    }

    public void setFechaModif(String fechaModif) {
        this.fechaModif = fechaModif;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaModif='" + fechaModif + '\'' +
                '}';
    }
    public void visitar(){
        System.out.println("Te Damos la bienvenida a " + nombre );
        System.out.println("donde puedes encontrar " + contenido);
        System.out.println("¿Quieres ver el menú?");
        System.out.println("da click aqui " + url);
        System.out.println("Selecciona el que más sea de tu agrado");
    }
    public void cerrar(){
        System.out.println("Vuelva prontoooooo!");
    }
}
