import java.util.Scanner;

public class Ejerciciometodo2 {
    
    public static void triangulo(int lado) {
        if (lado <= 0) {
            System.out.println("El lado debe ser un número positivo.");
            return;
        }
        for (int fila = 1; fila <= lado; fila++) {
            for (int espacio = lado - fila; espacio > 0; espacio--) {
                System.out.print(" ");
            }
            for (int estrella = 1; estrella <= (2 * fila - 1); estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int lado;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño del lado del triángulo:");
            lado = leer.nextInt();
        }
        triangulo(lado);
        
    }
}
