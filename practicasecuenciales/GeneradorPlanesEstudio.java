import java.util.Scanner;

public class GeneradorPlanesEstudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario cuántas horas al día puede estudiar
        System.out.println("Ingrese cuántas horas al día puede estudiar: ");
        int horasPorDia = scanner.nextInt();

        // Definir las materias
        String[] materias = { "Matemáticas", "Historia", "Lengua", "Ciencias", "Inglés" };
        int numMaterias = materias.length;

        // Calcular las horas de estudio por materia y por día
        int horasPorMateria = horasPorDia / numMaterias;

        // Generar el plan de estudio semanal
        String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

        System.out.println("Plan de Estudio Semanal:");
        for (String dia : diasSemana) {
            System.out.println(dia + ":");
            for (String materia : materias) {
                System.out.println("  - " + materia + ": " + horasPorMateria + " horas");
            }
        }

        scanner.close();
    }
}
