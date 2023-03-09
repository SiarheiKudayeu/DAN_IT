package lesson4.while_do;

public class While2 {
    public static void main(String[] args) {
        int i =0;
        while (i<10){
            if(i==3){
                i++;
                continue;
            }
            if(i==7){
                break;
            }
            System.out.println("Сообщение"+ i);
            i++;
        }
    }
}
