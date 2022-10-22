package model;

import java.util.ArrayList;

public class Empleado {
        public static final double SALARIO_MINIMO = 1000000;
        private String nombre;
        private ArrayList<Carro> ventas;
        private double sueldo;

        public Empleado(String pNombre) {
                this.nombre = pNombre;
                this.ventas = new ArrayList<>();
        }

        public void venderCarro(Carro carroVendido) {
                ventas.add(carroVendido);
        }

        public void calcularSueldo() {
                if (ventas.isEmpty()) {
                        sueldo = SALARIO_MINIMO;
                } else {
                        int numCarrosVendidos = ventas.size();

                        sueldo = SALARIO_MINIMO + 100000 * numCarrosVendidos;

                        double totalVentas = 0;
                        for (int i = 0; i < numCarrosVendidos; i++) {
                                Carro carro = ventas.get(i);
                                totalVentas = totalVentas + carro.getPrecio();
                        }
                        sueldo = sueldo + 0.02 * totalVentas;
                }
        }

        public String getNombre() {
                return nombre;
        }

        public double getSueldo() {
                return sueldo;
        }

}
