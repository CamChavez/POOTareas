package ActividadExtra2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leer(String ruta) {
        try { //primera forma
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line = ""; //segunda forma
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void metodoUno(String ruta) {
        this.metodoDos(ruta);
    }

    public void metodoDos(String ruta)  {
        this.leer(ruta);
    }
}