package com.gmail.box.avpog;

import com.gmail.box.avpog.Tools.Sorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AppTest {

    @Test
    void testArrIntSort() {
        //given

        int[] arr = {2, 0, 5, 11, 8, 10};
        int[] expectedArr = {0, 2, 5, 8, 10, 11};
        //when

        Sorting.bubbleIntSort(arr);

        //then

        assertArrayEquals(expectedArr, arr);

    }

}