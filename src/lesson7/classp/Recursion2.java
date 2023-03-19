package lesson7.classp;

public class Recursion2 {
    static void credit(int creditsum, int sum){
        System.out.println(creditsum);
        creditsum=creditsum-sum;
        if (creditsum<0){
            System.out.println("Кредит выплачен");
        }else {
            credit(creditsum,sum);
        }

    }
    static void credit(int creditsum){
        int sum = 200;
        System.out.println(creditsum);
        creditsum=creditsum-sum;
        if (creditsum<0){
            //System.out.println("Кредит выплачен");
        }else {
            credit(creditsum);
        }

    }

    public static void main(String[] args) {
        credit(2000,500);
        credit(2000);
    }
}
