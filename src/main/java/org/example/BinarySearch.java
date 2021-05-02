package org.example;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int x = 1;
        int result = new BinarySearch().search(arr, 0, arr.length - 1, x);
        String arrString = Arrays.toString(arr);
        String outputMessage = result == -1 ? x + " is not found in " + arrString :
                x + " found at position " + result + " in " + arrString;
        System.out.println(outputMessage);
    }

    public int search(int[] arr, int s, int e, int x) {
        if (s == e) {
            if (arr[s] == x) {
                return s;
            } else {
                return -1;
            }
        }

        int cen = (s + e) / 2;
        if (arr[cen] == x) {
            return cen;
        }
        if (x > arr[cen]) {
            return search(arr, cen + 1, e, x);
        } else {
            return search(arr, s, cen - 1, x);
        }
    }

}
