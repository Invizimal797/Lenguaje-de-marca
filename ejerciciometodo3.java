import java.util.Scanner;

public class ejerciciometodo3 {
    
    public static void opciones(int opciones) {
        while (opciones != 5) {

        Scanner leer = new Scanner(System.in);
            System.out.println("Seleccione una opción:");
            System.out.println("1. Cuadrado lleno");
            System.out.println("2. Cuadrado vacío");
            System.out.println("3. Triángulo lleno");
            System.out.println("4. Triángulo vacío");
            System.out.println("5. Salir");
            opciones = leer.nextInt();
        
        if (opciones <= 0 || opciones > 5) {
            System.out.println("Opción no válida.");
            opciones = 0;
        }else if (opciones == 1) {
            Ejerciciometodos.cuadrado(5);
            opciones = 0;
        }else if (opciones == 2) {
            Ejerciciometodos12.cuadradovacio(5);
            opciones = 0;
        }else if (opciones == 3) {
            Ejerciciometodo2.triangulo(5);
            opciones = 0;
        }else if (opciones == 4) {
            Ejerciciometodo22.triangulovacio(5);
            opciones = 0;
        }
    }
    }
    
    public static void main(String[] args) {
        int opciones = 0;
        opciones(opciones);   
    }
}