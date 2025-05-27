package abstraccion;

public class AppAbstraccion {
	
	public static void main(String[]args) {
		//implementar unos objetos cojn abstraccion
		
		Subclase objSubClase = new Subclase();
		objSubClase.setNumero(80);
		System.out.println("numero encapsulado en el obj1 mediante setNumero: "+ objSubClase.getNumero());
		objSubClase.visualizacionCadena();
		objSubClase.visualizarOtraCadena();
	}

}
