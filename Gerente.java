package my_project.my_project.herencia;

public class Gerente extends Empleado {
	   private double bonoGestion;

	    public Gerente(String nombre, double salarioBase, double bonoGestion) {
	        super(nombre, salarioBase);
	        this.bonoGestion = bonoGestion;
	    }

	    @Override
	    public double calcularSalarioTotal() {
	        return salarioBase + bonoGestion;
	    }
}
