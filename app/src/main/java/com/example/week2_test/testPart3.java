package com.example.week2_test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class testPart3 {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<String>();
        String[][] base = new String[][]{{"a", "b", "c"}, {"d", "e", "f"}, {"g", "a", "b"}};
        for(int row=0; row < base.length; row++) {
            for (int col = 0; col < base[row].length; col++) {
                String target = base[row][col];
                for (int i = 0; i < base.length; i++) {
                    for (int j = 0; j < base[i].length; j++) {
                        if (target == base[i][j] && i != row && j !=col){
                            result.add(i + "," + j);
                        }
                    }
                }
            }
        }
        System.out.println(result);
        Set<String> set = new HashSet<>(result);
        result.clear();
        result.addAll(set);
        System.out.println(set);

    }


}
