package Week5;

public class Main {

    public static void main(String[] args) {
        Dog blackDog= new Dog();
        blackDog.color="Black";
        blackDog.height=12;
        blackDog.age=6;
        blackDog.breed="Breed A";
        blackDog.run();
        blackDog.eat();

        // White Dog
        Dog whiteDog = new Dog();
        whiteDog.color = "White";
        whiteDog.height = 10;
        whiteDog.age = 3;
        whiteDog.breed = "Breed B";
        whiteDog.run();
        whiteDog.eat();

        // Brown Dog
        Dog brownDog = new Dog();
        brownDog.color = "Brown";
        brownDog.height = 15;
        brownDog.age = 4;
        brownDog.breed = "Breed C";
        brownDog.run();
        brownDog.eat();


         }
}
