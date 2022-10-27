package model;

public class PlanTelefonia {
        private String numeroCelular;
        private String operadorCelular;
        private Integer cantidadMinutos;
        private Double costoMinuto;
        private Double costoTotal;

        public PlanTelefonia(String numeroCelular, String operadorCelular, Integer cantidadMinutos,
                        Double costoMinuto) {
                this.numeroCelular = numeroCelular;
                this.operadorCelular = operadorCelular;
                this.cantidadMinutos = cantidadMinutos;
                this.costoMinuto = costoMinuto;
        }

        public PlanTelefonia() {
                this.numeroCelular = "";
                this.operadorCelular = "";
                this.cantidadMinutos = 0;
                this.costoMinuto = 0.0;
        }

        public String getNumeroCelular() {
                return numeroCelular;
        }

        public String getOperadorCelular() {
                return operadorCelular;
        }

        public Integer getCantidadMinutos() {
                return cantidadMinutos;
        }

        public Double getCostoMinuto() {
                return costoMinuto;
        }

        public Double getCostoTotal() {
                return costoTotal;
        }

        public void setNumeroCelular(String numeroCelular) {
                this.numeroCelular = numeroCelular;
        }

        public void setOperadorCelular(String operadorCelular) {
                this.operadorCelular = operadorCelular;
        }

        public void setCantidadMinutos(Integer cantidadMinutos) {
                this.cantidadMinutos = cantidadMinutos;
        }

        public void setCostoMinuto(Double costoMinuto) {
                this.costoMinuto = costoMinuto;
        }

        public void calcularCostoTotal() {
                if (operadorCelular.equals("Movilujo")) {
                        costoTotal = 0.5 * (cantidadMinutos * costoMinuto);
                } else {
                        costoTotal = (double) (cantidadMinutos * costoMinuto);
                }
        }

        public String toString() {
                return "Teléfono celular: " + numeroCelular + "\nEmpresa operador: " + operadorCelular
                                + "\nMinutos gastados: " + cantidadMinutos + "\nCosto minuto: " + costoMinuto
                                + "\nCantidad a pagar: " + costoTotal;

        }
}
