import java.util.Scanner;

public class CaloriasQuemadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir peso del usuario
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Pedir la duración del ejercicio en minutos
        System.out.print("Ingresa la duración del ejercicio en minutos: ");
        int minutos = scanner.nextInt();

        // Pedir el tipo de ejercicio
        System.out.print("Ingresa el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        scanner.nextLine(); // Limpiar el buffer
        String ejercicio = scanner.nextLine();

        double caloriasPorMinuto;

        // Determinar las calorías quemadas por minuto según el tipo de ejercicio
        switch (ejercicio.toLowerCase()) {
            case "correr":
                caloriasPorMinuto = 10;
                break;
            case "nadar":
                caloriasPorMinuto = 8;
                break;
            case "andar en bicicleta":
                caloriasPorMinuto = 6;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                return;
        }

        // Calcular las calorías quemadas
        double caloriasQuemadas = caloriasPorMinuto * minutos;

        // Imprimir las calorías quemadas
        System.out.println("Has quemado " + caloriasQuemadas + " calorías.");

        scanner.close();
    }
}
