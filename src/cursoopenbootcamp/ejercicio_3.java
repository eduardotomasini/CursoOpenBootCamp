package cursoopenbootcamp;

import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] nombres = {"Pablo", "Pedro", "Matias", "Juan"};
        //String [] nombres = new String[5];

//        for (int i = 0; i < nombres.length ; i++) {
//        System.out.println("ingrese un nombre");
//            nombres[i] = leer.next();
//        }
        System.out.println("Los nombres son:");
        for (String aux : nombres) {
            System.out.println(aux);
        }

    }

}


//En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
//
//Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo: