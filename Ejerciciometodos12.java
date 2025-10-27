import java.util.Scanner;

public class Ejerciciometodos12 {
    
    public static void cuadradovacio(int lado) {
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println(); 

        for (int j = 0; j < lado - 2; j++) {
            System.out.print("*"); 
            for (int k = 0; k < lado - 2; k++) {
                System.out.print(" "); 
            }
            System.out.println("*"); 
        }
        if (lado > 1) {
            for (int i = 0; i < lado; i++) {
                System.out.print("*");
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
        cuadradovacio(lado);
        
    }
}