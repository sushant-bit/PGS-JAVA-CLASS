package Week7;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentData= new HashMap<>();
        studentData.put(1,"Sushant Adhikari");
        studentData.put(2,"Susu");

        String roll= studentData.get(1);
        System.out.println(roll);

        for(int key: studentData.keySet()){
            System.out.println(studentData.get(key));
        }

        for(String val: studentData.values()){
            System.out.println(val);
        }

//        for(Map.Entry<Integer,String> entry: studentData.entrySet()){
//
//        }

        String num="SUSHant";
        System.out.println(num.hashCode());
    }
}
