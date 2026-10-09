package Week7.exceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionTypes {
    public void readFile() throws FileNotFoundException {
        FileReader reader = new FileReader("java.txt");
    }

    static void main(String[] args) {

        int num = 100;
        int num2 = 0;
        System.out.println(num/num2); // 2. Run-Time Exception

    }

}