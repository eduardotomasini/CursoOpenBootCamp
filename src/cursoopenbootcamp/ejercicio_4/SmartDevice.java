/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoopenbootcamp.ejercicio_4;

/**
 *
 * @author eduar
 */
public class SmartDevice {
    
   protected boolean wifi;
    
   protected boolean bluetoo;
   
   protected Integer peso;
   
   protected Double precio;

    public SmartDevice() {
    }

   
   
    public SmartDevice(boolean wifi, boolean bluetoo, Integer peso, Double precio) {
        this.wifi = wifi;
        this.bluetoo = bluetoo;
        this.peso = peso;
        this.precio = precio;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isBluetoo() {
        return bluetoo;
    }

    public void setBluetoo(boolean bluetoo) {
        this.bluetoo = bluetoo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" + "wifi=" + wifi + ", bluetoo=" + bluetoo + ", peso=" + peso + ", precio=" + precio + '}';
    }
   
   
    
    
}
