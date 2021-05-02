package com.sukhoverka;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int x = 1;
        int result = new BinarySearch().searchRecursive(arr, x);
        String arrString = Arrays.toString(arr);
        String outputMessage = result == -1 ? x + " is not found in " + arrString :
                x + " found at position " + result + " in " + arrString;
        System.out.println(outputMessage);
    }

    public int searchRecursive(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        return searchRecursive0(arr, s, e, x);
    }

    public int searchRecursive0(int[] arr, int s, int e, int x) {
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
            return searchRecursive0(arr, cen + 1, e, x);
        } else {
            return searchRecursive0(arr, s, cen - 1, x);
        }
    }

    public int searchWithLoop(int[] arr, int x) {
        int e = arr.length;
        for (int s = 0; s != e; ) {
            int cen = (s + e) / 2;
            if (arr[cen] == x) {
                return cen;
            }
            if (x > arr[cen]) {
                s = cen + 1;
            } else {
                e = cen - 1;
            }
        }
        return arr[e] == x ? e : -1;
    }

}
