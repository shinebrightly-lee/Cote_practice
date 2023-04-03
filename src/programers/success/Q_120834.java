package programers.success;

public class Q_120834 {
    public static void main(String[] args) {
        int age = 51;
        String answer = "";
        String ageStr = Integer.toString(age);
        for(int i = 0; i < ageStr.length(); i++){
            answer += String.valueOf( (char)((ageStr.charAt(i)-48)+97) );
        }
        System.out.println(answer);
    }
}
