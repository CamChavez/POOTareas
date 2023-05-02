import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);

        miCaja.add(0, "MORAT");
        miCaja.add(1, "CANELA");
        miCaja.add(2, "LUNA");
        miCaja.add(3, "LIBRO");
        System.out.println(miCaja);

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("COMIDA");
        System.out.println("");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(3,new Comida("pera", false));
        System.out.println(cajaComida);
        System.out.println(cajaComida.get(3));

        System.out.println("-------");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Manzana", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(6));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("TOMATE", false));
        comidas2.add(new Comida("HAMBURGUESA", true));
        comidas2.add(new Comida("ZANAHORIA", false));
        comidas2.add(new Comida("PIZZA", true));
        comidas2.add(new Comida("CAÑA", false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Fresa", false));
        comidas.add(4, new Comida("Naranja", false));
        System.out.println(comidas2);
        System.out.println("------FINAL------");
        for(Comida comida : comidas2);{
            System.out.println(comidas);
        }
    }
}