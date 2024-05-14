package Task1;
/* 3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
 Необходимо написать программу, которая выведет в консоль все чётные числа*/


public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");

            }

        }
    }
}
