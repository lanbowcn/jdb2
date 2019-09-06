package jdbc;

/**
 * @Author：lanbow
 * @Date:2019/8/30 19:55
 * @Version 1.0
 */
import java.util.*;

public class Main2 {




    public static void main(String[] args) {
        HashMap<Integer,List<Integer>> jilu = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] in = sc.nextLine().split(",");

            if (!in.equals("")){
                int ID = Integer.parseInt(in[0]);
                int time = Integer.parseInt(in[1]);
                int isin = Integer.parseInt(in[2]);
                System.out.println(ID);
                if (jilu.containsKey(ID)){
                    jilu.get(ID).add(time);
                }else{
                    List<Integer> a = new ArrayList<>();
                    a.add(time);
                    jilu.put(ID, a);
                }
            }else{
                System.out.println("--------------");
                for (Map.Entry x:jilu.entrySet()){
                    System.out.print(x.getKey()+",");
                    int sumtime = calutime((ArrayList)x.getValue());
                    System.out.print(sumtime);
                    System.out.println();
                }
            }
        }


    }

    private static int calutime(ArrayList num) {
        int sum = 0;
        for (int i = 0; i < num.size(); i+=2) {
            int online=num.indexOf(i+1)-num.indexOf(i);
            sum+=online;
        }
        return sum;
    }




}