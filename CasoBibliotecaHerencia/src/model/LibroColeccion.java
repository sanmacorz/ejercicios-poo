package model;

public class LibroColeccion extends Libro {
        private String nombreColecccion;
        private Integer numeroColeccion;

        public LibroColeccion(String nombreLibro, String nombreAutores, Integer anioEdicion, Boolean libroDeLujo,
                        String nombreColecccion, Integer numeroColeccion) {
                super(nombreLibro, nombreAutores, anioEdicion, libroDeLujo);
                this.nombreColecccion = nombreColecccion;
                this.numeroColeccion = numeroColeccion;
        }

        public String getNombreColecccion() {
                return nombreColecccion;
        }

        public Integer getNumeroColeccion() {
                return numeroColeccion;
        }

        public void setNombreColecccion(String nombreColecccion) {
                this.nombreColecccion = nombreColecccion;
        }

        public void setNumeroColeccion(Integer numeroColeccion) {
                this.numeroColeccion = numeroColeccion;
        }

        @Override
        public String toString() {
                return "\nNombre: " + nombreLibro + "\nAutores: " + nombreAutores + "\nAño: " + anioEdicion
                                + "\nEdición de lujo: " + libroDeLujo + "\nNombre de colección: " + nombreColecccion
                                + "\nNúmero de colección: " + numeroColeccion + "\n";
        }
}
