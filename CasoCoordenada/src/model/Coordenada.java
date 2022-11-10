package model;

public class Coordenada {
        private double x;
        private double y;

        public Coordenada() {
                this.x = 0.0;
                this.y = 0.0;
        }

        public Coordenada(double x, double y) {
                this.x = x;
                this.y = y;
        }

        public double getX() {
                return x;
        }

        public double getY() {
                return y;
        }

        public void setX(double x) {
                this.x = x;
        }

        public void setY(double y) {
                this.y = y;
        }

        public Double calcularDistancia(Object objeto) {
                Coordenada temporal = (Coordenada) objeto;
                Double distanciaX = Math.abs(this.getX() - temporal.getX());
                Double distanciaY = Math.abs(this.getY() - temporal.getY());
                return Math.sqrt(Math.pow(distanciaY, 2) + Math.pow(distanciaX, 2));
        }

        public String toString() {
                return "Coordenada: " + "(" + x + ", " + y + ")";
        }

        public boolean equals(Object objeto) {
                Coordenada temporal = (Coordenada) objeto;
                return (this.x == temporal.x) && (this.y == temporal.y);
        }
}
