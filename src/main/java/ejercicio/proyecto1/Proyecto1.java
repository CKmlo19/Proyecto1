/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio.proyecto1;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author luisc
 */
public class Proyecto1 {

    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
        v1.getContentPane().setBackground(Color.white);
        Personaje p1 = new Personaje("Zombie", 100, 2, 3, 1, 0, "de contacto", 100);
        
    }
}
