package lesson9.nasled;

public class Main {
    public static void main(String[] args) {
        Telegram tel = new Telegram(300);
        //tel.shutDown();
        Messenger mes = new Messenger("Messnger",1.8,250);
        System.out.println(mes.getName()+" "+mes.getVersion()+" "+mes.getSpace());
        //System.out.println(tel.canMakeVideCall());
        tel.getInfo();
        Telegram tel2 = new Telegram();
        tel2.getInfo();
    }
}
