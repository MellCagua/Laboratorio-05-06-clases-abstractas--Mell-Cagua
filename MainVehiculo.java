package abstraccion;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Auto("Toyota", "Corolla", 4);
        Vehiculo v2 = new Motocicleta("Yamaha", "R3", 321);

        v1.mostrarInformacion();
        v1.acelerar();
        v1.frenar();

        System.out.println("-----------------------");

        v2.mostrarInformacion();
        v2.acelerar();
        v2.frenar();
    }

}
