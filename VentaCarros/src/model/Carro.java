package model;

public class Carro {
        private String nombre;
        private int precio;

        public Carro(String nombre, int precio) {
                this.nombre = nombre;
                this.precio = precio;
        }

        public Carro() {
                this.nombre = "";
                this.precio = 0;
        }

        public String getNombre() {
                return this.nombre;
        }

        public int getPrecio() {
                return this.precio;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public void setPrecio(int precio) {
                this.precio = precio;
        }

        public String toString() {
                return "\nDATOS DEL CARRO: \nNombre: " + nombre + "\nPrecio: " + precio;
        }
}
