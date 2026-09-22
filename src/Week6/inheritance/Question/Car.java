package Week6.inheritance.Question;

public class Car extends Vehicle {
    private int noOfDoors;
    public Car(String brandName, int maxSpeed, int noOfDoors) {
        super(brandName, maxSpeed);
        this.noOfDoors=noOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("No of doors: "+noOfDoors);
    }


}