import java.util.Scanner;

public class RecomendacionLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su género de libro favorito (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        String libro;

        switch (genero) {
            case "fantasía":
                libro = "El Hobbit de J.R.R. Tolkien";
                break;
            case "misterio":
                libro = "El Código Da Vinci de Dan Brown";
                break;
            case "romance":
                libro = "Orgullo y Prejuicio de Jane Austen";
                break;
            case "ciencia ficción":
                libro = "Dune de Frank Herbert";
                break;
            default:
                libro = "Género desconocido. Por favor, ingrese fantasía, misterio, romance, o ciencia ficción.";
                break;
        }

        System.out.println("Libro recomendado: " + libro);

        scanner.close();
    }
}
