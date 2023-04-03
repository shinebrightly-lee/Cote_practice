package programers;

import java.util.*;

public class Q_120835 {
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] sequence_check = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            sequence_check[i] = emergency[i];
        }
        Arrays.sort(sequence_check);
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            for (int j = sequence_check.length-1; j >= 0; j--) {
                if(emergency[i] == sequence_check[j]){
                    answer[i] = emergency.length-j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

    }
}
