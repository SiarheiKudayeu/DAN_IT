package lesson5.foreach;

import java.util.Arrays;
import java.util.Scanner;

public class General {
    //Цикл for each это разновидность цикла for,
    // который используется для перебора массива
    // или коллекции без ручного изменения переменной
    // шага для перебора. Цикл for each выполняет эту работу автоматически.



    //Пользователь задает размерность двумерного массива с клавиатуры.
    //Массив заполняется случайными числами от 0 до 1000.
    //Необходимо создать одномерный массив, состоящий из максимальных значений
    //каждого отдельного массива входящего в двумерный.
    //Новый полученный массив вывести на экран.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите две цифры");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] array = new int[a][b];
        //foreach не может быть использован для внесений изменений в массив.

        /*for(int[] ints:array){
            for(int single:ints){
                single = (int) (Math.random() * 1000);
            }
        }*/

        for (int[] ints : array) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int) (Math.random() * 1000);
            }
        }

        int[] finalArray = new int[a];
         for (int i =0; i<a;i++){
             int max= array[i][0];
            for(int c=0;c<array[i].length;c++){
                if(array[i][c]>max){
                    max=array[i][c];
                }
             }finalArray[i]=max;
         }

         for (int[]ints:array){
             for (int single:ints){
                 System.out.print(single+" ");
             }
             System.out.println("");
         }
        System.out.println("");
         for (int single:finalArray){
             System.out.print(single+" ");
         }
        System.out.println("\n");

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(finalArray));
    }
}
