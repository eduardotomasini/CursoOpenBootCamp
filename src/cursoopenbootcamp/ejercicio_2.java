/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoopenbootcamp;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        double precio;
        double iva = 1.21;
        double precioConIva;
        
        System.out.println("ingrese el precio del producto: ");
        precio = leer.nextDouble();
        
        precioConIva= precio*iva;
        
        System.out.println("el precio del producto mas iva es: " + precioConIva);
        
        
        
    }
    
}
