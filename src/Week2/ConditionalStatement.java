package Week2;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age=18;
        if(age<18){
            System.out.println("Bauwa 18 pug aur vote dalne chale aaa.");
        } else {
            System.out.println("Hogaya 18 daldo vote permission de diye.");
        }

        int din=10;
        if(din==1){
            System.out.println("Sunday");
        } else if (din==2) {
            System.out.println("Monday");
        } else if (din==3) {
            System.out.println("Tuesday");
        } else if (din==4) {
            System.out.println("Wednesday");
        } else if (din==5) {
            System.out.println("Thursday");
        } else if (din==6) {
            System.out.println("Friday");
        } else if (din==7) {
            System.out.println("Saturday");
        }else{
            System.out.println("Abeyyyyy 7 Din se uppar nahi hota niche number daal");
        }


        //ternary operator

        int numu=40;
        String result=60%2==0?"even":"odd";


    }
}
