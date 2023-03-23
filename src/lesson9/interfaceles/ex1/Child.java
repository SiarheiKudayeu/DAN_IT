package lesson9.interfaceles.ex1;

public class Child extends Parent implements GetInfo, Go {
    public void read() {
        System.out.println("Не умеет читать");
    }
    public void listen(){
        System.out.println("Слушает невнимательно");
    }
    public void watch(){
        System.out.println("Смотрит мультики");
    }

    @Override
    public void ICanGo() {
        System.out.println("Я плохо хожу");
    }
}
