package Week6.inheritance.Question;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);
        car.displayInfo();

        Bike bike = new Bike("Yamaha ZR",85, "tubular handlebar design");
        bike.displayInfo();
    }
}
