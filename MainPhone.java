package abstraccion;

public class MainPhone {
    public static void main(String[] args) {
        MobilePhone p1 = new Smartphone("Samsung", "S21");
        MobilePhone p2 = new BasicPhone("Nokia", "1100");

        p1.powerOn();
        p1.makeCall("0987654321");

        p2.powerOn();
        p2.makeCall("0123456789");
    }

}
