package lesson9.nasled;

public class Telegram extends Messenger{
    public Telegram(int space){
        super("Telegram", 1.0,space);
    }
    public Telegram(){
        super();
    }

    public void launch(){
        System.out.println("Ваш Telegram запущен");
    }
    public void shutDown(){
        System.out.println("Ваш Telegram закрыт");
    }
    public void shutDown(String s){
        System.out.println("Ваш Telegram закрыт" + s);
    }

    public boolean canMakeVideCall(){
        System.out.println("Я могу делать видео звонок");
        return true;
    }
    public void getInfo(){
        System.out.println("Имя приложения "+super.getName());
        System.out.println("Версия приложения "+super.getVersion());
        System.out.println("Размер приложения "+super.getSpace());
    }
}
