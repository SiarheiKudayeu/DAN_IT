package lesson9.staticles.ex2;

public class JustClassStaticBlock {
    static String day;



    static void thisISMonday(){
//        day= "Monday";
        System.out.println("But today is "+day);
    }
    static {
        day = "XXXXXX";
        System.out.println("I love " + day);
    }
    static {
        day = "Tuesday";
        System.out.println("I love " + day);
    }
}
