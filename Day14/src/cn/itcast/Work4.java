package cn.itcast;

import java.util.*;

public class Work4 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        ArrayList<Integer> ts = new ArrayList<>();

        String[] s2 = {"红桃", "梅花", "方片", "黑桃"};
        String[] s1 = {"3", "4", "5", "6", "7", "8", "9", "10", "j", "Q", "K", "A", "2"};
        int index = 0;
        String s = "";
        for (int i = 0; i < s1.length; i++) {

            for (int i1 = 0; i1 < s2.length; i1++) {

                s = s1[i] + s2[i1];

                ts.add(index);

                hm.put(index, s);

                index++;
            }
        }
        ts.add(index);
        hm.put(index, "小王");
        ts.add(++index);
        hm.put(index, "大王");

        /*Set<Map.Entry<Integer, String>> ent = hm.entrySet();

        for (Map.Entry<Integer, String> is : ent) {
            System.out.println(is.getKey()+"="+is.getValue());
        }
        System.out.println(ts);
*/
        Collections.shuffle(ts);

        TreeSet<Integer> plary1 = new TreeSet<>();
        TreeSet<Integer> plary2 = new TreeSet<>();
        TreeSet<Integer> plary3 = new TreeSet<>();
        TreeSet<Integer> dk = new TreeSet<>();

        for (int i = 0; i < ts.size(); i++) {

            Integer tg = ts.get(i);

            if (i >= ts.size() - 3) {

                dk.add(tg);
            } else if (i % 3 == 0) {

                plary1.add(tg);
            } else if (i % 3 == 1) {

                plary2.add(tg);
            } else if (i % 3 == 2) {

                plary3.add(tg);
            }
        }
        seepoker("张三",hm,plary1);
        seepoker("李四",hm,plary2);
        seepoker("王五",hm,plary3);
        seepoker("底牌",hm,dk);
    }

    public static void seepoker(String name, HashMap<Integer,String> hm, TreeSet<Integer> plary) {

        System.out.print(name + "的牌是:");

        for (Integer ig : plary) {

            System.out.print(hm.get(ig)+" ");
        }
        System.out.println();
    }

}
