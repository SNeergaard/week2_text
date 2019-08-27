package com.example.week2_test;

import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class testPart2 {
    public static void main(String[] args) {
        String base = "frog";
        ArrayList<String> listOfCombinations = new ArrayList<>();
        listOfCombinations.add(base);


        for (int i=0 ; i<base.length(); i++) {
            ArrayList<String> tempList = new ArrayList<>();
            tempList.addAll(listOfCombinations);
            for (String s : listOfCombinations) {
                String combination = s.replace(base.charAt(i) + "","");
                tempList.add(combination);
            }
            listOfCombinations = tempList;
        }

        System.out.println(listOfCombinations.toString());


    }
}
