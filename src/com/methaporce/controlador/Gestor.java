package com.methaporce.controlador;

import com.methaporce.modelo.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Gestor {

    private ArrayList<Pelicula> ListaPeliculas = new ArrayList<>();
    Pelicula p = new Pelicula();

    public ArrayList<Pelicula> getListaPeliculas() {
        return ListaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> ListaPeliculas) {
        this.ListaPeliculas = ListaPeliculas;
    }

    public void agregarPelicula(Pelicula pelicula) {
        ListaPeliculas.add(new Pelicula(pelicula));
    }

    public void eliminarPelicula(int id) {
        Iterator<Pelicula> iterator = ListaPeliculas.iterator();
        while (iterator.hasNext()) {
            Pelicula pelicula = iterator.next();
            if (pelicula.getId() == id) {
                JOptionPane.showMessageDialog(null, "Pelicula " + pelicula.getNombre() + " ha sido eliminada");
                iterator.remove();
            }
        }
    }

    public String obtenerPeliculas() {
        String lista = "";
        for (Pelicula pelicula : ListaPeliculas) {
            lista += "ID: " + pelicula.getId() + "\nNombre: " + pelicula.getNombre()
                    + "\n=================================\n";
        }
        if (lista.equals("")) {
            lista = "No hay peliculas registradas";
        }
        return lista;
    }
    
    public String obtenerPeliculasDisponibles() {
        String lista = "";
        for (Pelicula pelicula : ListaPeliculas) {
            if (pelicula.isDisponible()== true) {
              lista += "ID: " + pelicula.getId() + "\nNombre: " + pelicula.getNombre()
                    + "\n=================================\n";  
            }
        }
        if (lista.equals("")) {
            lista = "No hay peliculas registradas o disponibles";
        }
        return lista;
    }  
    
    public String obtenerPeliculasNoDisponibles() {
        String lista = "";
        for (Pelicula pelicula : ListaPeliculas) {
            if (pelicula.isDisponible()== false) {
              lista += "ID: " + pelicula.getId() + "\nNombre: " + pelicula.getNombre()
                    + "\n=================================\n";  
            }
        }
        if (lista.equals("")) {
            lista = "No hay peliculas registradas o indisponibles";
        }
        return lista;
    }
    
    public void marcarPeliculaComoDisponible(int id){
        for (Pelicula pelicula : ListaPeliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                JOptionPane.showMessageDialog(null, "Pelicula " + pelicula.getNombre() + " esta disponible");
            }
        }
    }
}
