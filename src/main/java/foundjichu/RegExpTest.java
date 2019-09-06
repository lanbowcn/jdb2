package foundjichu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

/**
 * @Author：lanbow
 * @Date:2019/8/25 19:59
 * @Version 1.0
 */
class RegExpTest {
    public static void main(String[] args) {
        java.lang.String str = "北京市(朝阳区)(西城区)(海淀区)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);
        if(m.find()) {
            System.out.println(m.group());
        }
    }

}
