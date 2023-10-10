/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author masis
 */
public class Defensa extends Personaje{
    private int posicion_x;
    private int posicion_y;
    private TipoZombie tipoDefensa;
    
    
    public Defensa(String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango) {
        super(Nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, tipo, rango);
        this.tipoDefensa = tipoDefensa;
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
    }
    
        public JLabel getLabel() {
        ImageIcon icon = new ImageIcon(getClass().getResource(tipoDefensa.getRutaImagen()));
        JLabel label = new JLabel(icon);
        return label;
    }
    
    @Override
    public String toString() {
        return "Defensa{" + "Nombre=" + getNombre() + ", tipo=" + tipoDefensa.getNombre() + '}';
    }

}

    
    
    
    
    
