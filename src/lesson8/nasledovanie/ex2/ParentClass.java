package lesson8.nasledovanie.ex2;

public class ParentClass {
    public String a;
    public String b;
    public int x;

    public ParentClass(String a, String b, int x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public void dosmth(){
        System.out.println("Я метод родителя");
    }
    void dosmthTwo(){
        System.out.println("Я метод родителя 2");
    }
}
