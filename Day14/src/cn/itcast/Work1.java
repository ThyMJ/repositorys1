package cn.itcast;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
1.统计每个单词出现的次数
        2.有如下字符串"If you want to change your fate I think you must come to the dark horse to learn     java"(用空格间隔)
        3.打印格式：
        to=3
        think=1
        you=2
*/
public class Work1 {

    public static void main(String[] args) {

        String s = "If you want to change your fate I think you must come to the dark horse to learn     java";

        HashMap<String, Integer> hm = new HashMap<>();

        String[] sl = s.split(" ");

        for (int i = 0; i < sl.length; i++) {

            String c = sl[i];

            if (hm.containsKey(c)) {

                hm.put(c, hm.get(c) + 1);

            } else {

                hm.put(c, 1);
            }
        }
        Set<Map.Entry<String, Integer>> ent = hm.entrySet();

        for (Map.Entry<String, Integer> c1 : ent) {

            System.out.println(c1.getKey()+"="+c1.getValue());
        }

    }

}
