package abstraccion;

public class ArticuloRevista extends Publicacion {
    private String nombreRevista;
    private String extracto;

    public ArticuloRevista(String doi, String titulo, String fechaRegistro, String nombreRevista, String extracto) {
        super(doi, titulo, fechaRegistro);
        this.nombreRevista = nombreRevista;
        this.extracto = extracto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[ArticuloRevista] " + getTitulo() + " en " + nombreRevista);
        System.out.println("DOI: " + getDoi() + ", Fecha: " + getFechaRegistro());
        System.out.println("Extracto: " + extracto);
    }
}
