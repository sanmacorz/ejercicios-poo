package model;

import java.util.ArrayList;

public class Banco {
        private ArrayList<CuentaBancaria> cuentasBancarias;

        public Banco(ArrayList<CuentaBancaria> cuentasBancarias) {
                this.cuentasBancarias = cuentasBancarias;
        }

        public Banco() {
                this.cuentasBancarias = new ArrayList<>();
        }

        public ArrayList<CuentaBancaria> getCuentasBancarias() {
                return cuentasBancarias;
        }

        public void agregarCuenta(CuentaBancaria cuenta) {
                this.cuentasBancarias.add(cuenta);
        }

        public void setCuentasBancarias(ArrayList<CuentaBancaria> cuentasBancarias) {
                this.cuentasBancarias = cuentasBancarias;
        }
}
