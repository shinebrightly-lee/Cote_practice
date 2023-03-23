package programers;

import java.util.*;

public class Q_42586 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        for (int i = 0; i < progresses.length; i++){
            progresses[i] = (100-progresses[i])%speeds[i] == 0 ?
                    (100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i]+1;
        }
        String str = "";
        int count = 0;
        int num = 0;
        for (int i = 0; i < progresses.length; i++){
            if (i==0){ num = progresses[0];
            }else if (progresses[i] > num){
                num = progresses[i];
                str += count + " ";
                count = 0;
            }
            count++;
        }
        str += count;
        String[] arr = str.split(" ");
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String c : arr){
            answer[idx] = Integer.parseInt(c);
            idx++;
        }
        System.out.println(Arrays.toString(answer));
    }
}
