package programers.success;

import java.util.*;
// 100
//        progresses	                speeds  	            return
//        [93, 30, 55]	                [1, 30, 5]	            [2, 1]
//        [95, 90, 99, 99, 80, 99]	    [1, 1, 1, 1, 1, 1]	    [1, 3, 2]
// arrayList or linkedList
public class Q_42586 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        for (int i = 0; i < progresses.length; i++){
            progresses[i] = (100-progresses[i])%speeds[i] == 0 ?
                    (100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i]+1;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        String str = "";
        int count = 0;
        int num = 0;
        for (int i = 0; i < progresses.length; i++){
            if (i==0){ num = progresses[0];
            }else if (progresses[i] > num){
                num = progresses[i];
                arrayList.add(count);
//                str += count + " ";
                count = 0;
            }
            count++;
        }
        arrayList.add(count);
        System.out.println(arrayList);
        arrayList.toArray(); // arraylist -> array
//        str += count;
//        String[] arr = str.split(" ");
//        int[] answer = new int[arr.length];
//        int idx = 0;
//        for (String c : arr){
//            answer[idx] = Integer.parseInt(c);
//            idx++;
//        }
//        System.out.println(Arrays.toString(answer));
    }
}
