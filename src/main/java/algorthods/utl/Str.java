package algorthods.utl;

import java.util.HashSet;
import java.util.Set;

public class Str {
    public static void main(String[] args) {
        String a ="leetcode";
        Set<String> v = new HashSet<>();
        v.add("leet");
        v.add("code");
        System.out.println(seg(a,v));
    }

    public static boolean seg(String s,Set<String> dict){
        int len = s.length();
        boolean[] state =new boolean[len+1];
        state[0]=true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if(state[j]==true&&dict.contains(s.substring(j,i))){
                    state[i]=true;
                    break;
                }
            }
        }
        return state[len];
    }


    public static boolean wordBreak2(String s, Set<String> dict){
        int len = s.length();
        boolean[] arrays = new boolean[len+1];
        arrays[0] = true;
        for (int i = 1; i <= len; ++i){
            for (int j = 0; j < i; ++j){
                if (arrays[j] && dict.contains(s.substring(j, i))){
                    arrays[i] = true;
                    break;
                }
            }
        }
        return arrays[len];
    }
}
