package model;

import view.PanelSalida;
import java.util.ArrayList;

public class Empresa {
        private ArrayList<Carro> carrosVendidos;
        private Empleado[] empleados = new Empleado[10];

        public Empresa(Empleado[] empleados) {
                this.empleados = empleados;
        }

        public Empresa() {
                this.empleados = null;
        }

        public Empleado[] getEmpleados() {
                return this.empleados;
        }

        public void setEmpleados(Empleado[] empleados) {
                this.empleados = empleados;
        }

        public String toString() {
                return "\nDATOS DEL CARRO: \nNombre: " + empleados + "\nVentas: ";
        }
}
