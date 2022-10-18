package model;

public class Carro {
        private String marca;
        private int precio;

        public Carro(String marca, int precio) {
                this.marca = marca;
                this.precio = precio;
        }

        public Carro() {
                this.marca = "";
                this.precio = 0;
        }

        public String getMarca() {
                return this.marca;
        }

        public int getPrecio() {
                return this.precio;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public void setPrecio(int precio) {
                this.precio = precio;
        }

        public String toString() {
                return "\nDATOS DEL CARRO: \nMarca: " + marca + "\nPrecio: " + precio;
        }
}
