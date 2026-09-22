package Week3;

public class BreakAndContinue {
    public static void main(String[] args) {
        String[] students = {"Unique", "Bipin", "Madan", "Dipsan"};
        int[] scores = {12, 23, 2, 42};

        for (String student : students) {
            if (student.equals("Unique")) {
                continue;
            }
            System.out.println(student);
        }

        for (int score : scores) {
            if (score == 2) {
                break;
            }
            System.out.println(score);
        }
    }
}