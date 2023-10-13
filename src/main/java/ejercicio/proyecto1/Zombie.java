/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import javax.swing.JPanel;

/**
 *
 * @author luisc
 */

// clase que hereda de personaje
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Zombie extends Personaje {
    private TipoZombie tipoZombie;

    public Zombie(TipoZombie tipoZombie, String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango, int daño, int posicion_x, int posicion_y) {
        super(Nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, tipo, rango, daño, posicion_x, posicion_y);
        this.tipoZombie = tipoZombie;
    }
    
    public JLabel getLabel() {
        ImageIcon icon = new ImageIcon(getClass().getResource(tipoZombie.getRutaImagen()));
        JLabel label = new JLabel(icon);
        return label;
    }
    
    @Override
    public String toString() {
        return "Zombie{" + "Nombre=" + getNombre() + ", tipo=" + tipoZombie.getNombre() + '}';
    }

}

    
    
    
    
    
    
    
    