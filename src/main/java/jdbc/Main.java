
package jdbc;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashMap<Integer, List<Long>> jilu = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            String xx = sc.nextLine();
            if (xx.equals("")) {
                break;
            } else {
                String[] in = xx.split(",");
                int ID = Integer.parseInt(in[0]);
                long time = Integer.parseInt(in[1]);
                int isin = Integer.parseInt(in[2]);
                if (jilu.containsKey(ID)) {
                    jilu.get(ID).add(time);
                } else {
                    List<Long> a = new ArrayList<>();
                    a.add(time);
                    jilu.put(ID, a);
                }

            }


        }
        for (Map.Entry x : jilu.entrySet()) {
            System.out.print(x.getKey() + ",");
            Long sumtime = calutime((ArrayList) x.getValue());
            System.out.print(sumtime);
            System.out.println();
        }


    }


    private static Long calutime(ArrayList num) {

        Long sum = 0L;
        for (int i = 0; i < num.size(); i += 2) {
            Long online = (Long) num.get(i + 1) - (Long) num.get(i);
            //System.out.println(num.indexOf(i + 1)+"+"+num.indexOf(i));
            sum += online;
        }
        return sum;
    }

}