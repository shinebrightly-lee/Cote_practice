package programers.success;

import java.util.*;

public class Q_12906 {
    public static void main(String[] args) {
        int []arr = {1,1,3,3,0,1,1};
        Stack<Integer> stack = new Stack<Integer>();
        int idx = 0;
        stack.push(arr[0]);

        for(int i : arr){
            if(i != stack.get(idx)){
                stack.push(i);
                idx++;
            }
        }
        int []answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++){
            answer[i] = stack.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
