package com.gmail.box.avpog;

import com.gmail.box.avpog.Tools.Searching;
import com.gmail.box.avpog.Utils.Util;
import com.gmail.box.avpog.Tools.Sorting;

public class App {

    public static void main(String[] args) {

        int[] arr = {2, 0, 5, 11, 8, 10};

        Util.arrIntPrint(arr);

        Sorting.bubbleIntSort(arr);

        //Util.arrIntPrint(arr);

        // System.out.println(arr.length);

        int[] arr2 = {1, 3, 5, 11, 15, 100};

        System.out.println(Searching.binarySearch(arr2, 100));
    }


}

