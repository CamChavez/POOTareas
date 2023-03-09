public class Giroscopio {
    private String que;
    private String para;
    private String usos;
    private double precio;

    public Giroscopio() {
    }

    public Giroscopio(String que, String para, String usos, double precio) {
        this.que = que;
        this.para = para;
        this.usos = usos;
        this.precio = precio;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getUsos() {
        return usos;
    }

    public void setUsos(String usos) {
        this.usos = usos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "que='" + que + '\'' +
                ", para='" + para + '\'' +
                ", usos='" + usos + '\'' +
                ", precio=" + precio +
                '}';
    }
    public void definir(){
        System.out.println("nunca había escuchado hablar de este artefacto");
    }
    public void aparato(){
        System.out.println("es bueno conocer nunca se sabe ");
    }
}
