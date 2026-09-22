package Week2;

public class StringExamples {
    public static void main(String[] args) {
        String name="Sushant";
        String name1 = new String("Sushant");
        System.out.println(name==name1);
        System.out.println(name.equals(name1));
        String text="This is java program ";
        System.out.println(text.charAt(8));
        System.out.println(text.substring(8));
        System.out.println();
    }
}
