package Test;

import SwordtoOffer.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


/**
 * @Author：lanbow
 * @Date:2019/9/6 18:52
 * @Version 1.0
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int[] high = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            high[i] = Integer.parseInt(n[i]);
        }

        int v = maxWater(high);
        System.out.println(v);

    }

    private static int maxWater(int[] high) {
        int l = 0;
        int r = high.length-1;
        int res=0;
        while(l<r){
            res = Math.max(res,(r-l)*Math.min(high[l],high[r]));
            if (high[l]<high[r]){
                l++;
            }else
                r--;
        }
       return  res;
    }
    public static void chess(char[][] input){
        if (input==null||input.length<3||input[0].length<3)
            return;
        int row = input.length;
        int col = input[0].length;
        for (int i = 0; i < col; i++) {
            dfs(input,0,i);
            dfs(input,row-1,i);
        }
        for (int i = 0; i < row; i++) {
            dfs(input,i,0);
            dfs(input,i,col-1);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ('Y'==input[i][j])
                    input[i][j]='O';
                else if ('O'==input[i][j])
                    input[i][j]='X';
            }
        }
    }

    public static void dfs(char[][] input, int i, int j) {
        if (i<0||i>input.length-1||j<0||j>input[0].length-1)
            return;
        if ('O'!=input[i][j]){
            return;
        }
        input[i][j]='Y';
        dfs(input,i-1,j);
        dfs(input,i+1,j);
        dfs(input,i,j-1);
        dfs(input,i,j+1);
    }

    public static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next!=null)
            return slow.next;
        else
            return slow;
    }

    public int minCost(int[] days, int[] costs) {
        int[] tour = new int[396];
        for (int i :days) {
            tour[i+30]=1;
        }
        for (int i = 31; i < tour.length; i++) {
            if (tour[i]==0)
                tour[i] = tour[i-1];
            else
                tour[i] = Math.min(Math.min(tour[i-1]+costs[0],tour[i-7]+costs[1]),tour[i-30]+costs[2]);
        }
        return tour[tour.length-1];
    }

}

