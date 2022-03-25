import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MajorityElement {

//    Problem Description
//
//    Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
//    You may assume that the array is non-empty and the majority element always exist in the array.
//
//    Example :
//
//    Input : [2, 1, 2]
//    Return  : 2 which occurs 2 times which is greater than 3/2.

    public static void main(String[] args) {
        int[] arr = {2, 1, 2};

        for (int j : arr) {

            int occurrence = 0;

            for (int a : arr) {
                if (j == a) {
                    occurrence++;
                }

            }

            if (occurrence > 1) {
                System.out.println(j + " which occurs " + occurrence + " times which is greater than " + arr.length + " / " + occurrence);
                break;
            }

        }

    }

}
