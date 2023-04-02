package lesson10.hm;

public class Main {
    public static void main(String[] args) {
        Converter c = new Converter("kjkj");

        System.out.println(1+c.convertToInt(222.323));
        c.array(new int[]{1,2,4,6});
    }
}
