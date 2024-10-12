import java.util.Scanner;

public class CalculadoraIndiceFelicidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los factores de felicidad
        System.out.println("Ingrese su nivel de satisfacción con la vida (1-10): ");
        int satisfaccion = scanner.nextInt();

        System.out.println("Ingrese su nivel de estrés (1-10): ");
        int estres = scanner.nextInt();

        System.out.println("Ingrese su nivel de salud (1-10): ");
        int salud = scanner.nextInt();

        System.out.println("Ingrese su nivel de relaciones (1-10): ");
        int relaciones = scanner.nextInt();

        // Calcular el índice de felicidad
        double indiceFelicidad = (satisfaccion + (10 - estres) + salud + relaciones) / 4.0;

        // Imprimir el índice de felicidad
        System.out.println("Su índice de felicidad es: " + indiceFelicidad);

        scanner.close();

    }
}
