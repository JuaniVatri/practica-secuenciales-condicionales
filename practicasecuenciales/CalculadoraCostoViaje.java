import java.util.Scanner;

public class CalculadoraCostoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la distancia del viaje en kilómetros
        System.out.println("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Pedir al usuario el consumo de combustible del vehículo en litros por
        // kilómetro
        System.out.println("Ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        double consumoPorKilometro = scanner.nextDouble();

        // Pedir al usuario el precio del combustible por litro
        System.out.println("Ingrese el precio del combustible por litro: ");
        double precioPorLitro = scanner.nextDouble();

        // Calcular el costo total del viaje
        double costoTotal = distancia * consumoPorKilometro * precioPorLitro;

        // Imprimir el costo total del viaje
        System.out.println("El costo total del viaje es: $" + costoTotal);

        scanner.close();
    }
}
