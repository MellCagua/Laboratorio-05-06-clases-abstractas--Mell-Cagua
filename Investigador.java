package abstraccion;

import java.util.ArrayList;
import java.util.List;

class Investigador {
    private String orcid;
    private String nombreCompleto;
    private String email;
    private List<Publicacion> publicaciones;

    public Investigador(String orcid, String nombreCompleto, String email) {
        this.orcid = orcid;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion p) {
        publicaciones.add(p);
    }

    public void mostrarPublicaciones() {
        System.out.println("Investigador: " + nombreCompleto + " (" + orcid + ")");
        for (Publicacion pub : publicaciones) {
            pub.mostrarInformacion();
            System.out.println("---------------------------");
        }
    }
}
