package lesson7.classp;

public class Recursion {
    static void printAllNumbers(int number){
        if(number==0){
            System.out.println("Ввели 0");
        }else if (number<0){
            System.out.println("Ввели отриц");
        }else {
            System.out.println(number);
            number--;
            printAllNumbers(number);
        }

    }

    public static void main(String[] args) {
        printAllNumbers(7);
    }
}
