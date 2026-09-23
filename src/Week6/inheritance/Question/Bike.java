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


}