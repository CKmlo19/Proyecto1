/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import javax.swing.JLabel;

/**
 *
 * @author luisc
 */
public abstract class Personaje {
    String Nombre;
    int vida;
    int golpes;
    int cantidad_golpes;
    int nivel;
    int campos;
    int nivel_aparicion;
    String tipo;
    int rango;
    int daño;
    int posicion_x;
    int posicion_y;
    JLabel label;

public Personaje(String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango, int daño, int posicion_x, int posicion_y) {
    this.Nombre = Nombre;
    this.vida = vida;
    this.cantidad_golpes = cantidad_golpes;
    this.nivel = nivel;
    this.campos = campos;
    this.nivel_aparicion = nivel_aparicion;
    this.tipo = tipo;
    this.rango = rango;
    this.daño = daño;
    this.posicion_x = posicion_x;
    this.posicion_y = posicion_y;
}

    public Personaje() {
       
    }


    @Override
    public String toString() {
        return "Personaje{" + "Nombre=" + Nombre + ", vida=" + vida + ", cantidad_golpes=" + cantidad_golpes + ", nivel=" + nivel + ", campos=" + campos + ", nivel_aparicion=" + nivel_aparicion + ", tipo=" + tipo + ", rango=" + rango + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantidad_golpes() {
        return cantidad_golpes;
    }

    public void setCantidad_golpes(int cantidad_golpes) {
        this.cantidad_golpes = cantidad_golpes;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public int getNivel_aparicion() {
        return nivel_aparicion;
    }

    public void setNivel_aparicion(int nivel_aparicion) {
        this.nivel_aparicion = nivel_aparicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
    
    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getDaño() {
        return daño;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    public void morir(){
        this.vida = 0;
        System.out.println("Te has muerto jaja get good personaje diff");
    }
    
    public void pelear(Personaje oponente) {
        int dañoTotal = this.cantidad_golpes * this.daño;
        oponente.vida -= dañoTotal;  
        if (oponente.vida <= 0) {
            oponente.morir();
        }
    }

}