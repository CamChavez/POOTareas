public class Main {
    public static void main(String[] args) {
        MaquinaDeCafe mc  = new MaquinaDeCafe();
        mc.Americano();
        mc.Expresso();
        mc.cap();
        mc.Existencias();

        System.out.println("Siguiente tanda");
        System.out.println("");
        System.out.println("");

        mc.Americano();
        mc.Expresso();
        mc.Americano();
        mc.Expresso();
        mc.Americano();
        mc.Expresso();
        mc.Americano();
        mc.Expresso();
        mc.Americano();
        mc.Expresso();
        mc.cap();
        mc.cap();
        mc.cap();
        mc.cap();
        mc.cap();
        mc.cap();
        mc.cap();
        mc.cap();
        System.out.println("");
        System.out.println("");
        mc.Existencias();

    }
}