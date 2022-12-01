package model;

public class CuentaCorriente extends CuentaBancaria {

        public CuentaCorriente(double fondos) {
                super(fondos);
                this.tasaInteres = 0.00;
        }

        @Override
        public void retirar(Integer cantidad) {
                this.fondos -= cantidad;
        }

        public void pagar(Integer cantidad) {
                this.fondos -= cantidad;
        }

        public double calcularIntereses() {
                return this.fondos * this.tasaInteres;
        }
}
