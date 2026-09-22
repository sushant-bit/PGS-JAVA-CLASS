package Week5.encapsulation;

public class User {
   private String name;
    private int age;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0||age>125){
            System.out.println("Invalid Age");

        }else {
            this.age = age;
        }

    }

    public void auth(){
        System.out.println("Authentication. ");
    }
}
