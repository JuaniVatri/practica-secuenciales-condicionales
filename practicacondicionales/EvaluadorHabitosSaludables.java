import java.util.Scanner;

public class EvaluadorHabitosSaludables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuántas horas al día duerme: ");
        int horasDormir = scanner.nextInt();

        System.out.println("Ingrese cuántas horas al día hace ejercicio: ");
        int horasEjercicio = scanner.nextInt();

        System.out.println("Ingrese cuántas comidas saludables consume al día: ");
        int comidasSaludables = scanner.nextInt();

        String evaluacion;

        if (horasDormir >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            evaluacion = "¡Excelentes hábitos saludables!";
        } else if ((horasDormir >= 7 && horasEjercicio >= 1) || (horasDormir >= 7 && comidasSaludables >= 3)
                || (horasEjercicio >= 1 && comidasSaludables >= 3)) {
            evaluacion = "Buenos hábitos saludables, pero hay margen de mejora.";
        } else {
            evaluacion = "Necesita mejorar sus hábitos saludables.";
        }

        System.out.println("Evaluación: " + evaluacion);

        scanner.close();
    }
}