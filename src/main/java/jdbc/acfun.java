package jdbc;
import java.util.Scanner;

public class acfun{

        public static void main(String[] args) {

            //获取输入参数
            Scanner in = new Scanner(System.in);
            int n =in.nextInt();



            double sum = 0;
            //多次重复，取平均值
            for (int j = 0; j <30000 ; j++) {
                int sta = 0,min=0,max=0;
                for (int i = n; i >0 ; i--) {
                    double a =Math.random();

                    if(a>0.5)
                        sta++;
                    else
                        sta--;
                    min = Math.min(min,sta);
                    max = Math.max(max,sta);
                }
                System.out.println(min+"---"+max);
                sum=sum+max-min+1;
            }

            System.out.println(String.format("%.1f", sum/30000));


        }

}
