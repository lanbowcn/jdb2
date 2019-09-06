package algorthods.btest;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math.*;
public class fangcha {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans[]=new double[n];
        for(int i = 0; i < n; i++){
            ans[i] = sc.nextInt();
        }

        Arrays.sort(ans);

        double min = Double.MAX_VALUE;
        for (int i = 0; i <= ans.length-3; i++) {
            //jisuan fangcha
            double avg = (ans[i]+ans[i+1]+ans[i+2])/3;
//            double res = (ans[i]*ans[i]-avg*avg+ans[i+1]*ans[i+1]-avg*avg+ans[i+2]*ans[i+2]-avg*avg)/3;
            double res = ((ans[i]-avg)*(ans[i]-avg)+(ans[i+1]-avg)*(ans[i+1]-avg)+(ans[i+2]-avg)*(ans[i+2]-avg))/3;

            min=Math.min(min,res);
        }
        System.out.println(String.format("%.2f", min));

    }






}
