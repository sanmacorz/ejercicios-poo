package model;

public abstract class CuentaBancaria {
        protected double fondos;
        protected double tasaInteres;

        protected CuentaBancaria(double fondos) {
                this.fondos = fondos;
                this.tasaInteres = 0.0;
        }

        public abstract void retirar(Integer cantidad);

        public void depositar(Integer cantidad) {
                this.fondos += cantidad;
        }

        public double calcularIntereses() {
                return this.fondos * this.tasaInteres;
        }

        public Double getFondos() {
                return fondos;
        }

        public double getTasaInteres() {
                return tasaInteres;
        }

        public void setFondos(double fondos) {
                this.fondos = fondos;
        }

        @Override
        public String toString() {
                return "Fondos: " + this.fondos + "\nTasa: " + this.tasaInteres + "\nIntereses: " + calcularIntereses();
        }
}
