/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoopenbootcamp.ejercicio_4.herencia;

import cursoopenbootcamp.ejercicio_4.SmartDevice;

/**
 *
 * @author eduar
 */
public class SmartWatch extends SmartDevice{

    boolean running;
    
    boolean conBotones;
    
    int cuentaPasos;
    
    int frecCard;

    
    public SmartWatch() {
    }

    public SmartWatch(boolean running, boolean conBotones, int cuentaPasos, int frecCard, boolean wifi, boolean bluetoo, Integer peso, Double precio) {
        super(wifi, bluetoo, peso, precio);
        this.running = running;
        this.conBotones = conBotones;
        this.cuentaPasos = cuentaPasos;
        this.frecCard = frecCard;
    }
    
    

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isConBotones() {
        return conBotones;
    }

    public void setConBotones(boolean conBotones) {
        this.conBotones = conBotones;
    }

    public int getCuentaPasos() {
        return cuentaPasos;
    }

    public void setCuentaPasos(int cuentaPasos) {
        this.cuentaPasos = cuentaPasos;
    }

    public int getFrecCard() {
        return frecCard;
    }

    public void setFrecCard(int frecCard) {
        this.frecCard = frecCard;
    }

    @Override
    public String toString() {
        return "SmartWatch{" + "wifi=" + wifi + ", bluetoo=" + bluetoo + ", peso=" + peso + ", precio=" + precio + ", running=" + running + ", conBotones=" + conBotones + ", cuentaPasos=" + cuentaPasos + ", frecCard=" + frecCard + '}';
    }

    
    

 
   
   
   
   
    
}
