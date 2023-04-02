package lesson10.Ex23;

public class Main {
    public static void main(String[] args)  {
        Person ivan = new Person(2000,"Иван",0);
        try {
            ivan.canIhaveParty(DaysOfWeek.SAT);
        }catch (NotWeekEndsException|LowSalaryException|NofriendsException e){
            System.out.println(e.getMessage());
        }

    }
}
