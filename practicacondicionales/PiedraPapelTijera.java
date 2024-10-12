import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elija (piedra, papel, tijera): ");
        String usuarioEleccion = scanner.nextLine().toLowerCase();

        int computadoraEleccion = random.nextInt(3);
        String computadoraMovimiento;

        if (computadoraEleccion == 0) {
            computadoraMovimiento = "piedra";
        } else if (computadoraEleccion == 1) {
            computadoraMovimiento = "papel";
        } else {
            computadoraMovimiento = "tijera";
        }

        System.out.println("Computadora eligió: " + computadoraMovimiento);

        if (usuarioEleccion.equals(computadoraMovimiento)) {
            System.out.println("¡Empate!");
        } else if ((usuarioEleccion.equals("piedra") && computadoraMovimiento.equals("tijera")) ||
                (usuarioEleccion.equals("papel") && computadoraMovimiento.equals("piedra")) ||
                (usuarioEleccion.equals("tijera") && computadoraMovimiento.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }

        scanner.close();
    }
}
