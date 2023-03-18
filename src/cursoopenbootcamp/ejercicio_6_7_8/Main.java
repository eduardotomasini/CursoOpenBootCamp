/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoopenbootcamp.ejercicio_6_7_8;

import java.io.IOException;

/**
 *
 * @author eduar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Metodos metodos = new Metodos();
        System.out.println("hola");
        //metodos.recorrerArrayUnid();
        //metodos.recorrerArrayBidi();
        //metodos.recorrerVector();
        //metodos.recorrerArrayList();
        //metodos.recorrerArrayListInt();

        try {

            metodos.verificarExcepcion();

        } catch (Exception e) {

            System.out.println("Esto no puede hacerse, arrojo la Throw Exception");
        }

    }

}
