package Week6.inheritance.Question;

public class Bike extends Vehicle {
    private String typeOfHandleBar;

    public Bike(String brandName, int maxSpeed, String typeOfHandleBar) {
        super(brandName, maxSpeed);
        this.typeOfHandleBar = typeOfHandleBar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type of handlebar is: "+typeOfHandleBar);
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha ZR",85, "tubular handlebar design");
        bike.displayInfo();
    }
}