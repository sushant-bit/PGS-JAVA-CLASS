package Week6.abstraction.interfaceExample;

public class PartTimeTeacher implements  CollegeTeacher{
    @Override
    public void studentAttendence() {
        System.out.println("For part time teacher: Student attendance");
    }

    @Override
    public void studentInfo() {
        System.out.println("For part time teacher: Student info");
    }
}
