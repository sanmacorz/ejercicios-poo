package model;

public class Rectangulo extends Figura {
        public Rectangulo(double base, double altura) {
                super(base, altura);
        }

        public void calcularAreaPerimetro() {
                this.area = base * altura;
                this.perimetro = 2 * (base + altura);
        }

}
