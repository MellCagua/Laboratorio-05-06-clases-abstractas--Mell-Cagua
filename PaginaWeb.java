package abstraccion;

public class PaginaWeb extends Publicacion {
    private String url;
    private String contenidoExtraido;

    public PaginaWeb(String doi, String titulo, String fechaRegistro, String url, String contenidoExtraido) {
        super(doi, titulo, fechaRegistro);
        this.url = url;
        this.contenidoExtraido = contenidoExtraido;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[PaginaWeb] " + getTitulo() + " en " + url);
        System.out.println("DOI: " + getDoi() + ", Fecha: " + getFechaRegistro());
        System.out.println("Contenido: " + contenidoExtraido);
    }
}
