package lesson8.methods;

import java.util.Scanner;

public class Example {
    public int calculate(int x){
        int y = 5+x;

        return y;
    }
    public void drawTriangle(int star){
        int count = star;
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

    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.calculate(4));
        ex.drawTriangle(ex.calculate(4));

    }
}
