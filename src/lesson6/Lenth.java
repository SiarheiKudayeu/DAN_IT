package lesson6;

import java.util.ArrayList;

public class Lenth {
    public static void main(String[] args) {
        String string ="Просто строка";
        String [] strings = {"GFirst","Gsecond","Gthird"};
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("First");

        System.out.println(string.length());
        System.out.println(strings.length);
        System.out.println(stringList.size());
    }
}
