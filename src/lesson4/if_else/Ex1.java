package lesson4.if_else;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введитье строку");
        String string = in.nextLine();
        int count = string.split(" ").length;
        if(count>12&&count<20&&count%3!=0){
            System.out.println("блок 1");
        } else if (count>3&&count<9&&count%2==0){
            System.out.println("блок 2");
        } else if (count==3) {
            System.out.println("блок 3");
        } else {
            System.out.println("ничего");
        }

    }
}
