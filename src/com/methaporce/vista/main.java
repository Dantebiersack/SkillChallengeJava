package com.methaporce.vista;

import com.methaporce.modelo.Pelicula;
import com.methaporce.controlador.Gestor;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        //instancias
        Pelicula p = new Pelicula();
        Gestor g = new Gestor();
        //variables de apoyo
        int contID = 0, indice;
        String nombre;
        int salir = 0;//variable de salida
        do {//inicio del menu
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    ***Peliculas Methaporce***
                    1.- Agregar nueva pelicula.
                    2.- Remover pelicula.
                    3.- Lista de peliculas.
                    4.- Lista de peliculas disponibles.                                                                                                                                                                                                                        
                    5.- Lista de peliculas no disponibles.
                    6.- Dar de alta pelicula.
                    7.- Salir.
                                                                          """));
            switch (menu) {
                case 1://Agregar nueva pelicula.
                    //id generado automaticamente
                    //todas las peliculas se agregan como "inactivas"
                    contID++;
                    nombre = JOptionPane.showInputDialog(null, "***Registrar Pelicula***\n"
                            + "Nombre:");
                    p.setId(contID);
                    p.setNombre(nombre);
                    p.setDisponible(false);
                    g.agregarPelicula(p);
                    break;
                case 2://Remover pelicula.
                    indice = Integer.parseInt(JOptionPane.showInputDialog(null, "***Eliminar Pelicula***\n"
                            + "Seleccione la Pelicula a eliminar:\n"
                            + g.obtenerPeliculas()));
                    g.eliminarPelicula(indice);
                    break;
                case 3://Lista de peliculas.
                    JOptionPane.showMessageDialog(null, "***Peliculas***\n"+g.obtenerPeliculas());
                    break;
                case 4://Lista de peliculas disponibles.
                    JOptionPane.showMessageDialog(null, "***Peliculas disponibles***\n"+g.obtenerPeliculasDisponibles());
                    break;
                case 5://Lista de peliculas no disponibles.
                    JOptionPane.showMessageDialog(null, "***Peliculas no disponibles***\n"+g.obtenerPeliculasNoDisponibles());
                    break;
                case 6://Dar de alta pelicula.
                    indice = Integer.parseInt(JOptionPane.showInputDialog(null, "***Dar de alta Pelicula***\n"
                            + "Seleccione la pelicula a dar de alta:\n" + g.obtenerPeliculasNoDisponibles()));
                    g.marcarPeliculaComoDisponible(indice);
                    break;
                case 7://salir
                    salir = 1;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (salir == 0);
    }
}
