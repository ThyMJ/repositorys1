package cn.itcast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*符分析以下需求，并用代码实现
        1.产生10个1-20之间的随机数要求随机数不能重复
        2.产生10个长度为10的不能重复的字串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出*/
public class Work3 {

    public static void main(String[] args) {

        HashSet<String> al = new HashSet<>();

        String s = "";
        for (char x = 'a', y = 'A'; x <= 'z'; x++, y++) {

            s += x;
            s += y;
        }
        for (int i = 0; i <= 9; i++) {
            s += i;
        }
        System.out.println(s);

        String[] sp = s.split("");

        Random r = new Random();

        while (al.size() < 10) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 10; i++) {

                int index = r.nextInt(sp.length);

               sb.append(sp[index]);
            }
            al.add(sb.toString());
        }
        for (String s1 : al) {
            System.out.print(s1+"\t");
        }
    }


}
