package algorthods.utl;

import java.util.Scanner;

//小易准备去拜访他的朋友，他的家在0点，但是他的朋友的家在x点(x > 0)，
// 均在一条坐标轴上。小易每一次可以向前走1，2，3，4或者5步。问小易最少走多少次可以到达他的朋友的家。
public class visit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        int round = visitRound(x);
        System.out.println(round);
    }

    private static int visitRound(int dis){
        int step;
        if (dis<=5){
            step = 1;
        }else{
            if (dis%5==0)
                step=dis/5;
            else
                step=dis/5+1;
        }
        return step;
    }
}
