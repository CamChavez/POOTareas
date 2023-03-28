public class MaquinaDeCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaDeCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public MaquinaDeCafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    public boolean Americano(){
        if(this.agua >= 180 && this.cafe >= 15 && this.vasos > 0){
            this.agua -= 180;
            this.cafe-=15;
            this.vasos --;
            System.out.println("Preparando tu americano");
        } else {
            System.out.println("suficientes tazas");
        }
        return true;
    }
    public boolean Expresso(){
        if(this.agua >= 120 && this.cafe >= 20 && this.vasos > 0){
            this.agua -=120;
            this.cafe-= 20;
            this.vasos --;
            System.out.println("Preparando el expresso");
        } else {
            System.out.println("No es posible hacer mas expressos");
        }
        return true;
    }
    public boolean cap(){
        if(this.agua >=100 && this.crema  >=70 && this.cafe >= 14 &&this.vasos>0){
            this.agua -=100;
            this.crema -=70;
            this.cafe -=14;
            this.vasos --;
            System.out.println("Sirviendo el capucchino");
        } else {
            System.out.println("No hay mas capucchino");
        }
        return true;
    }
    public boolean Existencias(){
        System.out.println("Hay esta cantidad de agua: " + agua + "ml");
        System.out.println("Hay esta cantidad de café: " + cafe + "gr");
        System.out.println("Hay esta cantidad de crema: " + crema + "gr");
        System.out.println("Hay esta cantidad de vasos: " + vasos );

        return true;
    }
}