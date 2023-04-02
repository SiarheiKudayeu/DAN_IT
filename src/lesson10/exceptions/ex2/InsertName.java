package lesson10.exceptions.ex2;

import java.util.Scanner;

public class InsertName {

    public void insertName() throws NoSuchMAilException {
        String mail = "alalala@mail.com";
        Scanner in = new Scanner(System.in);
        System.out.println("email");
        String email = in.nextLine();

            if (email.equals(mail)) {
                throw new NoSuchMAilException();


    }System.out.println("Принято");}
    public static void main(String[] args) {
        String mail = "alalala@mail.com";
        Scanner in = new Scanner(System.in);
        System.out.println("email");
        String email = in.nextLine();
        try {
            if (email.equals(mail)) {
                throw new NoSuchMAilException();
        }
            System.out.println("Ваш эмейл принят");
        }catch (NoSuchMAilException e){
            System.out.println(e.getMessage());
        }



    }
}


