package lesson9.staticles.ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println(JustClass.staticInt);
        //System.out.println(JustClass.nonStaticInt);
        JustClass justClass = new JustClass();
        justClass.nonStaticMethod();
        justClass.staticMethod();
    }
}
