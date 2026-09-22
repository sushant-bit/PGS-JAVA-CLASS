package Week3;

public class RevString {
    public static void main(String[] args) {
        String naam="Unique";
        String rev="";
        for (int i = naam.length()-1; i>=0; i--) {
            rev+=naam.charAt(i);
        }
        System.out.println(rev);

    }
}
