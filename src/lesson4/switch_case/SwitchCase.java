package lesson4.switch_case;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
      /*switch(переменная для сравнения)
    {
        case значение1:
            (код для выполнения при равенстве переменной и значения);
            break;
        case значение1:
            (код для выполнения при равенстве переменной и значения);
            break;
        default:
            (код для если не возникло ни одного совпадения);
    }*/

        //вывод вашей профессии на консоль в связи с тем, что вы укажете с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.println("Введитье профессию");
        String string = in.nextLine();
        switch (string.toUpperCase()){
            case ("AQA"):
            case ("QA"):
                System.out.println("Поздравляю ты тестировщик");
                break;
            case ("FRONT"):
            case ("DEV"):
                System.out.println("Поздравляю ты разработчик");
                break;
            case ("RM"):
            case ("MAN"):
                System.out.println("Поздравляю ты менеджер");
                break;
            default:
                System.out.println("Ты никто");
        }


    }


}
