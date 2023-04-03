package programers;

public class Q_120907 {
    public static void main(String[] args) {
        String[] quiz = {"-3 + 4 = -3", "-10000 + -10000 = -20000"};
        int idx = 0;
        for(String q : quiz ){
            q = q.replace(" ","");
            int x = 0;
            int y = 0;
            int result = 0;
            int stop = 0;
            for (int i = q.length()-1; i >= 0 ; i--) {
                if ("=".equals(Character.toString(q.charAt(i)))){
                    result = Integer.parseInt(q.substring(i+1));
                    stop = i;
                } else if ("+".equals(Character.toString(q.charAt(i)))) {
                    y = Integer.parseInt(q.substring(i+1, stop));
                    stop = i;
                    x = Integer.parseInt(q.substring(0, stop));
                    break;
                } else if (stop != 0 && "-".equals(Character.toString(q.charAt(i)))) {
                    y = Integer.parseInt(q.substring(i, stop));
                    if("+".equals(q.substring(i-1, i))){
                        i--;
                    }
                    stop = i;
                    x = Integer.parseInt(q.substring(0, stop));
                    break;
                }
            }
                quiz[idx] = x+y == result ? "O" : "X";
                idx++;
            System.out.println(x+y == result);
        }
    }
}
