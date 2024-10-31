
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CarlosXl
 */
public class Supermercado {
    
    

public class SupermercadoCompra {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos productos va a registrar? ");
        int cantidadProductos = scanner.nextInt();
        
        double costoTotal = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precio = scanner.nextDouble();
            
            System.out.print("Ingrese la cantidad del producto " + i + ": ");
            int cantidad = scanner.nextInt();
            
            costoTotal += precio * cantidad;
        }

        System.out.printf("El costo total de la compra es: $%.2f\n", costoTotal);

        scanner.close();
    
}
    
    
    }
    
    
}
    

