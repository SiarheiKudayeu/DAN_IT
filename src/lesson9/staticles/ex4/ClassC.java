package lesson9.staticles.ex4;

public class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Конструктор класса C");
    }
    {
        System.out.println("Динамический блок класса C");
    }
    static {
        System.out.println("Статический блок класса C");
    }
}
