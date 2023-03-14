package lesson5.arrays;

public class General {
    public static void main(String[] args) {
        //Массив – это структура данныx, хранящее определенное количество элементов одного типа.
        //По умолчанию все значения массива 0, либо null в зависимости от типа объекта
        //Способы инициализации массива:

        //1)Вручную:
        /*int [] array = new int[4];
         *//*array[0]=14;
        array[1]=1;
        array[2]=13;
        array[3]=15;*//*
        for (int i =0;i<array.length;i++){
            array[i]=i*2;
            System.out.println(array[i]);
        }*/

        //2)for

        //3){}
        /*int[] array = {12, 3, 43, 11};
        System.out.println(array.length);*/

        String[] arrayString = {"First","Second","Third"};
        arrayString[1]="НЕ Second";
        System.out.println(arrayString[1]);

        //Вывести все элементы массива используя цикл for

        //Заполнить одномерный массив из 10 элементов случайными числами из
        //диапазона от -10 до 10.

        int[] array = new int[10];
        for (int i =0; i<array.length;i++){
            array[i]= ((int) (Math.random() * 11)+10);
            System.out.print(array[i]+" ");
        }









        /*int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21)-10);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }*/

        // Многомерные массивы.
        // Двумерный массив – это массив массивов.

    }

}
