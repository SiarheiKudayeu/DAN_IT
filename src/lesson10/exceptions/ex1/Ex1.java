package lesson10.exceptions.ex1;

public class Ex1 {
    public static void main(String[] args) {
        int[] count = new int[5];
        try {
            System.out.println(count[12]);
        } catch (ArrayIndexOutOfBoundsException name){
            System.out.println(name.getMessage());
        } finally {
            System.out.println("Блок finally");
        }

        System.out.println("сообщения");
    }
}
