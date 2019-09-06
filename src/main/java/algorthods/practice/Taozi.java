package algorthods.practice;

/**
 * @Author：lanbow
 * @Date:2019/8/14 15:37
 * @Version 1.0
 */
public class Taozi {
    public static int Taozi(int day) {
        if (day == 10)
            return 1;
        else
            return (Taozi(day + 1) + 1) * 2;

    }

    public static void main(String[] args) {
        System.out.println(Taozi(1));
    }
}
