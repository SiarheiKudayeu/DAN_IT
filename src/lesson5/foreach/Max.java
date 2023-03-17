package lesson5.foreach;



public class Max {
    static void findmax(int[] array){
        int max=array[0];
        for (int x:array){
            if(x>max){
                max=x;
            }
        }
        System.out.println("Маскимальное значение "+max);
    }
    static int findmaxim(int[] array){
        int max=array[0];
        for (int x:array){
            if(x>max){
                max=x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]array = {1, 4, 8,1233,45,2,55};
        Max.findmax(array);
        System.out.println(Max.findmaxim(array));
        }

    }

