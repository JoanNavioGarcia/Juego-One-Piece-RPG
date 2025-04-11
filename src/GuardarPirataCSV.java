import java.io.*;
import java.util.Scanner;

public class GuardarPirataCSV {
    public static void guardarPiratasEnCSV() {

        // Definir input
        Scanner input = new Scanner(System.in);
        //Variable para que contiene el archivo CSV
        String CSVPirata = "PersonajesPirata.csv";

        // Abrir el archivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(CSVPirata))) {
            System.out.println("Introduce el nombre del personaje: ");
            String NombrePersonaje = input.nextLine();

            // Guardar en variable el resultado de la Funcion de CorrejirErrorString
            String CorreccionString = CorrejirErrorString(input, NombrePersonaje);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSVPirata, true))) {
                writer.append(CorreccionString);
                writer.newLine();  // Agregar un salto de línea
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static String CorrejirErrorString(Scanner input, String NombrePersonaje){
        while(true){
            if (!NombrePersonaje.matches("[a-zA-Z ]+")){
                System.out.println("Error: Debes introducir solo letras.");
                NombrePersonaje = input.nextLine();
            } else{
                return NombrePersonaje;
            }
        }
    }

}
