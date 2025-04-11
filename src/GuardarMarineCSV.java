import Bando.Marine;
import java.util.List;
import java.io.*;

public class GuardarMarineCSV {
    public static void GuardarMarineEnCSV (List<Marine> marines, String ArchivoMarines){
        try (FileWriter writer = new FileWriter(ArchivoMarines)){
            writer.append("Nombre,Atributo,Ataque,Salud,Defensa,Velocidad,Recompensa,Rango\n");

        }catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
