package ActividadExtra1;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("División de 10 entre un número digitado por el usuario");
        System.out.println("Digite el numero");


        try{
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("DIVISIÓN " + (a/b));
        } catch (ArithmeticException e){
            System.out.println("Mo se puede dividir entre 0");
        } catch (NumberFormatException nfe){
            System.out.println("No capturaste un número");
        } finally {
            System.out.println("Siempre se ejecuta...");
        }
        System.out.println("Fin del programa");
    }
}