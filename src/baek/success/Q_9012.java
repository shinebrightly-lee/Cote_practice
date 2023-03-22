package baek.success;

import java.io.*;

public class Q_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String Y_N = "YES";

        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < T; i++){
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if ("(".equals(input.substring(j,j+1))){ count1++; }
                else if (")".equals(input.substring(j,j+1))){ count2++; }
                if (count2 > count1){
                    Y_N = "NO";
                    break;
                }
            }
            if (count1 != count2) Y_N = "NO";
            System.out.println(Y_N);
            Y_N = "YES";
            count1 = 0;
            count2 = 0;
        }

    }
}
