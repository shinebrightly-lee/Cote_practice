package gist_1;

import java.util.*;

public class gist_1_3 {
    public static void main(String[] args) {
        /*
            놀이공원 입장료
            1. 3세미만 무료입장
            2. 복지카드 및 국가유공자의 경우 일반할인 적용
            3. 13세미만이면 특별할인 적용
            4. 17시 이후 입장하면 특별할인 적용

            기본 - 10_000
            특별할인 - 4_000
            일반할인 - 8_000
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();
        System.out.print("국가 유공자 여부를 입력 해주세요.(y/n):");
        String 국가유공자 = sc.next();
        System.out.print("복지 여부를 입력 해주세요.(y/n):");
        String 복지카드 = sc.next();

        int 입장료 = age < 3 ? 0 :
                    age < 13 ? 4000 :
                    time > 17 ? 4000 :
                    ("y".equals(복지카드))||("y".equals(국가유공자)) ? 8000 :  10000;

        System.out.printf("입장료 : %d",입장료);
        sc.close();
    }
}
