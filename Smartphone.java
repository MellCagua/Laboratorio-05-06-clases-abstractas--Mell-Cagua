package abstraccion;

public class Smartphone extends MobilePhone {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Llamando a " + number + " desde smartphone con WhatsApp...");
    }
}
