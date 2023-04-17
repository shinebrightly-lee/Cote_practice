package test;

public class reStudy {
    static int[][] cache = new int[101][101];
    static int bino(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        if (cache[n][r] != 0){
            return cache[n][r];
        }
        cache[n][r] = bino(n - 1, r) + bino(n - 1, r - 1);

        return cache[n][r];
    }
    public static void main(String[] args) {
        System.out.println(bino(100,15));
    }
}
