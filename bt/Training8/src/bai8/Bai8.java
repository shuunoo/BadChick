package bai8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bai8 {
    public void timKiem(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chars = str.toCharArray();

        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Character> keys = map.keySet();
        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println("Char " + ch + " " + map.get(ch));
            }
        }
    }

    public static void main(String a[]) {
        Bai8 obj = new Bai8();
        System.out.println("String: Xin Chao Cac Ban !!!");
        obj.timKiem("Xin Chao Cac Ban !!!");

    }
}
