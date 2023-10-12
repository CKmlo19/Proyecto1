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

public class Listener_Tablero extends MouseAdapter {
    private int fila;
    private int columna;

    public Listener_Tablero(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic en JPanel en fila: " + fila + ", columna: " + columna);
    }
}

