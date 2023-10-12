/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

/**
 *
 * @author luisc
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Listener_Tablero extends MouseAdapter {
    private int fila;
    private int columna;
    private Ventana refVentana;

    public Listener_Tablero(int fila, int columna, Ventana refVentana) {
        this.fila = fila;
        this.columna = columna;
        this.refVentana = refVentana;
    }

    public Listener_Tablero(JLabel label, Ventana refVentana) {
        this.refVentana = refVentana;
    }
     
    @Override
    public void mouseClicked(MouseEvent e) {
        if(refVentana.isEnable()){ // si el enable es true
            refVentana.addDefensa(refVentana.getLabel_seleccionado(), fila, columna);
            refVentana.getPnlPanelJuego().repaint();
            refVentana.getPnlDefensas().repaint();
        }else{
        
        }
    }
    
    
    
    
    // getters
    public int getFila(){
        return fila;
    
    }
    public int getColumna() {
        return columna;
    }
    
    
}

