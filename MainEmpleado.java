package my_project.my_project.herencia;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Ingeniero("Ana", 1500, 300);
        Empleado e2 = new Gerente("Luis", 2000, 500);

        System.out.println("Salario total Ingeniero: " + e1.calcularSalarioTotal());
        System.out.println("Salario total Gerente: " + e2.calcularSalarioTotal());
    }

}
