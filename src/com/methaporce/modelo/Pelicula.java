package com.methaporce.modelo;

public class Pelicula {
    
    private int id;
    private String nombre;
    private boolean disponible;

    public Pelicula() {
    }
    
    public Pelicula(Pelicula pelicula) {
        id = pelicula.id;
        nombre = pelicula.nombre;
        disponible = pelicula.disponible;
    }

    public Pelicula(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
