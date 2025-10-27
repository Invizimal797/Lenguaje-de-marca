import java.util.Scanner;

public class Ejerciciometodos {
    
    public static void cuadrado(int lado) {
        if (lado <= 0) {
            System.out.println("El lado debe ser un número positivo.");
            return;
        }
        for (int fila = 0; fila < lado; fila++) {
            for (int columna = 0; columna < lado; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int lado;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño del lado del cuadrado:");
            lado = leer.nextInt();
        }
        cuadrado(lado);
        
    }
}