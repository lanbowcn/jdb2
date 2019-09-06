package algorthods.practice.xiaozhaozhengti.wangyi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author：lanbow
 * @Date:2019/8/24 13:29
 * @Version 1.0
 */
public class NNfindJob {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            TreeMap<Integer, Integer> jobs = new TreeMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int diff = sc.nextInt();
                int pay = sc.nextInt();
                if (jobs.containsKey(diff)) {
                    jobs.put(diff, Math.max(jobs.get(diff), pay));
                } else
                    jobs.put(diff, pay);
            }

            int max = 0;
            for (int i : jobs.keySet()) {
                max = Math.max(max, jobs.get(i));
                jobs.put(i, max);
            }

            for (int i = 0; i < m; i++) {
                int b = sc.nextInt();
                Map.Entry<Integer, Integer> job = jobs.floorEntry(b);
                if (job == null)
                    System.out.println(0);
                else
                    System.out.println(job.getValue());
            }


        }

}
