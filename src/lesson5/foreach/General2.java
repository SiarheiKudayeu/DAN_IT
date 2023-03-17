package lesson5.foreach;

import java.util.Scanner;

public class General2 {
    //    //Пользователь задает размерность двумерного массива с клавиатуры.
    //    //Массив заполняется случайными числами от 0 до 1000.
    //    //Необходимо создать одномерный массив, состоящий из максимальных значений
    //    //каждого отдельного массива входящего в двумерный.
    //    //Новый полученный массив вывести на экран.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int first = in.nextInt();
        int second = in.nextInt();
        int[][] firstarray = new int[first][second];
        //ints[i]= ((int) (Math.random() * 11)-10);
        for(int[] ints:firstarray){
            for (int i = 0; i<ints.length;i++){
                ints[i]= ((int) (Math.random() * 1001));
            }
        }
        /*for (int[] ints:firstarray){
            for (int number:ints){
                System.out.print(number+" ");
            }
            System.out.println("");
        }*/
        int [] finalArray =new int[first];
        for(int i = 0; i<finalArray.length;i++){
            int max=firstarray[i][0];
            for (int numbersq:firstarray[i]){
                if(numbersq>max){
                    max=numbersq;
                }
                finalArray[i]=max;
            }
        }
        for (int[] ints:firstarray){
            for (int number:ints){
                System.out.print(number+" ");
            }
            System.out.println("");
        }

        for (int num:finalArray){
            System.out.print(num+" ");
        }

    }
}
