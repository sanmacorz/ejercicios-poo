package model;

public class Operario extends Empleado {

        public Operario(String nombre, int salario, int horasTrabajo) {
                super(nombre, salario, horasTrabajo);
        }

        @Override
        public double calcularSalario() {
                return Double.valueOf(salario * horasTrabajo) / 2;
        }
}
