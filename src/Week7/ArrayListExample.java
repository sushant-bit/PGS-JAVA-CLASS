package Week7;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        names.add("Sushant");
        names.add("Manish");
        names.add("unique");
        names.add("Madan");
        names.add(3,"Henry");//shifting
        names.set(2,"Lalu");//replace the value

        names.remove(1);
        names.remove("Manish");

//        System.out.println(names.get(0));

//        for (int i = 0; i < names.toArray().length; i++) {
//            System.out.println(names.get(i));
//
//        }
        for(String name:names){
            System.out.println(name);
        }
    }
}
