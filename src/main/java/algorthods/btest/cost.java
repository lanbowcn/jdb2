package algorthods.btest;

import java.util.Arrays;
import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a = in.nextLine();
        String[] input = a.split(" ");
        int[] A = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i]=Integer.parseInt(input[i]);
        }

        Arrays.sort(A);
        int resut=Math.abs(A[1]-A[0])+Math.abs(A[2]-A[1]);
        System.out.println(resut);
    }
}
