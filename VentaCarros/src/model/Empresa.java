package model;

public class Empresa {
        private static final int NUMERO_EMPLEADOS = 10;
        private Empleado[] empleados = new Empleado[NUMERO_EMPLEADOS];

        public Empresa(Empleado[] empleados) {
                this.empleados = empleados;
        }

        public Empresa() {
                this.empleados = null;
        }

        public void agregarEmpleado(Empleado empleado, int indice) {
                empleados[indice] = empleado;
        }

        public Empleado[] getEmpleados() {
                return this.empleados;
        }

        public void setEmpleados(Empleado[] empleados) {
                this.empleados = empleados;
        }

        public double calcularNomina() {
                double totalNomina = 0;
                for (int i = 0; i < empleados.length; i++) {
                        totalNomina = totalNomina + Empleado.calcularSalario(empleados[i].getCarros());
                }
                return totalNomina;
        }

        public String toString() {
                return "\nDATOS DEL CARRO: \nNombre: " + empleados + "\nVentas: ";
        }
}
