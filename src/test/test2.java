package test;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int[] list = new int[n*2];
        int result = 0;
        for(int i = 0; i < list.length; i++){
            list[i] = 2;
            String str = sc.nextLine();
        }
        for (int i = 1; i < list.length; i++){
            result += list[i-1]*list[i];
            i++;
        }
        String Y_N = result == total ? "YES" : "NO";
        System.out.println(Y_N);
    }
}
