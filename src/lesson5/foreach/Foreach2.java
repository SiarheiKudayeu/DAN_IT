package lesson5.foreach;

public class Foreach2 {
    public static void main(String[] args) {
       /* String[] strings = {"one","two","three","four"};
        for (String x:strings){
            System.out.println(x);
        }*/
        int[] ints = new int[6];

        for(int number: ints){
            number=((int) (Math.random() * 11));
        }

        for (int i =0; i<ints.length;i++){
            ints[i]= ((int) (Math.random() * 11)-10);
        }

        for(int number: ints){
            System.out.println(number);
        }

    }
}
