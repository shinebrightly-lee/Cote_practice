package gist_1;

import java.util.*;

public class gist_1_7 {
    public static void main(String[] args) {
        /*
                Scanner 사용
                1-45 사이 숫자 중 6개를 맞추면 당첨되는 복권
                로또 개수를 구매 (구매수량 입력) -> 당첨번호 생성
                -> 로또 당첨번호를 판단하는 프로그램 작성
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]"+System.lineSeparator());
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        int ea = sc.nextInt()+1;
        int[][] rotto = new int[ea][6];
        Random rd = new Random();
        char[] abc = {'A','B','C','D','E','F','G','H','I','J'};
        // 로또
        for (int i = 0; i < ea; i++){
            for (int j = 0; j < 6; j++){
                rotto[i][j] = rd.nextInt(45+1)+1;
                for(int n = 0; n < j; n++){ // 중복제거
                    if(rotto[i][j] == rotto[i][n]){
                        j--;
                    }
                }
            }
        }
        // 내가 구입한 로또
        for(int i = 0; i < rotto.length-1; i++){
            System.out.print(abc[i]+"   ");
            Arrays.sort(rotto[i]);
            for (int j = 0; j < rotto[i].length; j++){
                System.out.print(rotto[i][j]);
                if (j == rotto[i].length-1) continue;
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println();

        // 당첨 발표
        System.out.println("[로또 발표]");
        for (int i = rotto.length-1; i < rotto.length; i++){
            Arrays.sort(rotto[i]);
            System.out.print("    ");
            for (int j = 0; j < rotto[i].length; j++){
                System.out.print(rotto[i][j]);
                if (j == rotto[i].length-1) continue;
                System.out.print(",");
            }
        }
        System.out.println(System.lineSeparator());

        // 내 로또 결과
        int count = 0;
        for(int i = 0; i < rotto.length-1; i++){
            System.out.print(abc[i]+"   ");
            Arrays.sort(rotto[i]);
            for (int j = 0; j < rotto[i].length; j++){
                System.out.print(rotto[i][j]);
                for (int n = 0; n < 6; n++){
                    count += rotto[i][j] == rotto[rotto.length-1][n] ? 1 : 0;
                }
                if (j == rotto[i].length-1) {
                    System.out.printf(" => %d개 일치",count);
                    count = 0;
                    continue;
                }
                System.out.print(",");
            }
            System.out.println();
        }
        sc.close();
    }
}
