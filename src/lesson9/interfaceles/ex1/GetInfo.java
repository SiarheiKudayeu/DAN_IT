package lesson9.interfaceles.ex1;

public interface GetInfo {
    void read();
    void listen();
    void watch();

    default void breathe(){
        System.out.println("Я умею дышать");
    }

}
