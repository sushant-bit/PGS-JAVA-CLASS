package Week6.abstraction.interfaceExample;

public interface ExamSection {
    void  studentMarks();
    default void marksRecheck(){
        System.out.println("Default");
    };
}
