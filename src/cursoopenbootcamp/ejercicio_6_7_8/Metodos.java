
package cursoopenbootcamp.ejercicio_6_7_8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String cadena;

    public Metodos() {
    }

    void invertirCadena() {
        System.out.println("ingrese cadena");
        cadena = leer.next();
        for (int i = cadena.length() - 1; i >= 0; i--) {

            char letra = cadena.charAt(i);

            System.out.print(letra);
        }
    }

    void recorrerArrayUnid() {

        String letras[] = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

    }

    void recorrerArrayBidi() {

//        int arrayNumeros[][] = new int [2][3];
//        
//        arrayNumeros[0][0]=00;
//        arrayNumeros[0][1]=01;
//        arrayNumeros[0][2]=02;
//        arrayNumeros[1][0]=10;
//        arrayNumeros[1][1]=11;
//        arrayNumeros[1][2]=12;
        int arrayNumeros[][] = {
            {11, 22, 33, 44},
            {55, 66, 77, 88}
        };

        for (int i = 0; i < arrayNumeros.length; i++) {

            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.println("fila " + i + " columna " + j + "\nvalor es " + arrayNumeros[i][j]);
            }
        }
    }

    void recorrerVector() {
        Vector<Integer> vector = new Vector();
//        Vector<Integer> vector = new Vector(4, 15);

        vector.add(11);
        vector.add(22);
        vector.add(33);
        vector.add(44);
        vector.add(55);

        System.out.println("vector " + vector);

        vector.remove(2);
        vector.remove(3);

        System.out.println("vector " + vector);

        System.out.println("vector tamaño " + vector.size() + " capacidad " + vector.capacity());
        // trimToSize, reduce el tamaño del vector
        vector.trimToSize();
        System.out.println("vector tamaño " + vector.size() + " capacidad " + vector.capacity());

        // deventaja de un Ventor de 1000 , es que se produce dos array uno de mil y uno de dos mil
        // lo que produce un gran costo computacional
    }

    void recorrerArrayList() {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Juan");
        lista.add("Pablo");
        lista.add("Martin");
        lista.add("German");

        System.out.println("lista: " + lista);

//    lista.remove("Pablo");
//    lista.remove(2);
        for (String aux : lista) {
            System.out.println(aux);
        }

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (String string : array) {
            System.out.println("nuevo array " + string);
        }

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

        for (String string : listaEnlazada) {
            System.out.println("Lista enlazada " + string);
        }

    }

    void recorrerArrayListInt() {

        ArrayList<Integer> listaNum = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            listaNum.add(leer.nextInt());
        }

        for (Integer numeros : listaNum) {

            System.out.println("numros: " + numeros);
        }

        for (int i = 0; i < listaNum.size(); i++) {

            if (listaNum.get(i) % 2 == 1) {
                System.out.println("impares son " + listaNum.get(i));
            }

        }

    }

    void verificarExcepcion() throws ArithmeticException, IOException {

        try {
            int num = 4 / 0;
            System.out.println("div" + num);
            

        } catch (ArithmeticException e) {
            throw new IOException();
            
            //System.out.println("excepcion es: " + e.getMessage());
        } finally {
            System.out.println("demo de codigo");
        }

    }

    
//    public static class CopiarFicheros {
//
//            public static void main(String[] args) {
//
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Introduce el fichero de origen: ");
//                String fileIn = scanner.nextLine();
//                System.out.println("Introduce el fichero de destino: ");
//                String fileOut = scanner.nextLine();
//                copiar(fileIn, fileOut);
//            }
//
//            private static void copiar(String fileIn, String fileOut) {
//                try {
//                    InputStream in = new FileInputStream(fileIn);
//                    byte[] datos = in.readAllBytes();
//                    in.close();
//
//                    PrintStream out = new PrintStream(fileOut);
//                    out.write(datos);
//                    out.close();
//                } catch (Exception e) {
//                    System.out.println("Excepcion: " + e.getMessage());
//                }
//            }
//
//        }
    
    
}



//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
//
//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
//
//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
//
//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
//
//Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
//
//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
//
//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
//
//Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
//
// Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 

// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
//
// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, 

// LinkedList o array.