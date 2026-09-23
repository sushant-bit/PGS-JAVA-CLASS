package Week6.Polymorphism;

public class Main {
    public static void main(String[] args) {
        SuperAdmin admin= new SuperAdmin("Sushant Adhikari", 22,"Software Engineer");
        admin.display();

        User superad= new SuperAdmin("Dipsan Raj Lama",20, "Junior Developer");
        superad.display();
    }
}
