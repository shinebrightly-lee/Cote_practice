package gist_1;

import java.util.*;

public class gist_1_6 {
    public static void main(String[] args) {
        /*
                1. 이재명, 2. 윤석열, 3. 심상정, 4. 안철수
                총 투표수 : 10,000
                각 투표수의 결과는 4명의 대선주자들이 동일한 비율로 랜덤하게 발생
                (단, 당선자는 동율불가)
                임의번호는 Random 함수의 nextInt() 활용
         */
        Random rd = new Random();
        int nan = 0;
        int[] candidate = new int[4];
        for (int i = 1; i <= 10000; i++){
            nan = rd.nextInt(3+1)+1;
            String name = nan == 1 ? "이재명" :
                          nan == 2 ? "윤석열" :
                          nan == 3 ? "심상정" : "안철수";
            candidate[nan-1] += 1;
           System.out.println(String.format("[투표진행율]: %.2f, %d명 투표 => %s",(((double)i /(double)10000) * 100.00),i,name));
           System.out.println(String.format("[기호:1] 이재명: %.2f, (투표수: %d)",( ((double)candidate[0]/(double)10000) *100.00),candidate[0]));
           System.out.println(String.format("[기호:2] 윤석열: %.2f, (투표수: %d)",( ((double)candidate[1]/(double)10000) *100.00),candidate[1]));
           System.out.println(String.format("[기호:3] 심상정: %.2f, (투표수: %d)",( ((double)candidate[2]/(double)10000) *100.00),candidate[2]));
           System.out.println(String.format("[기호:4] 안철수: %.2f, (투표수: %d)",( ((double)candidate[3]/(double)10000) *100.00),candidate[3]));
        }
        // 결과
        int resultInt = 0;
        for(int can : candidate){
            resultInt = Math.max(resultInt, can);
        }
        String resultStr =  candidate[0] == resultInt ? "이재명" :
                            candidate[1] == resultInt ? "윤석열" :
                            candidate[2] == resultInt ? "심상정" : "안철수";
        System.out.println("[투표결과] 당선인 : "+resultStr);
    }
}
