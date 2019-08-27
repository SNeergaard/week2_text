package com.example.week2_test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class testPart1 {

    public static void main(String[] args) {
        int [] array = {2,8,9,3,4,3,2,6,6,2,4,9,8};
        int temp;
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
