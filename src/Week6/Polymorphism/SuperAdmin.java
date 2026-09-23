package Week6.Polymorphism;

public class SuperAdmin extends User {
    private String role;

    public SuperAdmin(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: "+ role);
    }

    public static void main(String[] args) {
        SuperAdmin admin= new SuperAdmin("Sushant Adhikari", 22,"Software Engineer");
        admin.display();
    }
}
