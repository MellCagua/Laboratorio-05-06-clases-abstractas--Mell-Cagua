package abstraccion;

import java.util.Arrays;

public class MainPublicacion {
    public static void main(String[] args) {
        Investigador inv = new Investigador("0000-0002-1234-5678", "Ana Torres", "ana.torres@uni.edu.ec");

        ArticuloRevista art = new ArticuloRevista("10.1234/abc1", "IA en la medicina", "2023-01-10", "Revista Científica", "Uso de IA en diagnóstico");
        Libro libro = new Libro("10.1234/book1", "Algoritmos Modernos", "2022-07-05", "TechBooks", Arrays.asList("algoritmos", "programación", "estructura de datos"));
        PaginaWeb web = new PaginaWeb("10.1234/web1", "Blog de Tecnología", "2023-11-20", "https://tecnoblog.ec", "Contenido del blog sobre IA");

        inv.agregarPublicacion(art);
        inv.agregarPublicacion(libro);
        inv.agregarPublicacion(web);

        inv.mostrarPublicaciones();
    }
}
