package abstraccion;

public abstract class Publicacion {
    private String doi;
    private String titulo;
    private String fechaRegistro;

    public Publicacion(String doi, String titulo, String fechaRegistro) {
        this.doi = doi;
        this.titulo = titulo;
        this.fechaRegistro = fechaRegistro;
    }

    public String getDoi() { return doi; }
    public String getTitulo() { return titulo; }
    public String getFechaRegistro() { return fechaRegistro; }

    public void setDoi(String doi) { this.doi = doi; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public abstract void mostrarInformacion();
}
