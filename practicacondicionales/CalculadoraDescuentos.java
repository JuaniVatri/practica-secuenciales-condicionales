import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.nextLine().toLowerCase();

        double descuento;

        switch (categoria) {
            case "estudiante":
                descuento = 0.10;
                break;
            case "adulto":
                descuento = 0.05;
                break;
            case "jubilado":
                descuento = 0.15;
                break;
            default:
                descuento = 0.0;
                System.out.println("Categoría desconocida. No se aplicará descuento.");
                break;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final después del descuento es: $" + precioFinal);

        scanner.close();
    }
}
