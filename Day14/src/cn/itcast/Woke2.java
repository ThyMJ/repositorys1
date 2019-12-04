package cn.itcast;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//分析以下需求，并用代码实现
//        1.利用键盘录入，输入一个字符串
//        2.统计该字符串中各个字符的数量(提示:字符不用排序)
//        3.如：
//        用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
//        程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
public class Woke2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();

        HashMap<String, Integer> hm = new HashMap<>();

        String[] sl = line.split("");

        for (int i = 0; i < sl.length; i++) {

            String c = sl[i];
            if (hm.containsKey(c)) {

                hm.put(c, hm.get(c) + 1);

            } else {

                hm.put(c, 1);
            }
        }
        Set<Map.Entry<String, Integer>> ent = hm.entrySet();
        for (Map.Entry<String, Integer> st : ent) {
            System.out.print(st.getKey() + "(" + st.getValue() + ")");
        }
    }

}
