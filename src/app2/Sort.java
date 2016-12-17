package app2;

import java.util.Arrays;

/**
 * Created by user on 10.12.2016.
 */
public class Sort {
    public static void main(String[] args) {


        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
//Сортируем массив
        Arrays.sort(arr);
//Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
