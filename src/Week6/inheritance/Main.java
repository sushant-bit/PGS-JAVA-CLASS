package Week6.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        PORSCHE porsche= new PORSCHE();
        porsche.start();
        porsche.stop();

        TESLA tesla= new TESLA();
        tesla.start();

    }
}