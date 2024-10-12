
import java.util.Scanner;

public class GeneradorListasReproduccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        String[] canciones;

        switch (estadoAnimo) {
            case "feliz":
                canciones = new String[] { "Here Comes the Sun - The Beatles", "Happy - Pharrell Williams",
                        "Walking on Sunshine - Katrina and the Waves" };
                break;
            case "triste":
                canciones = new String[] { "Someone Like You - Adele", "The Scientist - Coldplay",
                        "Yesterday - The Beatles" };
                break;
            case "enérgico":
                canciones = new String[] { "Eye of the Tiger - Survivor", "Can't Stop the Feeling - Justin Timberlake",
                        "Uptown Funk - Mark Ronson ft. Bruno Mars" };
                break;
            case "relajado":
                canciones = new String[] { "Weightless - Marconi Union", "Breathe - Telepopmusik",
                        "Clair de Lune - Claude Debussy" };
                break;
            default:
                canciones = new String[] {
                        "Estado de ánimo desconocido. Por favor, ingrese feliz, triste, enérgico, o relajado." };
                break;
        }

        System.out.println("Lista de reproducción sugerida:");
        for (String cancion : canciones) {
            System.out.println(cancion);
        }

        scanner.close();
    }

}
