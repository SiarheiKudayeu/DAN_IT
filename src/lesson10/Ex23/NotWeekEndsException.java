package lesson10.Ex23;

public class NotWeekEndsException extends Exception{
    public String getMessage(){
        return "Сегодня рабочий день";
    }
}
