package Week6;

public class OuterClass {
    int x=10;
    class InnerClass{
        int y=0;
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass innerClass=outer.new InnerClass();
        System.out.println(outer.x);
        System.out.println(innerClass.y);

    }
}

