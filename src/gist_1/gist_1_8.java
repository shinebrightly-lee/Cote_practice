package gist_1;

import java.util.*;

public class gist_1_8 {
    public static void main(String[] args) {
        /*
                Scanner 사용

                1년간의 소득(납세의 의무) 세금 납부
                    12,000,000 이하 6%
                    12,000,000 초과, 46,000,000 이하 15%        -   1,080,000
                    46,000,000 초과, 88,000,000 이하 24%        -   5,220,000
                    88,000,000 초과, 150,000,000 이하 35%       -   14,900,000
                    150,000,000 초과, 300,000,000 이하 38%      -   19,400,000
                    300,000,000 초과, 500,000,000 이하 40%      -   25,400,000
                    500,000,000 초과, 1,000,000,000 이하 42%    -   35,400,000
                    1,000,000,000 초과 45%                     -   65,400,000
         */

        System.out.println("[과세금액 계산 프로그램]");
        Scanner sc = new Scanner(System.in);
        System.out.print("연소득을 입력해 주세요.:");
        int annualIncome = sc.nextInt();

        int tax =  annualIncome <= 12000000 ? (int)(annualIncome*0.06) :
                    annualIncome <= 46000000 ? (int)(annualIncome*0.15)-1080000 :
                    annualIncome <= 88000000 ? (int)(annualIncome*0.24)-5220000 :
                    annualIncome <= 150000000 ? (int)(annualIncome*0.35)-14900000 :
                    annualIncome <= 300000000 ? (int)(annualIncome*0.38)-19400000 :
                    annualIncome <= 500000000 ? (int)(annualIncome*0.40)-25400000 :
                    annualIncome <= 1000000000 ? (int)(annualIncome*0.42)-35400000 : (int)(annualIncome*0.45)-65400000;

        System.out.println(String.format("[세율에 의한 세금]:                 %d",tax));
        System.out.printf("[누진공제 계산에 의한 세금]:          %d",tax );

        // 조건 추가해서 작성 해야하는데 시간이 없는 관계로 다 작성하지 못함 ( 원래 배점 20점 )
    }
}
