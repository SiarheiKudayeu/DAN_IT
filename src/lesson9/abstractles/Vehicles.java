package lesson9.abstractles;

public abstract class Vehicles {
    String name;

    void takeFuel() {
        System.out.println("Я заправился");
    }
    abstract void move();
    abstract void inter();
}
