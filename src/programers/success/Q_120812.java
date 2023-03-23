package programers.success;

import java.util.*;

public class Q_120812 {
    public static void main(String[] args) {
        int answer = 0;
        int[] array = {1, 1, 2, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array){
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i, map.get(i)+1);
            }
        }
        int maxCount = 0;
        for(Integer i : map.keySet()){
            if (Collections.max(map.values()) == map.get(i)){
                maxCount++;
                answer = i;
            }
            if (maxCount > 1) {
                answer = -1;
                break;
            }
        }
        System.out.println(answer);
    }
}
