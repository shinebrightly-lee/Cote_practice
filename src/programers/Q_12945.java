package programers;

import java.math.*;

public class Q_12945 {
    public static void main(String[] args) {
        int n = 5;
//        System.out.println((n-1)%1234567);
//        System.out.println((n-2)%1234567);
//        System.out.println(answer);
        int[] pi = new int[n+1];
        pi[0] = 0;
        pi[1] = 1;
        for (int i = 2; i <= n; i++){
            pi[i] = pi[i-2] + pi[i-1];
        }
        BigInteger num1 = new BigInteger(Integer.toString(pi[n-1]%1234567));
        BigInteger num2 = new BigInteger(Integer.toString(pi[n-2]%1234567));
        System.out.println(num1.add(num2));
        int answer = num1.add(num2).intValue();
    }
}
