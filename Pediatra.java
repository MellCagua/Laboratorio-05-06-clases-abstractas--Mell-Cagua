package abstraccion;

public class Pediatra extends Medico {
	
	Tipologia tipo;	
	
	public Pediatra() {
		
	}
	
	public Pediatra(String nombre, Tipologia tipo) {
		super(nombre);
		this.tipo=tipo;
	}

	public Tipologia getTipo() {
		return tipo;
	}

	public void setTipo(Tipologia tipo) {
		this.tipo = tipo;
	}
	
	

}
