package lesson5;

import java.util.Scanner;

public class SwitchCaseEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ввести прогр и ос");
        String prom = in.next();
        String os = in.next();
        switch (prom){
            case ("i"):
                switch (os){
                    case ("m"):
                        System.out.println("i - m");
                        break;
                    case ("w"):
                        System.out.println("i - w");
                        break;
                    case ("l"):
                        System.out.println("i - l");
                        break;
                    default:
                        System.out.println("данной ос не сущ");
                        break;
                }
                break;
            case ("j"):
                switch (os){
                    case ("m"):
                        System.out.println("j - m");
                        break;
                    case ("w"):
                        System.out.println("j - w");
                        break;
                    case ("l"):
                        System.out.println("j - l");
                        break;
                    default:
                        System.out.println("данной ос не сущ");
                        break;
                }
                break;
            case ("g"):
                switch (os){
                    case ("m"):
                        System.out.println("g - m");
                        break;
                    case ("w"):
                        System.out.println("g - w");
                        break;
                    case ("l"):
                        System.out.println("g - l");
                        break;
                    default:
                        System.out.println("данной ос не сущ");
                        break;
                }
                break;
            default:
                System.out.println("данной прог не сущ");
                break;

        }



    }
}
