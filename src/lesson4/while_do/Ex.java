package lesson4.while_do;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        //при помощи цикла while вывести на консоль все четные числа из
        //диапазона натуральных чисел, которые пользователь вводит с клавиатуры.
        //Тобишь пользователь с клавиатуры залает два числа, а на консоль выводится
        //все четные числа из этого диапазона.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();
        while (a<b){
            if(a%2==0){
                System.out.println(a);
                a++;
                continue;
            }
            a++;
        }

    }
}
