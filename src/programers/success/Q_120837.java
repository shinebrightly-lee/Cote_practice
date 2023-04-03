package programers.success;

public class Q_120837 {
    public static void main(String[] args) {
        // 장군 : 5 / 병정 : 3 / 일 : 1
        int hp = 23;
        int answer = 0;
        while(hp > 0){
            if(hp >= 5){
                answer += hp/5;
                hp = hp%5;
            }else if(hp >= 3){
                answer += hp/3;
                hp = hp%3;
            }else{
                answer += hp;
                hp = 0;
            }
        }
        System.out.println(answer);
    }
}
