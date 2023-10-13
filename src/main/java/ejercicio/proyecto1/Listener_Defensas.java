/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author luisc
 */
public class Listener_Defensas extends MouseAdapter{
    private Ventana refVentana;
    private JLabel label_defensa;
    boolean enable;

    public Listener_Defensas(Ventana refVentana, JLabel label_defensas) {
        this.refVentana = refVentana;
        this.label_defensa = label_defensas;
        enable = refVentana.isEnable();
    }

   
    
    @Override
    public void mouseClicked(MouseEvent e) {
        enable = !enable;
        refVentana.setEnable(enable); // al darle click coloca en true o false el enable para indicar si se selecciono el contenedor
        refVentana.getLblSeleccion_Defensa().setVisible(enable);
        if(enable){ // si es true indica que se selecciono, se añade al la variable temporal
            refVentana.setLabel_seleccionado(label_defensa); // coloca el label en una variable temporal
        }
        else{
        }
        
    } 



    
    
    
    
    
    
    
}
