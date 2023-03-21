package lesson8.recurs;

import java.util.Scanner;

public class Recurs {
    //Используя рекурсию напишите метод, который будет выводить введенное число в обратном порядке, так чтобы каждая
    //  цифра писалась два раза, после ставился пробел, и вторая цифра тоже писалась два раза и после ставился пробел...
    //  Пример: вы вводите 563
    //  вывод будет следующий 33 66 55
    static void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        recurs(input.nextInt());
    }
    static void recurs(int number){
        System.out.print((number%10)+""+(number%10)+" ");
        if(number/10==0){
        }else{
            number=number/10;
            recurs(number);
        }

    }
    public static void main(String[] args) {
        input();
    }

}

