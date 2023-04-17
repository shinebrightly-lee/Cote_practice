package test;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        for (int  p : priorities ) {
            q.add(p);
        }
        int max = Arrays.stream(priorities).max().getAsInt();
        while(q.contains(max)){
            if(q.peek() < max){
                q.add(q.peek());
                q.remove();
                answer++;
            }else {
                q.remove();
            }
        }
        System.out.println(answer);
//        int count = 0;
//        int max = Arrays.stream(priorities).max().getAsInt();
//        System.out.println(max);
//        for (int i = 0; i < priorities.length-1; i++){
//            if (priorities[i] != max){
//                count++;
//            }else { break; }
//        }
//        if((location-count) >= 0){
//            answer = (location-count)+1;
//        }else{
//            count = (location-count)*-1;
//            answer = (priorities.length-count)+1;
//        }
//        System.out.println(answer);
    }
}
