import java.util.Scanner;

public class GeneradorRutinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.nextLine().toLowerCase();

        String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        String[] ejercicios;

        switch (nivel) {
            case "principiante":
                ejercicios = new String[] { "Caminata 30 min", "Descanso", "Yoga 30 min", "Caminata 30 min", "Descanso",
                        "Bicicleta 30 min", "Descanso" };
                break;
            case "intermedio":
                ejercicios = new String[] { "Correr 40 min", "Entrenamiento de fuerza 30 min", "Yoga 40 min",
                        "Correr 40 min", "Entrenamiento de fuerza 30 min", "Bicicleta 40 min", "Descanso" };
                break;
            case "avanzado":
                ejercicios = new String[] { "Correr 60 min", "Entrenamiento de fuerza 45 min", "Yoga 60 min",
                        "HIIT 45 min", "Entrenamiento de fuerza 45 min", "Bicicleta 60 min", "Descanso" };
                break;
            default:
                ejercicios = new String[] {
                        "Nivel desconocido. Por favor, ingrese principiante, intermedio, o avanzado." };
                break;
        }

        System.out.println("Rutina de ejercicio semanal:");
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i] + ": " + ejercicios[i]);
        }

    }
}