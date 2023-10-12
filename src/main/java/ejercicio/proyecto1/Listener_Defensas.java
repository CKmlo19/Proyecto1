/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author luisc
 */
public class Listener_Defensas extends MouseAdapter{
    private Ventana refVentana;
    boolean enable = true;

    public Listener_Defensas(Ventana refVentana) {
        this.refVentana = refVentana;
    }
    public void mouseClicked(MouseEvent e) {
                // Acciones a realizar cuando se hace clic en label1
                if(enable){
                    enable = false;
                    System.out.println("Voila");
                    refVentana.getPnlDefensas().setEnabled(enable);
                }
            }
    
}
