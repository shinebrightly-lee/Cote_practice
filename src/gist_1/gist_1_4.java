package gist_1;

import java.util.*;

public class gist_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            입력값으로 생년,월,일 및 성별과 임의의 번호를 통해서 생성
            이 때, 임의의번호는 Random 함수의 nextInt()함수를 통해서 생성

                    남 : 1, 여 : 2
            2020부터 남 : 3, 여 : 4

           주의 : 원래 주민번호라면 211210 이런식이지만
                 해당문제에서는 화면예시를 그대로 따르면 연도를 전체 출력 20211210
         */
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int yyyy = sc.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm):");
        int mm = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        int dd = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.next();

        if(2020 > yyyy){
            gender = "m".equals(gender) ? "1":"2";
        }else{
            gender = "m".equals(gender) ? "3":"4";
        }

        Random rd = new Random();
        for (int i = 0; i < 6; i++){
            gender += Integer.toString(rd.nextInt(10));
        }

        System.out.printf("%d%02d%02d-%s",yyyy,mm,dd,gender);
        sc.close();
    }
}
