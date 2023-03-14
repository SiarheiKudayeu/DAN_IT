package lesson5.forcycle;

import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        //Цикл for также называют циклом со счётчиком.
        // В случае, когда вам известно какое количество
        // раз необходимо выполнить одно и тоже действие
        // необходимо использовать цикл for.
        /*for (int a = 1; a <= 5; a++) {
            System.out.println("Итерация под номером " + a);
        }*/

        //вывести на консоль отдельными строками все слова из текста,
        //который введет пользователь
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = text.split("\\s");
        for (int i = 0; i< words.length; i++){
            System.out.println(words[i].toLowerCase()
                    .replace(",","")
                    .replace(".",""));
        }








        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите");
        String message = in.nextLine();
        for (int i = 0; i < message.split(" ").length; i++) {
            System.out.println(message.split(" ")[i]
                    .replace(",", "")
                    .replace(".", "")
                    .toLowerCase());
        }*/
    }

}
