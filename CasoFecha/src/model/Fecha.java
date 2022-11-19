package model;

public class Fecha {
        protected int dia;
        protected int mes;
        protected int anio;

        public Fecha(int dia, int mes, int anio) {
                this.dia = dia;
                this.mes = mes;
                this.anio = anio;
        }

        public Fecha() {
                this.dia = 0;
                this.mes = 0;
                this.anio = 0;
        }

        public Fecha(String fecha) {
                String[] array = fecha.split("/");
                this.dia = Integer.parseInt(array[0]);
                this.mes = Integer.parseInt(array[1]);
                this.anio = Integer.parseInt(array[2]);
        }

        public int getDia() {
                return dia;
        }

        public int getMes() {
                return mes;
        }

        public int getAnio() {
                return anio;
        }

        public void setDia(int dia) {
                this.dia = dia;
        }

        public void setMes(int mes) {
                this.mes = mes;
        }

        public void setAnio(int anio) {
                this.anio = anio;
        }

        private int fechaToDias() {
                return (this.anio * 360) + (this.mes * 30) + this.dia;
        }

        private void diasToFecha(int dias) {
                this.anio = dias / 360;
                this.mes = dias % 360 / 30;
                this.dia = dias % 360 % 30;
        }

        public void addDias(int suma) {
                int diasTotales = fechaToDias() + suma;
                diasToFecha(diasTotales);
        }

        public String toString() {
                return dia + "/" + mes + "/" + anio;
        }

        public boolean equals(Object objeto) {
                Fecha temporal = (Fecha) objeto;
                return (dia == temporal.dia) && (mes == temporal.mes) && (anio == temporal.anio);
        }
}
