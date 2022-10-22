package model;

import java.util.ArrayList;

public class Empresa {
        public static final int NUMERO_EMPLEADOS = 3;
        private ArrayList<Empleado> empleados;

        public Empresa() {
                empleados = new ArrayList<>();
        }

        public void agregarEmpleado(Empleado emp) {
                empleados.add(emp);
        }

        public double calcularNomina() {
                double totalnomina = 0;
                for (int i = 0; i < empleados.size(); i++) {
                        Empleado temp = empleados.get(i);
                        totalnomina += temp.getSueldo();
                }
                return totalnomina;
        }

        public Empleado getEmpleado(int i) {
                return empleados.get(i);
        }

        public int getNumeroEmpleados() {
                return empleados.size();
        }
}
