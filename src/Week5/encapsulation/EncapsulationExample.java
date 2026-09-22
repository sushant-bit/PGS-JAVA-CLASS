package Week5.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        User superadmin=new User();
        superadmin.setAge(24);
        System.out.println(superadmin.getAge());
        User admin = new User();
        admin.setAge(-100);
        System.out.println(admin.getAge());

        User departmentHead=new User();
        departmentHead.setAge(10000);
        System.out.println(departmentHead.getAge());


    }
}
