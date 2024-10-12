import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir fecha de nacimiento al usuario
        System.out.print("Ingresa tu fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        // Extraer día y mes de la fecha de nacimiento
        int dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
        int mes = Integer.parseInt(fechaNacimiento.substring(3, 5));

        String signoZodiaco = "";

        // Determinar el signo del zodiaco
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signoZodiaco = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signoZodiaco = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signoZodiaco = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signoZodiaco = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signoZodiaco = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signoZodiaco = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signoZodiaco = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signoZodiaco = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signoZodiaco = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signoZodiaco = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signoZodiaco = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signoZodiaco = "Capricornio";
        } else {
            signoZodiaco = "Fecha de nacimiento no válida.";
        }

        // Imprimir el signo del zodiaco
        System.out.println("Tu signo del zodiaco es: " + signoZodiaco);
    }
}