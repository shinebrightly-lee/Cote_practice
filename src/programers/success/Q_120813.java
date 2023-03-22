package programers.success;

import java.util.*;

public class Q_120813 {
    public static void main(String[] args) {
        int n = 8;
        int[] answer = new int[ n%2 == 0 ? n/2 : (n/2)+1 ];
        int idx = 0;
        for(int i = 0; i <= n; i++){
            if(i%2 == 1){
                answer[idx] = i;
                idx++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
