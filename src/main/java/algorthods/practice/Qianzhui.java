package algorthods.practice;

/**
 * @Author：lanbow
 * @Date:2019/8/20 23:42
 * @Version 1.0
 */
public class Qianzhui {
    public static void main(String[] args) {
//        StringTest[] front = {"aaaa","aadd","aacc","abcd"};
        String[] front = {"abcd", "abda", "abcc", "abcd"};
        System.out.println(findsame(front));
    }

    private static String findsame(String[] front) {
        int minlen = front[0].length();
        for (int i = 0; i < front.length; i++) {
            minlen = Math.min(minlen, front[i].length());
        }
        String res = "";
        out:
        for (int i = 0; i < minlen; i++) {
            char x = front[0].charAt(i);

            for (int j = 0; j < front.length; j++) {
                if (front[j].charAt(i) != x)
                    break out;
            }
            res += x;
            System.out.println(res);
        }
        return res;
    }
}
