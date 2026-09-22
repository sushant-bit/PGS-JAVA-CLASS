package Week6.inheritance.Question;

public class Vehicle {
    private String brandName;
    private int maxSpeed;

    public Vehicle(String brandName, int maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}