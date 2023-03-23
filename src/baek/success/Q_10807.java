package baek.success;

import java.io.*;
import java.util.*;

public class Q_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            answer += Integer.parseInt(str[i]) == v ? 1 : 0;
        }
        System.out.println(answer);

    }
}
