import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("-------------------------------------------\n" +
                    "|              Menu Pincipal              |\n" +
                    "-------------------------------------------\n\n" +
                    "1) Jugar Partida\n" +
                    "2) Tutorial\n" +
                    "3) Salir del Programa\n\n" +
                    "Opcion: ");

            // Comprobar si el input es un numero.
            if (!input.hasNextInt()){
                System.out.println("\n" + "--------------------------------------------------\n" +"| Error de Programa: Debes introducir un numero. |\n" + "--------------------------------------------------\n");
                input.next();
                continue;
                }

            int opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Funciona");
                    break;
                case 2:
                    System.out.println("Funciona");
                    break;
                case 3:
                    System.out.println("Funciona");
                    break;
                default:
                    System.out.println("\n" + "--------------------------------------------\n" + "| Error de Programa: Numero fuera de rango |\n" + "--------------------------------------------\n");
            }
        }
    }
}
