package algorthods.btest;

import java.util.Arrays;
import java.util.Scanner;

public class attack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("hp---");
        int hp = Integer.parseInt(in.nextLine());

        System.out.println("na---");
        int na = Integer.parseInt(in.nextLine());
        System.out.println("ba---");
        int ba = Integer.parseInt(in.nextLine());

        int round = 0;

        System.out.println(hp/ba);

        if(ba<na*2){
            if(hp%na!=0)
                round = hp/na+1;
            else
                round=hp/na;
        }else{
            if(hp%ba==0)
                round=2*hp/ba;
            else {
                round=hp/ba;
                if(hp%ba>na)

                    round = 2*round+2;
                else
                    round = 2*round+1;
            }

        }

        System.out.println(round);

    }

}
