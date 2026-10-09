package Week7.thread;

public class ThreadExample {
    public static void main(String[] args) {
        ThreadA threadA=new ThreadA();
        ThreadB threadB=new ThreadB();

        threadA.start();
        threadB.start();
    }
}
