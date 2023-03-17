package lesson4.while_do;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Написать проограмму, условно для склада приема металла. Представим, что склад
        //может хранить определенный вес металла. Пользователь вводит с
        //клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
        //с клавиатуры вес, который условно собирается сдать на склад пользователь.
        //Программа должна после каждой сдачи металла показывать сколько веса еще может принять
        //склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
        //то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
        //Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
        //о невозможности приемки такого малого веса. Программа завершается, когда
        //место на складе закончилось.

        Scanner in = new Scanner(System.in);
        System.out.println("Вес склада");
        int vesSklada = in.nextInt();
        while(vesSklada<5){
            System.out.println("Вес склада");
            int vesSklada2 = in.nextInt();
            vesSklada=vesSklada2;
        }
        while (vesSklada!=0){
            System.out.println("Введите сколько сдать");
            int ves = in.nextInt();
            while(ves<5){
                System.out.println("Введите сколько сдать");
                int ves2 = in.nextInt();
                ves=ves2;
            }
            if((vesSklada-ves)<0){
                System.out.println("Веса осталось "+vesSklada);
                continue;
            } else if ((vesSklada-ves)>=1&&(vesSklada-ves)<=4) {
                System.out.println("Веса осталось "+vesSklada);
                continue;
            }
            vesSklada=vesSklada-ves;

            System.out.println("Веса осталось "+vesSklada);
        }
    }
}
