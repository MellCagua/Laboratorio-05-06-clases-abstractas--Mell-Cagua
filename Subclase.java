package abstraccion;

public class Subclase extends Super {

	@Override
	public void setNumero(int numero) {
		this.numero=new numero;

	}

	@Override
	public int getNumero() {
		return numero;
	}
	
	public void visualizarOtraCadena() {
		System.out.println("Cadena de subclase 1 en visualizacionOtraCadebna");
	}

}
