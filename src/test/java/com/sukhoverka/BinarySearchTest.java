package com.sukhoverka;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void shouldSearchRecursive() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        assertThat(binarySearch.searchRecursive(arr, 1), is(0));
        assertThat(binarySearch.searchRecursive(arr, 2), is(1));
        assertThat(binarySearch.searchRecursive(arr, 3), is(2));
        assertThat(binarySearch.searchRecursive(arr, 4), is(3));
        assertThat(binarySearch.searchRecursive(arr, 5), is(4));
    }

    @Test
    public void shouldSearchWithLoop() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        assertThat(binarySearch.searchWithLoop(arr, 1), is(0));
        assertThat(binarySearch.searchWithLoop(arr, 2), is(1));
        assertThat(binarySearch.searchWithLoop(arr, 3), is(2));
        assertThat(binarySearch.searchWithLoop(arr, 4), is(3));
        assertThat(binarySearch.searchWithLoop(arr, 5), is(4));
    }
}
