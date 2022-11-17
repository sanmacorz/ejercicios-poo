package model;

public class Circulo extends Figura {
        public Circulo(double radio) {
                super(radio);
        }

        public void calcularAreaPerimetro() {
                this.area = Math.round((Math.PI * Math.pow(radio, 2)) * 100.0) / 100.0;
                this.perimetro = Math.round((2 * Math.PI * radio) * 100.0) / 100.0;
        }
}
