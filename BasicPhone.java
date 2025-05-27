package abstraccion;

public class BasicPhone extends MobilePhone {
    public BasicPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Llamando a " + number + " desde teléfono básico...");
    }
}
