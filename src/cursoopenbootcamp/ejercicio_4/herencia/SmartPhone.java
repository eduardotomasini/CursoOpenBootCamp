
package cursoopenbootcamp.ejercicio_4.herencia;

import cursoopenbootcamp.ejercicio_4.SmartDevice;

/**
 *
 * @author eduar
 */
public class SmartPhone extends SmartDevice {
    
    
    int pantalla;
    int almacenamiento;

    public SmartPhone() {
    }

    public SmartPhone(int pantalla, int almacenamiento, boolean wifi, boolean bluetoo, Integer peso, Double precio) {
        super(wifi, bluetoo, peso, precio);
        this.pantalla = pantalla;
        this.almacenamiento = almacenamiento;
    }
    
  


    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "wifi=" + wifi + ", bluetoo=" + bluetoo + ", peso=" + peso + ", precio=" + precio + ", pantalla=" + pantalla + ", almacenamiento=" + almacenamiento +  '}';
    }
 
    
    
   
    
}
