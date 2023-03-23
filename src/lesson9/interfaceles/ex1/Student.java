package lesson9.interfaceles.ex1;

public class Student implements GetInfo{
    public void read() {
        System.out.println("Читает быстро");
    }
    public void listen(){
        System.out.println("Слушает внимательно");
    }
    public void watch(){
        System.out.println("Смотрит дискавери");
    }
}
