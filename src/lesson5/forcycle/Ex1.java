package lesson5.forcycle;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Ввести с клавиатуры несколько предложений.
        //Вывести на экран среднее количество слов в данных предложениях.
        //Вывести в консоль среднюю длину слова в каждом предложении.


        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        double countOfSent = text.split("\\.").length;
        double countOfWords = text.replace(".","")
                .replace(",","").split("\\s")
                .length;

        System.out.println("Среднне кол-во слов в предложениях "+countOfWords/countOfSent);

        for(int i = 0;i<text.split("\\.").length;i++){
            double coutofwords = text.split("\\.")[i].split("\\s").length;
            double countOfChar = text.split("\\.")[i].replace(" ","")
                    .replace(",","").length();
            System.out.println("Средняя длина слова в предложении "+(i+1)+" "+ countOfChar/coutofwords);

        }









        //Вариант страшный
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        int generalCount = (text.split("\\s").length)/(text.split("\\.").length);
        for (int i =0; i<text.split("\\.").length; i++){
            int lenthwordsForThisSentance = 0;
            for(int a = 0; a<text.split("\\.")[i].split(" ").length; a++){
               lenthwordsForThisSentance=lenthwordsForThisSentance+
                       text.split("\\.")[i].split(" ")[a].replace(",","").length();
            }
            System.out.println("Средняя длина слова в предложении номер "+(i+1)+ " равна "+
                    lenthwordsForThisSentance/(text.split("\\.")[i].split(" ").length));
        }*/

        //Вариант проще
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        int generalCount = (text.split("\\s").length)/(text.split("\\.").length);
        System.out.println(text.split("\\.").length);
        for (int i = 0; i<text.split("\\.").length;i++){
            int result = (text.split("\\.")[i].replace(" ","")
                    .replace(",","").length())/text.split("\\.")[i].split("\\s").length;
            System.out.println("Средняя длина слова в предложении номер "+(i+1)+ "равна "+result);
        }*/
    }
}
