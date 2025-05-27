package abstraccion;

import java.util.List;

public class Libro extends Publicacion {
    private String nombreEditorial;
    private List<String> palabrasClave;

    public Libro(String doi, String titulo, String fechaRegistro, String nombreEditorial, List<String> palabrasClave) {
        super(doi, titulo, fechaRegistro);
        this.nombreEditorial = nombreEditorial;
        this.palabrasClave = palabrasClave;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Libro] " + getTitulo() + " - Editorial: " + nombreEditorial);
        System.out.println("DOI: " + getDoi() + ", Fecha: " + getFechaRegistro());
        System.out.println("Palabras clave: " + String.join(", ", palabrasClave));
    }

}
