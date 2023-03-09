public class Balón {
    private String tamanio;
    private String color;
    private String dureza;

    public Balón() {
    }

    public Balón(String tamanio, String color, String dureza) {
        this.tamanio = tamanio;
        this.color = color;
        this.dureza = dureza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    @Override
    public String toString() {
        return "Balón{" +
                "tamanio='" + tamanio + '\'' +
                ", color='" + color + '\'' +
                ", dureza=" + dureza +
                '}';
    }
    public void ver(){
        System.out.println("esta pelota es de color " + color);
        System.out.println("me gusta como bota porque está " + dureza);
    }
    public void cambio(){
        System.out.println("está es muy " + tamanio + " quiero otra");
    }
}
