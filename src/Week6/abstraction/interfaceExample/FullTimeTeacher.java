package Week6.abstraction.interfaceExample;

public class FullTimeTeacher implements  CollegeTeacher, ExamSection
{
    @Override
    public void studentAttendence() {
        System.out.println("Student attendance");
    }

    @Override
    public void studentInfo() {
        System.out.println("Student info");

    }

    @Override
    public void studentMarks() {
        System.out.println("Student marks.");
    }
}
