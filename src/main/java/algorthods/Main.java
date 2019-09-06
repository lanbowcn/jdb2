package algorthods;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/21 18:55
 * @Version 1.0
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(16);

        String[] input = new String[len-1];
        input=sc.nextLine().split(" ");



        for (int i = 0; i < input.length; i++) {
            if (input[i].equalsIgnoreCase("A")) {
                input[i] = "12 34";
                len++;
            }
            if (input[i].equalsIgnoreCase("B")) {
                input[i] = "AB CD";
                len++;
            }
            if (input[i].equals("c"))
                input[i]="C";
            if (input[i].equals("d"))
                input[i]="D";
            if (input[i].equals("e"))
                input[i]="E";
            if (input[i].equals("f"))
                input[i]="F";
        }


        System.out.print(Integer.toString(len, 16).toUpperCase());


//        for (StringTest i : input) {
//            System.out.print(i+" ");
//        }
        for (int i = 0; i < input.length; i++) {
            if (i!=input.length-1)
                System.out.print(input[i]+" ");
            if (i==input.length-1)
                System.out.print(input[i]);
        }


    }
}
