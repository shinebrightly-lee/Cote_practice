package programers.success;

public class Q_12951 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if( i == 0 || s.charAt(i-1) == ' ' ){
                if( s.charAt(i) >= 97 && s.charAt(i) <= 122 ){
                    sb.append((char)(s.charAt(i)-32));
                    continue;
                }
            }else if( s.charAt(i) >= 65 && s.charAt(i) <= 90 ){
                sb.append((char)(s.charAt(i)+32));
                continue;
            }
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
