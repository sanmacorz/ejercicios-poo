package model;

public class FechaDetallada extends Fecha {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                        "septiembre", "octubre", "noviembre", "diciembre" };

        public FechaDetallada(int dia, int mes, int anio) {
                super(dia, mes, anio);
        }

        public String mesToString() {
                return meses[this.mes - 1];
        }

        @Override
        public String toString() {
                return dia + " de " + mesToString() + " de " + anio;
        }
}
