package gist_1;

import java.util.*;

public class gist_1_2 {
    public static void main(String[] args) {
        // 조건1 : scanner 사용 + 조건문 사용 하여 캐시백 적립조건에 맞게 캐시백 계산
        /*
            캐시백 적립 조건 : 결제금액의 10% 적립
            (단, 포인트 단위는 100이고, 한건의 캐시백 포인트는 300을 넘을 수 없다.)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int money = sc.nextInt();
        int cashBack = money >= 3000 ? 300 :
                        money >= 1000 ? (int)((money*0.1)/100)*100 : 0;
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",money,cashBack);
        sc.close();
    }
}
