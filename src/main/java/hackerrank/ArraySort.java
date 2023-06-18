package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = {10, 12, 3, 144, 5};
        int temp;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {//5<3
                    temp = arr[i];//temp=10
                    arr[i] = arr[j];//arr[i]=3
                    arr[j] = temp;//arr[j]=10
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

    }
}
