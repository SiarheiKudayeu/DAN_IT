package lesson9.interfaceles.ex1;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        Student student = new Student();
        child.read();
        student.read();
        child.breathe();
        student.breathe();
    }
}
