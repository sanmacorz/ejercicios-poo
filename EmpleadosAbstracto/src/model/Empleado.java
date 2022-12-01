package model;

public abstract class Empleado {
        protected String nombre;
        protected int salario;
        protected int horasTrabajo;

        protected Empleado(String nombre, int salario, int horasTrabajo) {
                this.nombre = nombre;
                this.salario = salario;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getNombre() {
                return nombre;
        }

        public void setSalario(int salario) {
                this.salario = salario;
        }

        public int getSalario() {
                return salario;
        }

        public void setHorasTrabajo(int horasTrabajo) {
                this.horasTrabajo = horasTrabajo;
        }

        public int getHorasTrabajo() {
                return horasTrabajo;
        }

        public abstract double calcularSalario();

        public String toString() {
                return "Nombre: " + nombre + "\nSalario: " + salario;
        }
}
