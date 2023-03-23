package programers.success;

import java.util.*;

public class Q_134240 {
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        String str1 = "";
        String str2 = "";
        for(int i = 1; i < food.length; i++){
            food[i] = food[i]/2;
            for(int j = 1; j <= food[i]; j++ ){
                str1 += Integer.toString(i);
                str2 = Integer.toString(i)+str2;
            }
        }
        System.out.println(str1 + "0" + str2);
    }
}
