package programers;

public class Q_81301 {
    public static void main(String[] args) {
        int answer = 0;
        String s = "23four5six7";
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<10;i++){
            s=s.replace(num[i],Integer.toString(i));
        }
        answer = Integer.parseInt(s);
    }
}
