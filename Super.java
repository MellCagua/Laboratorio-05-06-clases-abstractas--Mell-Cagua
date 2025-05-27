package abstraccion;

public abstract class Super{
	//atributos
	protected numero numero;
	
	//metodos abstractas --> solo se declaran
	public abstract void setNumero(int numero);
	
	public abstract int getNumero();
	
	//metodo concreto
	public void visualizacionCadena() {
		System.out.println("cadena desde al clase super");
	}
}