package lesson_nex;

import java.util.Scanner;


public class Main {
    public static void division() throws ZeroValueException, NegativeValueException {
        Scanner in = new Scanner(System.in);
        System.out.println("insert");
        int y = in.nextInt();
        if (y == 0) {
            throw new ZeroValueException();
        }
        if (12 / y < 0) {
            System.out.println(12/y);
            throw new NegativeValueException();
        }
        int x = 12/y;
        System.out.println(x);
    }





    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("insert");
        int y = in.nextInt();
        try {
            if (y == 0) {
                throw new ZeroValueException();

            }
            int x = 12 / y;
            System.out.println(x);
        } catch (ZeroValueException e) {
            System.out.println(e.getMessage());
        }*/
        try{
            division();
        } catch (ZeroValueException|NegativeValueException e){
            System.out.println(e.getMessage());
        }



    }
}

