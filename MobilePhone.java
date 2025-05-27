package abstraccion;

public abstract class MobilePhone {
    protected String brand;
    protected String model;

    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void makeCall(String number);

    public void powerOn() {
        System.out.println("Encendiendo " + brand + " " + model);
    }
}
