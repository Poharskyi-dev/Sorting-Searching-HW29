package com.gmail.box.avpog.Tools;

public class Searching {
    public static int binarySearch(int arr[], int request) {
        int arrLeftIdx = 0;
        int arrRightIdx = arr.length - 1;

        while (arrLeftIdx <= arrRightIdx) {
            int arrMidIdx = (arrLeftIdx + arrRightIdx) / 2;

            if (arr[arrMidIdx] == request) {
                return arrMidIdx;
            }

            if (arr[arrMidIdx] > request) {
                arrRightIdx = arrMidIdx - 1;
            }

            if (arr[arrMidIdx] < request) {
                arrLeftIdx = arrMidIdx + 1;
            }


        }

        return -1;
    }
}

