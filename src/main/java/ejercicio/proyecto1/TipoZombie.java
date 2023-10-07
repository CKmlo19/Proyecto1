/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

/**
 *
 * @author masis
 */
public enum TipoZombie {
    
    AEREO("Zombie Aéreo", "ruta_del_zombie_aereo.gif"),
    CONTACTO("Zombie de Contacto", "ruta_del_zombie_contacto.gif"),
    MEDIANO_ALCANCE("Zombie de Mediano Alcance", "ruta_del_zombie_mediano_alcance.gif"),
    CHOQUE("Zombie de Choque", "ruta_del_zombie_choque.gif");

    private final String nombre;
    private final String rutaGif;

    private TipoZombie(String nombre, String rutaImagen) {
        this.nombre = nombre;
        this.rutaGif = rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRutaImagen() {
        return rutaGif;
    }
}



