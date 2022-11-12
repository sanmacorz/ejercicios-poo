package main;

import model.Fecha;

public class Main {
    public static void main(String[] args) {
        Fecha miFecha = new Fecha();

        miFecha.setDia(12);
        miFecha.setMes(11);
        miFecha.setAnio(2022);

        System.out.println(miFecha.toString());

        Fecha miOtraFecha = new Fecha("12/11/2022");

        System.out.println(miOtraFecha.toString());

        if (miFecha.equals(miOtraFecha)) {
            System.out.println("Las fechas SÍ son iguales!");
        } else {
            System.out.println("Las fechas NO son iguales!");
        }

        miFecha.addDias(360);
        System.out.println(miFecha.toString());
    }
}
