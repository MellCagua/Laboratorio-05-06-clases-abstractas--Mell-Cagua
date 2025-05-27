package my_project.my_project.herencia;

public class Ingeniero extends Empleado {
    private double bonoTecnico;

    public Ingeniero(String nombre, double salarioBase, double bonoTecnico) {
        super(nombre, salarioBase);
        this.bonoTecnico = bonoTecnico;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bonoTecnico;
    }

}
