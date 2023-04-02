package lesson10.hm2;

import java.util.Scanner;

public class Calcutor {
    void summ(double first, double second){
        double result = first + second;
        System.out.println("Ответ: "+result);
    }
    void minus(double first, double second){
        double result = first - second;
        System.out.println("Ответ: "+result);
    }
    void multiply(double first, double second){
        double result = first * second;
        System.out.println("Ответ: "+result);
    }
    void division(double first, double second){
        double result = first / second;
        System.out.println("Ответ: "+result);
    }
    public void start(){
        System.out.println("Запущен");
        Scanner in = new Scanner(System.in);
        String action;
        do{
            System.out.println("Введите действ.");
            action=in.next();
            if(action.equalsIgnoreCase("stop")){
                System.out.println("Закрыт");
                break;
            }else if (action.contains("+")){
                double first = Double.parseDouble(action.split("\\+")[0]);
                double second = Double.parseDouble(action.split("\\+")[1]);
                summ(first,second);
            }else if (action.contains("-")){
                double first = Double.parseDouble(action.split("\\-")[0]);
                double second = Double.parseDouble(action.split("\\-")[1]);
                minus(first,second);
            }else if (action.contains("*")){
                double first = Double.parseDouble(action.split("\\*")[0]);
                double second = Double.parseDouble(action.split("\\*")[1]);
                multiply(first,second);
            }else if (action.contains("/")){
                double first = Double.parseDouble(action.split("\\/")[0]);
                double second = Double.parseDouble(action.split("\\/")[1]);
                division(first,second);
            }else {
                System.out.println("беле");
            }

        } while (!action.equalsIgnoreCase("stop"));
    }

}
