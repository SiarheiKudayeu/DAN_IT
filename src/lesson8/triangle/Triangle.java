package lesson8.triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number of *");
        int count = in.nextInt();
        for(int i = count; i>0;i--){
            for(int a = 0; a<i;a++){
                if(a==0||a==i-1||i==count){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
