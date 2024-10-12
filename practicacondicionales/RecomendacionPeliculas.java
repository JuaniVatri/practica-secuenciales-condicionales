import java.util.Scanner;

public class RecomendacionPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su género de película favorito (acción, comedia, drama, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();
        
        String pelicula;
        
        switch (genero) {
            case "acción":
                pelicula = "Mad Max: Fury Road";
                break;
            case "comedia":
                pelicula = "Superbad";
                break;
            case "drama":
                pelicula = "The Pursuit of Happyness";
                break;
            case "ciencia ficción":
                pelicula = "Inception";
                break;
            default:
                pelicula = "Género desconocido. Por favor, ingrese acción, comedia, drama, o ciencia ficción.";
                break;
        }
        
        System.out.println("Película recomendada: " + pelicula);
        
        scanner.close();
    }
}