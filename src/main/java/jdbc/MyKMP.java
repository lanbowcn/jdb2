package jdbc;

/**
 * @Author：lanbow
 * @Date:2019/8/30 0:41
 * @Version 1.0
 */
public class MyKMP {
    public static int KMPmy(String s, String m) {
        if (s == null || m == null || m.length() < 1 || s.length() < m.length())
            return -1;
        char[] ss = s.toCharArray();
        char[] mm = m.toCharArray();
        int si = 0;
        int mi = 0;
        int[] next = getNext(mm);
        while (si < ss.length && mi < mm.length) {
            if (mi == -1 || ss[si] ==mm[mi]){
                mi++;
                si++;
            }else{
                mi = next[mi];
            }
        }
        return mi == mm.length ? si - mi : -1;
    }

    private static int[] getNext(char[] p) {
        int[] next = new int[p.length];
        // 第一位设为-1，方便判断当前位置是否为搜索词的最开始
        next[0] = -1;
        int i = 0;
        int j = -1;

        while(i < p.length - 1) {
            if (j == -1 || p[i] == p[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }

        return next;
    }
    public static int KMPmy2(String s, String m) {
        char[] ss = s.toCharArray();
        char[] mm = m.toCharArray();
        int[] next = getNext2(mm);
        int si=0;
        int mi = 0;
        while(si<ss.length&&mi<mm.length){
            if (mi==-1||ss[si]==mm[mi]){
                mi++;
                si++;
            }else{
                mi = next[mi];
            }
        }
        return mi==mm.length?si-mi:-1;
    }
    private static int[] getNext2(char[] p) {
        int[] next = new int[p.length];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while(i<p.length-1){
            if (j==-1||p[i]==p[j]){
                i++;
                j++;
                next[i]=j;
            }else{
                j=next[j];
            }
        }
        return next;
    }
    public static void main(String[] args) {
        String str = "abcabcababaccc";
        String match = "ababa";
        System.out.println(KMPmy2(str, match));

    }
}
