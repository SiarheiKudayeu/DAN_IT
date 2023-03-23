package lesson9.staticles.ex1;

public class JustClass {
    public static String staticString;
    public static int staticInt;

    public String nonStaticString;
    public  int nonStaticInt;

    public static void staticMethod(){
        System.out.println("Static method");
        //nonStaticMethod();
        //System.out.println(staticInt+" "+nonStaticInt);
    }
    public void nonStaticMethod(){
        System.out.println("NonStatic method");
        staticMethod();
        System.out.println(staticInt+" "+nonStaticInt);
    }

}
