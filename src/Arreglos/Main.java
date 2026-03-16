package Arreglos;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--- Sistema de Gestión de Notas ---");
        System.out.print("Ingrese la cantidad de notas a calcular: ");
        int cantidad = teclado.nextInt();

        // Creamos el arreglo con el tamaño definido por el usuario
        double[] notas = new double[cantidad];
        double suma = 0;

        // Llenado del arreglo
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            suma += notas[i];
        }

        // Cálculos
        double promedio = suma / cantidad;
        
        System.out.println("\n--- Resultados ---");
        System.out.printf("El promedio final es: %.2f\n", promedio);

        // Lógica de aprobación (ajusta el 7 según tu universidad)
        if (promedio >= 7) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        teclado.close();
    }
}