/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoopenbootcamp;

/**
 *
 * @author eduar
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte num1 = 123;
        short num2 = 12345;
        int num3 = 1234567890;
        long num4 = 1234567890;

        float num5 = 23.12f;
        double num6 = 12.30d;

        char letra = 'a';

        boolean verdadero = true;
        boolean falso = false;

        String cadena = "hola soy Juan";

        Integer numInt = null;
        Long numLong = 54L;
        Double numDou = 93.43D;

        System.out.println("Ejercicio 1 de Curso Java Basico"+"\n");
        System.out.println("un byte: " + num1 + "\n"
                + "un short: " + num2 + "\n"
                + "un int: " + num3 + "\n"
                + "un long: " + num4 + "\n"
                + "un float: " + num5 + "\n"
                + "un double: " + num6 + "\n"
                + "un char: " + letra + "\n"
                + "un booelan verdadero: " + verdadero + "\n"
                + "un boolean falso: " + false + "\n"
                + "un String: " + cadena + "\n"
                + "un Integer: " + numInt + "\n"
                + "un Long: " + numLong + "\n"
                + "un Double: " + numDou + "\n");
    }

}

//Para este primer ejercicio tendréis que realizar lo siguiente:
//
//Crea un proyecto de Java desde 0
//
//Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
//Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
//Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
