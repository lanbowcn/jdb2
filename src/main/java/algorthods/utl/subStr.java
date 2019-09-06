package algorthods.utl;

import java.util.HashSet;

/**
 * @Author：lanbow
 * @Date:2019/8/18 22:11
 * @Version 1.0
 *
 *
 *
 *
 * 记下左右边界
 * https://www.jianshu.com/p/8739bed84efa
 */
public class subStr {
    public static  int lengthOfLongestSubstring(String s) {
        int[] pos = new int[256];
        int res=0,left=0;
        for (int i = 0; i < s.length(); i++) {
            left = Math.max(left,pos[s.charAt(i)]);
            res =Math.max(res,i-left+1);
            pos[s.charAt(i)] = i+1;
        }
        return res;
    }
    public static  int lengthOfLongestSubstring2(String s) {
        HashSet<Character> pos = new HashSet<>();
        int res=0,left=0,right=0;
        while(right<s.length()){
            if (!pos.contains(s.charAt(right))){
                pos.add(s.charAt(right));
                right++;
            }else{
                pos.remove(s.charAt(left));
                left++;
            }
            res = Math.max(res,pos.size());

        }
        return res;
    }
    public static String delSpace(StringBuilder a ){
        char[] b = a.toString().toCharArray();
        String res = "";
        for (char i:b) {
            String temp = String.valueOf(i);
            if (i!=' '){
                res+=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "bsd awe  qweqfa";
        System.out.println(lengthOfLongestSubstring2(s));
        StringBuilder a =new StringBuilder("bsd awe  qweqfa");
        System.out.println(delSpace(a).toUpperCase());
    }
}
