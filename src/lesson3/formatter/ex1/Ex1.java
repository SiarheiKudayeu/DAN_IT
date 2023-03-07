package lesson3.formatter.ex1;

public class Ex1 {
    public static void main(String[] args) {
        String string1 = "Мое имя {name}. Мой возраст {age}. Но чувствую я себя на все {newAge}.";
        String string2 = string1.replace("{name}","%1$s")
                .replace("{age}","%2$d")
                .replace("{newAge}","%3$d");
        System.out.printf(string2,"Сергей",31,100);
    }
}
