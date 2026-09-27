package Week6.abstraction.interfaceExample;

public class Main {
    public static void main(String[] args) {
        CollegeTeacher fullTime=new FullTimeTeacher();
        fullTime.studentAttendence();
        fullTime.studentInfo();

        CollegeTeacher partTime= new PartTimeTeacher();

    }
}
