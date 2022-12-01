package model;

public class CuentaLibreta extends CuentaBancaria {

        public CuentaLibreta(double fondos) {
                super(fondos);
                this.tasaInteres = 0.08;
        }

        @Override
        public void retirar(Integer cantidad) {
                this.fondos = this.fondos - (cantidad + this.fondos * 0.02);
        }
}
