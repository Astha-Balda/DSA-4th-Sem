//package Basics;
import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 50, 60};
        int ele = 30;
        int index = 2;
        int n = arr.length;

        int newArr[] = new int[n + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = ele;

        for (int i = index; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after inserting element: " + Arrays.toString(newArr));
    }
}