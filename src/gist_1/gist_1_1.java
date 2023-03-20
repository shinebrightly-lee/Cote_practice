package gist_1;
/*
    back-end school 11기 - 이명희
    코멘트 : 반드시 양의 정수만이 입력된다는 가정하에 작성하였습니다.
            예외처리가 필요할 경우 조건사항에 붙여주시는 거겠죠..?
            ( 아니라면 제시된 조건만이 아닌 스스로 예외를 생각해서 작성을 해야할까요? )
* */
public class gist_1_1 {
    public static void main(String[] args) {
        // 조건1 - 다중 반복문 이용
        // 조건2 - 내용에 맞도록 format 함수 이용
        // 조건3 - 1단-9단 출력

        System.out.println("[구구단 출력]");
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(String.format("%02d X %02d = %02d   ", j,i,j*i));
            }
                System.out.println();
        }

    }
}
