package programers.fail;

import java.util.*;

public class Q_81301 {
    public static void main(String[] args) {

        String s = "23four5six7";

        Map<String, String> map = new HashMap<String, String>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        StringBuilder str = new StringBuilder();
        str.append(s);
        StringBuilder delStr = new StringBuilder();
        while (str.length() > 0){
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (str.indexOf(key) == 0 || str.indexOf(value) == 0 ){
                    delStr.append(value);
                    if (str.indexOf(key) != -1) {
                        str.delete(0, key.length());
                        break;
                    } else if (str.indexOf(value) != -1) {
                        str.delete(0, 1);
                        break;
                    }
                }
            }
        }
        int answer = Integer.parseInt(Integer.toString(Integer.parseInt(delStr.toString())));
        // 일부 시간초과 실패
    }
}
