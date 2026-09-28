package Week6.enumExample;

public class EnumExample {
    public static void main(String[] args) {
        Level value=Level.LOW;

        switch (value){
            case LOW -> System.out.println("Low Level");
            case HIGH -> System.out.println("HGH Level");
            case MEDIUM -> System.out.println("MEDIUM Level");
            default -> System.out.println("Unknownc");
        }
    }
}
