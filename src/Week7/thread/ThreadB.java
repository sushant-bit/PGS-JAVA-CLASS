package Week7.thread;

public class ThreadB extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Adhikari");
        }
    }
}
