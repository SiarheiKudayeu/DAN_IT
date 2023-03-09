package lesson4.ternary;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //синтаксис:
        // условие ? выражение1 : выражение2
        // оператор будет возвращать выражение 1, если условие = true
        // оператор будет возвращать выражение 2, если условие = false
        // тернарный оператор должен пригимать значение.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = in.nextInt();
        String message = age<18?"Вы несовершеннолетний гражданин":"Вы совершеннолетний гражданин";
        System.out.println(message);*/

        //Т.к. тернарный оператор возвращает значение, то при помощи него можно присваивать
        // значения переменным

       /* boolean isNew = true;
        int costOfAuto = isNew?2000:1000;
        System.out.println(costOfAuto);*/

        //Есть возможность использовать множественные тернарный оператор:
        //допустим нужно определить входит ли введенное число в интервал от 5 до 100 включительно
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        String posive = "Число "+ number+ " входит в диапазон от 5 до 100";
        String negative = "Число "+ number+ " не входит в диапазон от 5 до 100";
        System.out.println(number<5?negative:number>100?negative:posive);*/


        //При помощи тернарного оператора можно производить операции
        //Необходимо получить разность двух чисел введенных с клавиатуры,
        //и всегда отнимать от большего меньшее
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два число");
        int number = in.nextInt();
        int number2 = in.nextInt();
        System.out.println(number>number2?number-number2:number2>number?number2-number:0);





    }
}
