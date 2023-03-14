package lesson5.foreach;

public class ManyArrays {
    public static void main(String[] args) {
        String [][] numbers = {{"1afs","2asf","3af"},{"4af","5af","6afa"},{"7asf","8afs","9assaf"}};
        for (String[] arraynumbers:numbers){
            for (String number:arraynumbers){
                System.out.print(number+" ");
            }
            System.out.println("");
        }
        int [][] x = new int[3][6];
        int [][] numbers2={
                {1,2,3,4,5},
                {6,7},
                {8,9,10,11,13}

        };
        for (int[] arraynumbers:numbers2){
            for (int number:arraynumbers){
                System.out.print(number+" ");
            }
            System.out.println("");
        }
    }

}
