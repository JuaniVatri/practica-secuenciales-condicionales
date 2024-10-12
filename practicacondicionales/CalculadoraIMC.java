import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String recomendacion;

        if (imc < 18.5) {
            recomendacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            recomendacion = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            recomendacion = "Sobrepeso";
        } else {
            recomendacion = "Obesidad";
        }

        System.out.println("Su IMC es: " + imc);
        System.out.println("Recomendación: " + recomendacion);

        scanner.close();
    }
}