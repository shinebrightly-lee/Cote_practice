package programers.success;

import java.util.*;

public class Q_12939 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length-1]);
    }
}
