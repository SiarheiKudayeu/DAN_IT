package lesson5.arrays;

public class Methods {
    static public int[] arraySort(int[] ar) {

        for (int i = ar.length - 1; i >= 0; i--) {
            int max;
            for (int a = i - 1; a >= 0; a--) {
                if (ar[i] < ar[a]) {
                    max = ar[a];
                    ar[a] = ar[i];
                    ar[i] = max;
                }
            }
        }return ar;
    }

    public static void main(String[] args) {
        int[] a = {12, 34, 1, 3, 234, 54, 3};

        for (int inta : Methods.arraySort(a)) {
            System.out.print(inta + " ");
        }
    }
}
