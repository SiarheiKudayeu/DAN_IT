package lesson9.nasled;

public class Messenger {
    public String name;
    public double version;
    public   int space;
    public void launch(){
        System.out.println("Ваш Messenger запущен");
    }
    public void shutDown(){
        System.out.println("Ваш Messenger закрыт");
    }
    public boolean canMakeVideCall(){
        System.out.println("Я не могу делать видео звонок");
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
    public Messenger(String name, double version, int space){
        this.name = name;
        this.version = version;
        this.space = space;

    }
    public Messenger(){
        this.space=500;
    }

}
