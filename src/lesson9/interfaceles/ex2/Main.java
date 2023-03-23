package lesson9.interfaceles.ex2;

public class Main implements Inter4{
    @Override
    public void inter1() {
        System.out.println("inter1()");
    }

    @Override
    public void inter2() {
        System.out.println("inter2()");
    }

    @Override
    public void inter3() {
        System.out.println("inter3()");
    }

    @Override
    public void inter4() {
        System.out.println("inter4()");
    }

    public static void main(String[] args) {
        Main n = new Main();
        n.inter1();
        n.inter2();
        n.inter3();
        n.inter4();
    }
}
