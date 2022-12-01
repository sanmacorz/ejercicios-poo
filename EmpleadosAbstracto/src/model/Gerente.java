package model;

public class Gerente extends Empleado {
        private double bonificacion;
        private int ventasMensuales;

        public Gerente(String nombre, int salario, int horasTrabajo, double bonificacion, int ventasMensuales) {
                super(nombre, salario, horasTrabajo);
                this.bonificacion = bonificacion;
                this.horasTrabajo = horasTrabajo;
                this.ventasMensuales = ventasMensuales;
        }

        public double getBonificacion() {
                return bonificacion;
        }

        public void setBonificacion(double bonificacion) {
                this.bonificacion = bonificacion;
        }

        public int getVentasMensuales() {
                return ventasMensuales;
        }

        public void setVentasMensuales(int ventasMensuales) {
                this.ventasMensuales = ventasMensuales;
        }

        @Override
        public double calcularSalario() {
                return salario * horasTrabajo + ventasMensuales * bonificacion;
        }

        @Override
        public String toString() {
                return "Nombre: " + nombre + "\nSalario: " + salario + "\nBonificación: " + bonificacion;
        }
}
