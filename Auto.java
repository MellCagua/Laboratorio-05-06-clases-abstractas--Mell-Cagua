package abstraccion;

public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El auto está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El auto está frenando.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }

}
