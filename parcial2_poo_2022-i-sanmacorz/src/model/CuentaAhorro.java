package model;

public class CuentaAhorro extends CuentaBancaria {

        public CuentaAhorro(double fondos) {
                super(fondos);
                this.tasaInteres = 0.04;
        }

        @Override
        public void retirar(Integer cantidad) {
                this.fondos -= cantidad;
        }
}
