package model;

import view.PanelSalida;
import java.util.ArrayList;

public class Biblioteca {
        private ArrayList<Libro> librosBiblioteca;

        public Biblioteca(ArrayList<Libro> librosBiblioteca) {
                this.librosBiblioteca = librosBiblioteca;
        }

        public Biblioteca() {
                this.librosBiblioteca = new ArrayList<>();
        }

        public ArrayList<Libro> getLibrosBiblioteca() {
                return librosBiblioteca;
        }

        public void setLibrosBiblioteca(ArrayList<Libro> librosBiblioteca) {
                this.librosBiblioteca = librosBiblioteca;
        }

        public void agregarLibro(Libro libro) {
                librosBiblioteca.add(libro);
        }

        public void imprimirLibros() {
                for (int i = 0; i < librosBiblioteca.size(); i++) {
                        PanelSalida.mostrarResultados(librosBiblioteca.get(i).toString());
                }
        }
}
