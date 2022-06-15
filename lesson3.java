package HomeWork.lesson3;

public class lesson3 {
    public static void main(String [] args)
    {
        //Count();
        //Change();
        //Multiplication6();
        //TwoDimensionalIntegerArray();
        //OneDimensionalArray(5, 1);
    }
    public static void Change() {
        int[] arr = { 0, 0, 1, 0, 1, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Math.abs(arr[i]-1));
        }
    }
    public static void Count() {
    int[] arr = new int [100];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i;
        System.out.println(arr[i] + 1);
    }
    }
    public static void Multiplication6() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i]*2);
            }
        }
    }
    public static void TwoDimensionalIntegerArray() {
        int counter = 1;
        int size = 4;
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = counter;
                if (i==j) {
                    table[i][j] = 1; } {
                    if (i + j == size - 1){
                        table[i][j] = 1;
                    }
                }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void OneDimensionalArray(int len, int initialValue) {
        int[] table = new int[len];
        for (int i = 0; i<len; i++) {
            table[i] = initialValue;
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

}
