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

public class Listener extends MouseAdapter {
    private int fila;
    private int columna;

    public Listener(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic en JPanel en fila: " + fila + ", columna: " + columna);
        // Realiza las acciones que desees con las coordenadas
    }
}

