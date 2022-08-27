// Genera diez números pseudoaleatorios y los imprime en pantalla
package model;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int numero;
        for (int i = 1; i <= 10; i++) {
            numero = (int) (Math.random() * 10);
            System.out.println(numero);
        }
        System.exit(0);
    }
}