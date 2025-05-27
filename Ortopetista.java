package abstraccion;

public class Ortopetista extends Medico {
	
	TipologiaO tipo;
	public Ortopetista() {
		
	}
	
	public Ortopetista(String nombre, TipologiaO tipo) {
		super(nombre);
		this.tipo=tipo;
	}

	public TipologiaO getTipo() {
		return tipo;
	}

	public void setTipo(TipologiaO tipo) {
		this.tipo = tipo;
	}
	
	

}
