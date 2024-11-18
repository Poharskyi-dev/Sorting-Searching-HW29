package com.gmail.box.avpog;

import com.gmail.box.avpog.Tools.Searching;
import com.gmail.box.avpog.Tools.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AppTest {

    @Test
    void testArrIntSort() {

        // given
        int[] arr = {2, 0, 5, 11, 8, 10};
        int[] expectedArr = {0, 2, 5, 8, 10, 11};
        // when
        Sorting.bubbleIntSort(arr);
        // then
        assertArrayEquals(expectedArr, arr);

    }

    @Test
    void testBinnarySearchResultNormal() {
        // given
        int[] arr = {-56, -10, 0, 2, 5, 8, 10, 11, 16, 23, 34, 142, 221, 1002, 12345};
        // when
        int expectedInx = 3;
        // then
        Assertions.assertEquals(expectedInx, Searching.binarySearch(arr, 2));

    }

    @Test
    void testBinnarySearchResultDoesntFind() {
        // given
        int[] arr = {-56, -10, 0, 2, 5, 8, 10, 11, 16, 23, 34, 142, 221, 1002, 12345};
        // when
        int expectedInx = -1;
        // then
        Assertions.assertEquals(expectedInx, Searching.binarySearch(arr, -9));

    }

}