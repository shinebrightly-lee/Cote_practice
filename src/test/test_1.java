package test;

import java.math.*;
import java.util.*;

public class test_1 {
    public static void main(String[] args) {
//        String[] array = {"n", "nav", "nev"};
//        String s = "naver";
//        int answer = 0;
//        String str = s;
//        for(String arr : array){
//            System.out.println();
////            System.out.println(arr.concat(str.substring(arr.length())));
//            answer += arr.concat(str.substring(arr.length())).equals(s) ? 1 : 0;
////            answer += s.substring(0, arr.length()).equals(arr) ? 1 : 0;
//        }
//        System.out.println(answer);
        int[] A = {1,2,3,4,5};
        int K = 1;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < A.length ; i++) {
            for (int j = 0; j < A.length; j++) {
                if(i==j) continue;
                set.add(A[i]+""+A[j]);
            }
        }

        String[] strArr = set.toArray(new String[0]);
        System.out.println(Arrays.toString(strArr));
        int[] intArr = new int[strArr.length];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(intArr[intArr.length-1]);
    }
}
