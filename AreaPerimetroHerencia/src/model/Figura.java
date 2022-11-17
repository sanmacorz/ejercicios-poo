package model;

public class Figura {
        protected double base;
        protected double altura;
        protected double radio;
        protected double area;
        protected double perimetro;

        public Figura(double base, double altura) {
                this.base = base;
                this.altura = altura;
                this.area = 0;
                this.perimetro = 0;
        }

        public Figura(double radio) {
                this.radio = radio;
                this.area = 0;
                this.perimetro = 0;
        }

        public String mostrarResultado() {
                return "El area es de " + this.area + " y el perimetro de " + this.perimetro;
        }
}
