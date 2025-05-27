package abstraccion;

public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La motocicleta está frenando.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindraje: " + cilindraje + " cc");
    }

}
