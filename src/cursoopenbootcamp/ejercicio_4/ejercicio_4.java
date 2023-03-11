
package cursoopenbootcamp.ejercicio_4;

import cursoopenbootcamp.ejercicio_4.herencia.SmartPhone;
import cursoopenbootcamp.ejercicio_4.herencia.SmartWatch;


public class ejercicio_4 {


    public static void main(String[] args) {

        SmartDevice mix = new SmartDevice(true, true, Integer.SIZE, Double.NaN);
        
        SmartPhone celu = new SmartPhone(5, 128, true, true, 175, 36644.2);
   
        
        SmartWatch reloj = new SmartWatch(true, true, 8500, 59, true, true, 201, 203588.3);
        
        
        System.out.println(mix);
         
        System.out.println(celu);
        
        System.out.println(reloj);
        
        
        
    }
    
}

//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//Crear constructor vacío y con todos los parámetros para cada clase.
//
//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.