
package cursoopenbootcamp;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ejercicio_numeros {

    public static void main(String[] args) {
        
        int num1 = Integer.MAX_VALUE;

        byte num2 = Byte.MAX_VALUE;

        short num3 = Short.MAX_VALUE;

        long num4 = Long.MAX_VALUE;
        
        double num5 = Double.MAX_VALUE;
        
        float num6 = Float.MAX_VALUE;

        System.out.println("int "+num1 + 
                "\nbyte " + num2 +
                "\nshort "+ num3 + 
                "\nlong " + num4+
                "\ndouble " + num5+
                "\nfloat " + num6);
    }
  
}

//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//Crear constructor vacío y con todos los parámetros para cada clase.
//
//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.