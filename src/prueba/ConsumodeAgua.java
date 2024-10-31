/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class ConsumodeAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] consumoMensual = new int[12];  // Array para almacenar los 12 consumos mensuales
        int consumoTotal = 0;  // Variable para acumular el consumo total

        // Solicitar el consumo mensual y acumular el consumo total
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el consumo de agua en litros para el mes " + (i + 1) + ": ");
            consumoMensual[i] = scanner.nextInt();
            consumoTotal += consumoMensual[i];  // Sumar el consumo mensual al total
        }

        // Calcular el promedio mensual
        double promedioMensual = (double) consumoTotal / 12;

        // Mostrar el resultado
        System.out.println("\nConsumo total anual: " + consumoTotal + " litros");
        System.out.println("Promedio mensual de consumo: " + promedioMensual + " litros");

        scanner.close();
    }
}







        
        
    }
    
}
