package lesson7.classp;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.name="Asus";
        System.out.println(computer.getName());
        computer.setName("Apple");
        System.out.println(computer.getName());

        Computer computer2 = new Computer();
        computer2.name="Asus";

        System.out.println(computer2.name+computer.name);

    }
}
