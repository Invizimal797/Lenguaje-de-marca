import java.util.Scanner;

public class Ejerciciometodo22 {
    
    public static void triangulovacio(int lado) {
        for (int fila = 1; fila <= lado; fila++) {
            for (int espacio = lado - fila; espacio > 0; espacio--) {
                System.out.print(" ");
            }
            for (int estrella = 1; estrella <= (2 * fila - 1); estrella++) {
                if (fila == lado || estrella == 1 || estrella == (2 * fila - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
        triangulovacio(lado);
        
    }
}
