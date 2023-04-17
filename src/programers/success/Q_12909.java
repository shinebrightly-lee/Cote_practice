package programers.success;

import java.util.*;

public class Q_12909 {
    public static void main(String[] args) {
        String s = "(())()";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if('(' == s.charAt(i)){
                stack.push(s.charAt(i));
            }else{
//                if(stack.empty()) return false;
                stack.pop();
            }
        }
        System.out.println(stack.empty());
    }
}
