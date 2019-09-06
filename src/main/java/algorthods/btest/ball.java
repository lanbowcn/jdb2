package algorthods.btest;
import java.util.Arrays;
import java.util.Scanner;
public class ball {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int ans[]=new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = sc.nextInt();
        }

        Arrays.sort(ans);
        int[][] dis = new int[n][n];
        for (int i = 0; i < n; i++) {
            int left=0,right=0;
            for (int j = 0; j <= i; j++) {
                if(i==j)
                    dis[i][j]=0;
                else {
                    if (ans[i]-ans[j]<l-ans[i]+ans[j])
                        dis[i][j]=ans[i]-ans[j]-1-(right++);
                    else
                        dis[i][j]=l-ans[i]+ans[j]-1-(left++);
//                    dis[j][i]=dis[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(dis[i][j]);
            }
        }

        int result =Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum+=dis[i][j];
            }
            result=Math.min(result,sum);

        }

        System.out.println(result);
    }

}
