package lesson9.staticles.ex4;

public class ClassA {
    public ClassA(){
        System.out.println("Конструктор класса А");
    }
    {
        System.out.println("Динамический блок класса А");
    }
    static {
        System.out.println("Статический блок класса А");
    }


}
