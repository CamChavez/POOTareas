public class Motacicleta implements Vehiculo{
    private  int centimetrosCubicos;
    private  String marca;

    public Motacicleta() {
    }

    public Motacicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motacicleta{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void  hacerCaballito(){
        System.out.println("Haciendo el truco  del caballito para romperme la mollera");
    }

    @Override
    public boolean encender() {
        System.out.println("Encenciendo la moto " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la moto " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la moto de " + this.centimetrosCubicos + " cm3");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la moto " + this.marca + "de " + this.centimetrosCubicos + " centimetros cubicos");

    }
}
