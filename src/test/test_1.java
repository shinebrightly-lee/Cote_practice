package test;

import java.util.*;

public class test_1 {
    public static void main(String[] args) {
        int [][] testArray1 = {{0,0,0},{0,0,0},{0,0,0}};
        for (int i = 0; i < testArray1.length; i++){
            for (int j = 0; j < testArray1[i].length; j++){
                testArray1[i][j] = 1;
                testArray1[i][i] = 10;
                testArray1[i][(testArray1.length-1)-i] = 10;
            }
            System.out.println(Arrays.toString(testArray1[i]));
        }
    }
}
