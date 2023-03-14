package lesson5.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Пользователь вводит строку с клавиатуры. Все цифры из данной строки
        //должны быть помещены в массив. Массив необходимо отсортировать по возрастанию
        //и вывести на экран.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String st = in.nextLine();
        String result = "";
        //System.out.println(st.split("\\d").length);
        //проверяем что в данном массиве есть хоть одно числовое значение
        if (st.split("\\d").length == 1) {
            System.out.println("В данной строке нет цифр");
        } else {
            //проходимся по всем символам строки.
            for (int i = 0; i < st.length(); i++) {
                if (Character.isDigit(st.charAt(i))) {
                    result = result + st.charAt(i);
                    if (i + 1 != st.length() && Character.isDigit(st.charAt(i + 1))) {
                        while ((i + 1 != st.length()) && Character.isDigit(st.charAt(i + 1))) {
                            i = i + 1;
                            result = result + st.charAt(i);
                        }
                    }
                    result = result + " ";
                }
            }
        }
        //Разбивае полученную строку на массив строк, и создаем новый массив
        //на основе полученного из целочисленных данных
        String[] numbers = result.split("\\s");
        int[] arrayFirst = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arrayFirst[i] = Integer.valueOf(numbers[i]);
            //System.out.println(arrayFirst[i]);
        }
        //Упорядочиваем данный массив по возрастанию
        for (int i = arrayFirst.length-1;i>=0;i-- ){
            for(int a = i-1; a>=0;a--){
                int temp;
                if(arrayFirst[i]<arrayFirst[a]){
                    temp=arrayFirst[i];
                    arrayFirst[i]=arrayFirst[a];
                    arrayFirst[a]=temp;
                }
            }
        }
        //Выводим в консоль элементы массива
        for (int i = 0; i<arrayFirst.length; i++){
            System.out.print(arrayFirst[i]+" ");
        }


    }
}

