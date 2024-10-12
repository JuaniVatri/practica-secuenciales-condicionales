import java.util.Scanner;

public class RecomendacionActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        String actividad;

        switch (estadoAnimo) {
            case "feliz":
                actividad = "Ir a bailar";
                break;
            case "triste":
                actividad = "Ver una película inspiradora";
                break;
            case "enérgico":
                actividad = "Hacer ejercicio";
                break;
            case "relajado":
                actividad = "Leer un libro";
                break;
            default:
                actividad = "Estado de ánimo desconocido. Por favor, ingrese feliz, triste, enérgico, o relajado.";
                break;
        }

        System.out.println("Actividad recomendada: " + actividad);

        scanner.close();
    }
}
