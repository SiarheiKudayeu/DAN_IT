package lesson4.while_do;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
         /*while(условие)
    {
        тело цикло выполняется до тех пор пока
        условие true
    }*/
        //break выходит из цикла
        //continue завершает итерацию и уходит на следующий круг

        //Пример у вас соц сеть в которую можно загружать фотографии
        //у пользователя с консоли спрашивают сколько фотографий
        //он хотел бы загрузить в свой альбом
        //но есть ограничение по размеру альбома в 100 фотографий
        Scanner in = new Scanner(System.in);
        int countOfPhoto =0;
        while (countOfPhoto<=100){
            if((100-countOfPhoto)==0){
                break;
            }
            System.out.println("Сколько фото загрузить?");
            int temp = in.nextInt();
            if((countOfPhoto+temp)>100) {
                System.out.println("такое кол-во фото не влезет");
                System.out.println("Осталось места на "+(100-countOfPhoto));
                continue;
            }
            countOfPhoto=countOfPhoto+temp;
            /*if(countOfPhoto>100){
                System.out.println("такое кол-во фото не влезет");
                continue;
            }*/
            System.out.println("Осталось места на "+(100-countOfPhoto));
        }


    }

}
