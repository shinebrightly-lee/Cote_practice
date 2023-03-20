package gist_1;

import java.util.*;

public class gist_1_5 {
    public static void main(String[] args) {
        /*
               Scanner 로 연도 및 월을 입력받음
               날짜는 LocalDate Class 를 이용
               ( Calender or Date Class 도 이용 가능 )
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int yyyy = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요:(mm):");
        int mm = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(yyyy,mm-1,1);
        int start = cal.get(Calendar.DAY_OF_WEEK)-1;//시작요일
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH)); // 마지막주 구하기 위한 셋팅
        int week = cal.get(Calendar.WEEK_OF_MONTH);// 총 몇주
        int day = cal.get(Calendar.DAY_OF_MONTH);// 마지막 일
        int dd = 1; // 일 수 카운팅

        System.out.println(String.format("[%d년 %02d월]",yyyy,mm));
        System.out.println("일    월   화   수    목   금   토");
        for (int i=0; i < week; i++){ // 주
            for (int j=0; j < 7; j++){ // 일 - 토
                if ((i==0)&&(start>0)){ // 첫째주 - 시작 요일 맞추기
                    start--;
                    System.out.print("     ");
                }else { // 첫째주가 아닌 모든 주
                    System.out.printf("%02d   ", dd);
                    dd++;
                    if (dd > day) break; // 요일 다찍었으면 반복문 탈출
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
